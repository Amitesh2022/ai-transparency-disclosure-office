# AI Transparency Disclosure Office

## One-sentence benefit
Helps AI providers and deployers coordinate interaction notices, content marking and disclosure evidence.

## Live demo
Run the Java service and React application locally to use the complete experience.

## Screenshots
![transparency review workspace](docs/screenshot.png)

## Main features
Search and sort transparency reviews, add validated actions, move work through approval, and see live priorities and progress.

## Technology used
React, TypeScript, TanStack Query, Wouter, Vite, Spring Boot and Java.

## Installation instructions
Start the backend with `cd backend && mvn spring-boot:run`. In another terminal run `npm install && npm run dev`.

## Commercial licensing/contact
Commercial licensing and implementation support are available through the repository owner.

## Business problem and users
AI providers, deployers, media teams, public authorities and compliance officers need a shared view of disclosure gaps, content marking and accountable owners.

## Key workflows
Teams can find a transparency review, create an action, validate required details, and advance it from draft to review and closure.

## React framework highlights
The interface uses focused components, controlled forms, route-based pages, query caching and mutation-driven API updates.

## Java backend highlights
The Spring Boot service provides real list, search, create and update endpoints, validation, clear errors, health reporting and tests.

## Architecture and state flow
React reads server state through TanStack Query. Successful mutations invalidate the shared list so the latest backend record is shown.

## Accessibility and responsive behaviour
Semantic regions, explicit labels, visible focus, status text, strong contrast and compact mobile layouts support keyboard and small-screen use.

## Verification commands
Use `npm test`, `npm run lint`, `npm run build`, and `cd backend && mvn test package`.

## Structure
`src` contains the React experience, `backend` contains the Java service, and `docs` contains verified media.

## Tradeoffs
The demonstration keeps records in memory for a fast local start; production use would add persistent storage, identity and audit retention.

## Roadmap
Add content-type benchmarks, disclosure planning templates, user-notice feedback, machine-readable marking evidence and durable audit storage.
