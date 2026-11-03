package com.portfolio.platform;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

@Service
public class WorkspaceService {
  private final AtomicLong ids = new AtomicLong(3);
  private final List<WorkspaceItem> items = new ArrayList<>(List.of(
      new WorkspaceItem(1L, "European generative-content marking review", "European AI Innovation Team", "Review", "High"),
      new WorkspaceItem(2L, "Belgian health-model compute request", "Belgian Digital Transparency Office", "Closed", "Medium"),
      new WorkspaceItem(3L, "Brussels synthetic-media labelling review", "Brussels AI Transparency Office", "Draft", "Low")));

  public synchronized List<WorkspaceItem> find(String query) {
    if (query == null || query.isBlank()) return List.copyOf(items);
    var needle = query.toLowerCase(Locale.ROOT);
    return items.stream().filter(item -> (item.title() + " " + item.owner() + " " + item.status()).toLowerCase(Locale.ROOT).contains(needle)).toList();
  }

  public synchronized WorkspaceItem create(WorkspaceItem request) {
    var saved = new WorkspaceItem(ids.incrementAndGet(), request.title(), request.owner(), request.status(), request.priority());
    items.add(saved);
    return saved;
  }

  public synchronized WorkspaceItem update(long id, WorkspaceItem request) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).id() == id) {
        var saved = new WorkspaceItem(id, request.title(), request.owner(), request.status(), request.priority());
        items.set(i, saved);
        return saved;
      }
    }
    throw new ItemNotFoundException(id);
  }
}
