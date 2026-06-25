# Senior Automation / SDET Interview Theoretical Questions

This README contains topic-wise theoretical questions and answers commonly asked for Senior Automation Engineer and SDET Engineer interviews.

## 1. Automation Framework Design

### Q1. What are the key components of a good automation framework?

**Answer:**
A good automation framework should include reusable page or screen objects, test data management, configuration management, reporting, logging, assertions, reusable utilities, CI/CD integration, parallel execution support, and environment handling. It should be easy to maintain, scalable, readable, and independent of hard-coded test data.

### Q2. What makes an automation framework scalable?

**Answer:**
A framework is scalable when new test cases, modules, browsers, environments, and data sets can be added with minimal code changes. Scalability comes from clean separation of test logic, page actions, test data, configuration, and reusable utilities.

### Q3. How do you reduce maintenance in an automation framework?

**Answer:**
Maintenance can be reduced by avoiding duplicate code, using page object models, keeping locators centralized, writing stable waits, avoiding hard-coded values, creating reusable methods, and reviewing tests regularly to remove flaky or obsolete scenarios.

### Q4. What is the difference between a test script and a test framework?

**Answer:**
A test script validates a specific scenario. A test framework is the complete structure that supports writing, running, reporting, maintaining, and scaling many test scripts in a consistent way.

## 2. Selenium WebDriver

### Q1. What is Selenium WebDriver?

**Answer:**
Selenium WebDriver is a browser automation tool that interacts directly with browsers using browser-specific drivers. It supports actions like clicking, typing, selecting values, navigating pages, and validating UI behavior.

### Q2. What is the difference between implicit wait and explicit wait?

**Answer:**
Implicit wait applies globally and tells WebDriver to wait for elements for a fixed time before throwing an exception. Explicit wait is condition-based and waits for a specific condition, such as visibility, clickability, or presence of an element. Explicit waits are preferred because they are more controlled and reliable.

### Q3. How do you handle flaky Selenium tests?

**Answer:**
Flaky tests can be handled by using proper explicit waits, stable locators, avoiding static sleeps, isolating test data, making tests independent, improving environment stability, and adding better logging or screenshots for debugging.

### Q4. What are common causes of `StaleElementReferenceException`?

**Answer:**
This exception occurs when the DOM changes after WebDriver has already found an element. It commonly happens after page refresh, AJAX updates, re-rendered components, or navigation. The solution is to locate the element again after the DOM update.

## 3. API Testing

### Q1. What do you validate in API testing?

**Answer:**
In API testing, we validate status codes, response body, response schema, headers, cookies, error messages, response time, authentication, authorization, data correctness, and integration with downstream systems.

### Q2. What is the difference between PUT and PATCH?

**Answer:**
PUT usually replaces the complete resource, while PATCH updates only selected fields of the resource. PUT is generally used for full updates, and PATCH is used for partial updates.

### Q3. What are idempotent HTTP methods?

**Answer:**
An idempotent method gives the same result even when called multiple times with the same input. GET, PUT, DELETE, HEAD, and OPTIONS are considered idempotent. POST is usually not idempotent because it can create multiple resources.

### Q4. How do you test negative API scenarios?

**Answer:**
Negative API testing includes sending invalid payloads, missing required fields, invalid data types, expired tokens, unauthorized requests, invalid endpoints, boundary values, duplicate requests, and unsupported HTTP methods.

## 4. TestNG / JUnit

### Q1. Why do we use TestNG or JUnit in automation?

**Answer:**
TestNG and JUnit are testing frameworks used to organize, execute, and manage automated tests. They provide annotations, assertions, test grouping, setup and teardown methods, parameterization, reporting support, and integration with build tools.

### Q2. What is the use of annotations in TestNG?

**Answer:**
Annotations define the execution flow of tests. Common TestNG annotations include `@BeforeSuite`, `@BeforeTest`, `@BeforeClass`, `@BeforeMethod`, `@Test`, `@AfterMethod`, `@AfterClass`, `@AfterTest`, and `@AfterSuite`.

### Q3. What is the difference between `@BeforeMethod` and `@BeforeClass`?

**Answer:**
`@BeforeMethod` runs before every test method, while `@BeforeClass` runs once before the first test method in the class. `@BeforeMethod` is useful for test-level setup, and `@BeforeClass` is useful for class-level setup.

### Q4. How do you run tests in parallel using TestNG?

**Answer:**
Parallel execution can be configured in the `testng.xml` file using attributes such as `parallel="methods"`, `parallel="classes"`, or `parallel="tests"` along with `thread-count`. The framework must be thread-safe before enabling parallel execution.

## 5. Java, OOP, and Collections

### Q1. What OOP concepts are important for automation?

**Answer:**
Important OOP concepts include encapsulation, inheritance, polymorphism, and abstraction. These concepts help create reusable page classes, utility classes, interfaces, base classes, and maintainable test architecture.

### Q2. How is encapsulation used in automation?

**Answer:**
Encapsulation is used by keeping locators and page actions inside page classes and exposing only meaningful methods to test classes. This hides implementation details and improves maintainability.

### Q3. What is the difference between `ArrayList` and `HashSet`?

**Answer:**
`ArrayList` maintains insertion order and allows duplicate values. `HashSet` does not allow duplicates and does not guarantee insertion order. Use `ArrayList` when order matters and duplicates are allowed; use `HashSet` when uniqueness matters.

### Q4. Why is `HashMap` useful in automation?

**Answer:**
`HashMap` stores key-value pairs and is useful for test data, request payload fields, configuration values, headers, and mapping expected results with actual values.

## 6. Page Object Model and Design Patterns

### Q1. What is Page Object Model?

**Answer:**
Page Object Model is a design pattern where each application page is represented by a separate class. Locators and page actions are kept inside the page class, while test classes call page methods to perform business flows.

### Q2. What are the benefits of Page Object Model?

**Answer:**
It improves code reusability, readability, maintainability, and separation of concerns. When UI locators change, updates are usually limited to the page class instead of many test cases.

### Q3. What design patterns are commonly used in automation frameworks?

**Answer:**
Common design patterns include Page Object Model, Factory Pattern, Singleton Pattern, Builder Pattern, Strategy Pattern, and Fluent Interface. These patterns help manage object creation, driver handling, test data, and readable test flows.

### Q4. What is the Singleton Pattern and where can it be used?

**Answer:**
Singleton ensures only one instance of a class is created. It can be used for configuration readers, report managers, or logger setup. For WebDriver, it must be used carefully because parallel execution requires separate driver instances per thread.

## 7. CI/CD and Build Tools

### Q1. Why is CI/CD important for automation testing?

**Answer:**
CI/CD helps run automated tests regularly after code changes, pull requests, deployments, or scheduled builds. It gives faster feedback, catches regressions early, and improves release confidence.

### Q2. How do you integrate automation tests with Jenkins?

**Answer:**
Automation tests can be integrated with Jenkins by configuring source control checkout, installing required dependencies, running Maven or Gradle commands, passing environment parameters, publishing reports, and setting notifications for build results.

### Q3. What is the role of Maven or Gradle in test automation?

**Answer:**
Maven and Gradle manage dependencies, compile code, run tests, define build lifecycle, and integrate with CI/CD tools. They make test execution consistent across local machines and build servers.

### Q4. What should be done when CI tests fail?

**Answer:**
Check whether the failure is due to an application defect, test issue, test data issue, environment issue, or infrastructure issue. Logs, screenshots, reports, API responses, and build history should be reviewed before marking the test as flaky.

## 8. BDD and Cucumber

### Q1. What is BDD?

**Answer:**
BDD stands for Behavior Driven Development. It focuses on describing application behavior in business-readable language using examples. It helps collaboration between QA, developers, product owners, and business stakeholders.

### Q2. What is a feature file in Cucumber?

**Answer:**
A feature file contains scenarios written in Gherkin syntax using keywords such as `Feature`, `Scenario`, `Given`, `When`, `Then`, `And`, and `But`. It describes expected application behavior in readable steps.

### Q3. What are step definitions?

**Answer:**
Step definitions are code methods that map Gherkin steps to automation logic. They connect business-readable scenarios with actual test execution code.

### Q4. What are common mistakes in BDD automation?

**Answer:**
Common mistakes include writing very technical steps, duplicating step definitions, putting too much logic in step files, creating long scenarios, and using BDD only as a scripting format instead of a collaboration approach.

## 9. Test Strategy and Test Planning

### Q1. What should be included in a test strategy?

**Answer:**
A test strategy should include scope, test levels, automation approach, tools, environments, test data, responsibilities, risks, entry and exit criteria, reporting process, defect management, and CI/CD integration.

### Q2. How do you decide what to automate?

**Answer:**
Good candidates for automation include stable, repetitive, high-risk, business-critical, data-driven, and regression-heavy scenarios. Scenarios that change frequently, require heavy visual judgment, or are rarely executed may not be good candidates.

### Q3. What is the test pyramid?

**Answer:**
The test pyramid is a testing strategy that recommends many unit tests, fewer API or integration tests, and fewer UI end-to-end tests. It helps improve speed, reliability, and maintainability of test suites.

### Q4. How do you prioritize test cases?

**Answer:**
Test cases are prioritized based on business impact, risk, frequency of use, defect history, customer impact, complexity, and dependency on other modules.

## 10. SQL and Database Testing

### Q1. What do you validate in database testing?

**Answer:**
Database testing validates data correctness, schema, constraints, joins, stored procedures, triggers, data integrity, transactions, and data consistency between application UI, APIs, and the database.

### Q2. What is the difference between INNER JOIN and LEFT JOIN?

**Answer:**
INNER JOIN returns only matching records from both tables. LEFT JOIN returns all records from the left table and matching records from the right table. If there is no match, right table columns return null.

### Q3. What is a primary key?

**Answer:**
A primary key uniquely identifies each record in a table. It cannot contain null values and should be unique.

### Q4. What is transaction testing?

**Answer:**
Transaction testing verifies that database operations follow ACID properties: atomicity, consistency, isolation, and durability. It ensures data is committed or rolled back correctly.

## 11. Performance and Reliability Testing

### Q1. What is performance testing?

**Answer:**
Performance testing evaluates how an application behaves under expected or heavy load. It measures response time, throughput, resource utilization, scalability, and stability.

### Q2. What is the difference between load testing and stress testing?

**Answer:**
Load testing checks system behavior under expected user load. Stress testing pushes the system beyond normal limits to find breaking points and recovery behavior.

### Q3. What metrics are important in performance testing?

**Answer:**
Important metrics include response time, throughput, error rate, requests per second, CPU usage, memory usage, database performance, network latency, and concurrent users.

### Q4. How do you identify performance bottlenecks?

**Answer:**
Bottlenecks can be identified using application logs, APM tools, database query analysis, server metrics, network monitoring, thread dumps, heap dumps, and performance test reports.

## 12. Debugging, Logging, and Reporting

### Q1. What information should automation logs contain?

**Answer:**
Logs should contain test name, execution steps, input data, environment, browser or platform, timestamps, API requests and responses when needed, failure messages, screenshots, and stack traces.

### Q2. Why are screenshots useful in UI automation?

**Answer:**
Screenshots help identify the application state at the time of failure. They are useful for debugging UI issues, validation failures, synchronization issues, and unexpected popups.

### Q3. What should a good automation report show?

**Answer:**
A good report should show total tests executed, passed tests, failed tests, skipped tests, failure reasons, execution time, environment details, screenshots, logs, and historical trends if available.

### Q4. How do you debug a failed automation test?

**Answer:**
Start by reading the error message and stack trace, then check logs, screenshots, test data, environment status, recent code changes, locator changes, API responses, and whether the failure is reproducible locally.

## 13. Agile, Defect Management, and Collaboration

### Q1. What is the role of an SDET in Agile?

**Answer:**
An SDET contributes to test planning, automation, exploratory testing, code reviews, CI/CD quality checks, defect analysis, risk identification, and collaboration with developers and product owners throughout the sprint.

### Q2. What details should be included in a defect report?

**Answer:**
A defect report should include title, environment, build version, steps to reproduce, expected result, actual result, severity, priority, screenshots or logs, test data, and reproducibility details.

### Q3. What is the difference between severity and priority?

**Answer:**
Severity describes the technical or business impact of a defect. Priority defines how soon the defect should be fixed. A defect can have high severity but low priority, or low severity but high priority depending on business context.

### Q4. How do you handle a disagreement with a developer about a defect?

**Answer:**
Use evidence such as requirements, acceptance criteria, logs, screenshots, API responses, and user impact. Discuss the issue objectively and involve the product owner or business analyst if clarification is needed.

## 14. Senior-Level Scenario Questions

### Q1. How would you design automation for a new web application from scratch?

**Answer:**
First understand business flows, technology stack, environments, release process, and risk areas. Then choose tools, define framework structure, create coding standards, implement smoke and regression suites, integrate with CI/CD, add reporting, and gradually expand coverage based on business priority.

### Q2. How would you improve an existing flaky automation suite?

**Answer:**
Analyze failure patterns, separate real defects from test issues, remove static waits, improve synchronization, stabilize locators, isolate test data, make tests independent, clean up environment dependencies, and track flaky tests until their root causes are fixed.

### Q3. How do you measure automation success?

**Answer:**
Automation success should be measured by faster feedback, reduced regression effort, reliable execution, useful defect detection, maintainability, business risk coverage, CI/CD adoption, and reduced manual repetition. High test count alone is not a good success metric.

### Q4. What qualities are expected from a senior SDET?

**Answer:**
A senior SDET should understand testing deeply, write reliable automation code, design scalable frameworks, mentor team members, collaborate across roles, analyze risks, improve CI/CD quality gates, debug failures efficiently, and make practical quality decisions.

## 15. Senior Selenium Automation Scenario Questions

### Q1. Your Selenium test passes locally but fails in Jenkins. How would you debug it?

**Answer:**
First compare local and Jenkins environments, including browser version, driver version, OS, screen resolution, environment URL, test data, and execution mode. Then check Jenkins console logs, screenshots, videos if available, application logs, and failure stack traces. Common causes include timing issues, headless browser differences, missing test data, environment instability, dependency mismatch, and parallel execution conflicts.

### Q2. How would you handle dynamic elements whose IDs change on every page load?

**Answer:**
Avoid using fully dynamic IDs. Use stable attributes such as name, placeholder, aria-label, text, class combinations, parent-child relationships, CSS selectors, XPath with `contains()`, or data-test attributes if available. If no stable locator exists, discuss adding automation-friendly attributes with developers.

### Q3. A button is visible on the screen, but Selenium throws `ElementClickInterceptedException`. What would you do?

**Answer:**
This usually happens when another element overlays the target, such as a loader, sticky header, popup, animation, or disabled state. I would wait for overlays to disappear, wait until the element is clickable, scroll it into view, verify its enabled state, and inspect whether another element is receiving the click. JavaScript click should be used only as a last option because it can hide real user-facing issues.

### Q4. How would you automate a page that loads data through AJAX calls?

**Answer:**
Use explicit waits based on application behavior instead of static sleeps. Wait for specific elements, table rows, loaders to disappear, network-dependent UI states, or expected text to appear. If the framework supports it, API or database validation can be combined with UI validation to confirm data correctness.

### Q5. How would you handle a Selenium test that fails randomly due to slow page loading?

**Answer:**
I would identify the exact unstable step, remove hard waits, add proper explicit waits, wait for page-ready conditions, and check whether backend API latency is causing the issue. I would also add logging around page load time and element wait time. If the application itself is slow, the issue should be reported instead of only increasing timeouts.

### Q6. How do you design Selenium tests for parallel execution?

**Answer:**
Each test should have an isolated WebDriver instance, usually managed with `ThreadLocal`. Test data should be independent, shared mutable state should be avoided, reports should be thread-safe, and browser sessions should be closed properly. Tests should not depend on execution order.

### Q7. How would you handle multiple browser windows or tabs?

**Answer:**
Store the parent window handle, perform the action that opens a new window or tab, wait until the number of windows increases, switch to the new handle, complete validations, close the child window if needed, and switch back to the parent window.

### Q8. How would you automate file upload in Selenium?

**Answer:**
If the file input element is available, use `sendKeys()` with the absolute file path. For custom upload controls, inspect whether there is a hidden input element. OS-level dialogs should be avoided where possible because Selenium cannot directly control native file dialogs.

### Q9. How would you automate file download validation?

**Answer:**
Configure the browser download directory, trigger the download, wait until the file appears, verify the file name, extension, size, and content if required. Also handle temporary download extensions such as `.crdownload` in Chrome until the download is complete.

### Q10. How would you handle authentication popups in Selenium?

**Answer:**
For basic authentication, credentials can often be passed in the URL or configured through browser capabilities. For application login forms, use normal UI automation. For SSO, MFA, or enterprise login flows, it is better to use test-specific authentication strategies, API token setup, bypass mechanisms in lower environments, or pre-authenticated sessions where allowed by security policy.

### Q11. How would you handle CAPTCHA in automation?

**Answer:**
CAPTCHA should not be automated because it is designed to block automation. In test environments, the recommended approach is to disable CAPTCHA, use a test bypass key, mock the verification service, or validate CAPTCHA behavior separately through controlled testing.

### Q12. How would you test a web table with pagination, sorting, and filtering?

**Answer:**
Validate table headers, row data, sorting order, filter results, pagination controls, page size, empty state, and boundary conditions. For large data sets, compare UI values with API or database results instead of validating every record manually through the UI.

### Q13. How would you handle shadow DOM elements in Selenium?

**Answer:**
Use Selenium's shadow root support or JavaScript execution to access elements inside shadow DOM. The test should first locate the shadow host, get the shadow root, and then find child elements inside it. Locators should still be stable and readable.

### Q14. How would you automate drag and drop functionality?

**Answer:**
Start with Selenium `Actions` class using click-and-hold, move, and release operations. If HTML5 drag and drop does not work reliably, use JavaScript-based drag and drop helper logic or validate the behavior at a lower level if the UI implementation makes browser automation unreliable.

### Q15. How do you decide whether a scenario should be automated through UI or API?

**Answer:**
Use UI automation for critical user journeys, visual workflows, and browser-specific behavior. Use API automation for business logic, data validation, negative scenarios, integration checks, and high-volume regression. A senior engineer should avoid testing everything through UI because UI tests are slower and more fragile.

### Q16. How would you handle test data creation for Selenium tests?

**Answer:**
Prefer creating test data through APIs, database scripts, or backend utilities before the UI test starts. UI should be used to validate the user journey, not to spend excessive time preparing data. Test data should be unique, isolated, reusable where safe, and cleaned up when needed.

### Q17. How would you handle modal dialogs and popups?

**Answer:**
For JavaScript alerts, use Selenium alert handling methods. For HTML modals, treat them like normal web elements and wait for them to become visible. Validate modal title, content, buttons, close behavior, and whether the background page is blocked as expected.

### Q18. What would you do if locators frequently break after every release?

**Answer:**
Analyze why locators are unstable and move away from brittle XPath or layout-based selectors. Prefer unique automation attributes such as `data-testid`, stable IDs, accessibility attributes, or meaningful CSS selectors. I would also work with developers to make testability part of the development process.

### Q19. How would you reduce execution time for a large Selenium regression suite?

**Answer:**
Run tests in parallel, split suites by priority, move suitable checks to API level, remove duplicate scenarios, optimize waits, avoid unnecessary login steps by using session setup where appropriate, and execute smoke tests first. Long-running UI suites should be reviewed regularly for value.

### Q20. How would you handle browser compatibility testing?

**Answer:**
Identify supported browsers and versions from product requirements, run core smoke and critical flows across those browsers, and use Selenium Grid, cloud platforms, or containerized browsers for coverage. Browser-specific failures should be isolated with logs, screenshots, capabilities, and version details.

### Q21. How would you handle a scenario where an element is present in DOM but not visible?

**Answer:**
Presence in DOM does not mean the user can interact with the element. I would wait for visibility or clickability, check CSS properties, scroll behavior, overlays, hidden parent elements, and application state. Selenium actions should match real user behavior as much as possible.

### Q22. How would you validate UI and database consistency?

**Answer:**
Perform the user action through UI, capture the key business value, then validate the corresponding database record or API response. The test should avoid direct database dependency unless it is stable and approved for the test environment.

### Q23. How would you handle browser notifications in Selenium?

**Answer:**
Browser notifications can be controlled using browser options or capabilities before launching the browser. Depending on the scenario, notifications can be disabled for normal tests or explicitly enabled when notification behavior is part of the requirement.

### Q24. What is your approach when a Selenium test exposes a real product bug?

**Answer:**
Confirm the failure is reproducible, collect screenshots, logs, test data, environment details, and exact steps. Then create a defect with clear expected and actual results. The automation test should remain in the suite if the scenario is valid, but it may be marked or tracked appropriately until the defect is fixed.

### Q25. How would you design Selenium automation for a microservices-based application?

**Answer:**
Keep Selenium focused on end-to-end user journeys and use API tests for service-level validation. Test data should be created through APIs or backend utilities. Failures should include enough logging to identify whether the issue is in UI, gateway, backend service, database, or third-party integration.
