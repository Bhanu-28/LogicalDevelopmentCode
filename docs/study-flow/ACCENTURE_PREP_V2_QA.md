# 📖 ACCENTURE PREP V2 — Q&A REFERENCE
> Role: Custom Software Engineer | Java Full Stack + Debugging + GenAI
> Read alongside: ACCENTURE_PREP_V2_SCHEDULE.md

---

# SECTION A — JAVA CORE + SPRING BOOT

**Q: What are the 4 pillars of OOP?**
Encapsulation (private fields + getters/setters), Inheritance (IS-A, extends), Polymorphism (overloading/overriding), Abstraction (interface/abstract class hides implementation).

**Q: Abstract Class vs Interface?**
- Abstract class: can have state + concrete methods, single inheritance
- Interface: contract only, multiple inheritance, Java 8+ allows default methods
- Rule: IS-A relationship → abstract class. CAN-DO capability → interface.

**Q: HashMap internal working?**
Array of buckets (default 16). `put(k,v)` → `hashCode(k)` → bucket index → store. Collision → linked list (Java 8+: Red-Black Tree if >8 entries). Load factor 0.75 → rehash at 75% full. `get(k)` → same hash → `.equals()` to match exact key. Average O(1), worst O(log n).

**Q: ArrayList vs LinkedList?**
- ArrayList: backed by Object[] array, capacity 10, grows 1.5x. O(1) random access, O(n) insert/delete middle.
- LinkedList: doubly linked nodes. O(1) insert/delete at ends, O(n) random access. More memory.

**Q: What is @Transactional?**
Wraps method in a DB transaction. Any exception → full rollback. Put on service layer. Propagation (REQUIRED, REQUIRES_NEW) and isolation levels configurable.

**Q: N+1 problem in JPA?**
Fetching a list of entities + lazily loading their collections = 1 query for list + N queries for each item's collection. Fix: `JOIN FETCH` in JPQL or `@EntityGraph`.

**Q: How does JWT work?**
1. Login → server validates credentials → creates JWT (Base64 header + payload + HMAC signature)
2. Client sends `Authorization: Bearer <token>` on each request
3. Server validates signature → extracts claims → no session storage needed (stateless)

**Q: Spring Security filter chain?**
Request → `DelegatingFilterProxy` → `SecurityFilterChain` → `UsernamePasswordAuthenticationFilter` → `AuthenticationManager` → `UserDetailsService` → `SecurityContextHolder`

**Q: Java 8 features?**
Lambda, Stream API, Optional, default interface methods, LocalDate/LocalDateTime, Method references, CompletableFuture.

**Q: What is @RestControllerAdvice?**
Global exception handler. `@ExceptionHandler(SpecificException.class)` catches across all controllers, returns proper ResponseEntity with status code.

---

# SECTION B — SQL + LOG ANALYSIS

**Q: Write a query to find employees earning more than their manager.**
```sql
SELECT e.name
FROM Employee e JOIN Employee m ON e.managerId = m.id
WHERE e.salary > m.salary;
```

**Q: Find the second highest salary.**
```sql
SELECT MAX(salary) FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);
```

**Q: Find duplicate records.**
```sql
SELECT name, COUNT(*) as cnt
FROM Employee
GROUP BY name HAVING COUNT(*) > 1;
```

**Q: Window function — running total of errors per day.**
```sql
SELECT service, log_date, error_count,
       SUM(error_count) OVER (PARTITION BY service ORDER BY log_date) as running_total
FROM daily_error_summary;
```

**Q: How would you query logs to find systemic issues?**
"I would group errors by message and service, count frequency over a rolling time window, and flag any pattern appearing more than a threshold number of times. Then I'd look at the timestamps to identify if errors correlate with specific deployments or traffic spikes — that's root cause analysis through data."

**Q: How do you approach log analysis for a reported bug?**
"First I reproduce the issue and identify the timestamp. Then I query logs around that window — filter by ERROR level, the affected service, and the user ID if available. I look for the stack trace, correlate with any upstream service calls, and check if the same pattern appears for other users — to distinguish a one-off from a systemic bug."

**Q: What is a dashboard in this context?**
A set of SQL queries or visualization (Grafana, Kibana) that shows: error rates over time, top failing services, user impact count, SLA breach alerts. I'd create these as parameterized SQL views or scheduled reports.

---

# SECTION C — API DEBUGGING + VALIDATION

**Q: How do you validate an API is working correctly?**
"I check: (1) correct HTTP status code for each scenario — 200 for success, 201 for create, 404 for not found, 400 for bad input, 500 for server error. (2) Response body has all expected fields with correct types. (3) Response time is within acceptable SLA. (4) Error responses have a consistent error message structure. I use Postman for manual validation and write Python scripts for automated validation."

**Q: What is the difference between 400 and 422?**
- 400 Bad Request: malformed request syntax, missing required parameter
- 422 Unprocessable Entity: request is well-formed but semantically invalid (e.g., email field contains non-email value)

**Q: What is JSON and how do you parse it in Python?**
```python
import json

# Parse JSON string
data = json.loads('{"name": "Bhanu", "role": "Engineer"}')
print(data["name"])  # Bhanu

# Parse JSON file
with open("response.json") as f:
    data = json.load(f)

# Write JSON
json.dumps(data, indent=2)
```

**Q: Common regex patterns for log parsing?**
```python
import re

# Extract timestamp, level, message from log line
pattern = r'(?P<timestamp>\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}) (?P<level>\w+) (?P<message>.*)'
match = re.search(pattern, log_line)
if match:
    print(match.group('level'))   # ERROR
    print(match.group('timestamp'))

# Find all IP addresses
ips = re.findall(r'\b\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}\b', text)

# Find all email addresses
emails = re.findall(r'[\w.-]+@[\w.-]+\.\w+', text)
```

---

# SECTION D — TRIAGE + DEBUGGING METHODOLOGY

**Q: How do you approach a bug report?**
"I follow a structured triage process:
1. **Reproduce** — can I replicate the issue? What exact steps? Which environment?
2. **Isolate** — is it UI, API, database, or infrastructure? Frontend or backend?
3. **Classify** — bug (unexpected behavior), feature request (missing behavior), or config issue?
4. **Severity** — P1 (production down), P2 (major feature broken), P3 (minor, workaround exists)
5. **Evidence** — collect logs, screenshots, API response payloads, error stack traces
6. **Root cause** — trace back to the originating code or config change
7. **Engineering spec** — document with reproduction steps, expected vs actual, logs attached"

**Q: What is the difference between a bug and a feature request?**
- **Bug:** System does something it shouldn't, or fails to do what it's documented to do
- **Feature request:** System works as designed but user wants different behavior
- **Important:** Always validate against original requirements before classifying

**Q: What is SLA vs KPI?**
- **SLA** (Service Level Agreement): contractual commitment — e.g., "P1 bugs resolved within 4 hours"
- **KPI** (Key Performance Indicator): measurement metric — e.g., "triage completion rate 95%", "mean time to resolution"

**Q: At KPIT, how did you do debugging?**
"At KPIT, I resolved 500+ Sonar violations — each required understanding why the code was flagged, tracing the actual risk (not just the lint), and refactoring safely without breaking functionality. I also debugged Docker networking issues when containerizing a Windows diagnostic tool — no documentation existed for that specific Windows container setup, so I used systematic elimination: isolated each network config variable, tested incrementally, and documented the solution for the team."

---

# SECTION E — PYTHON FOR THIS ROLE

**Q: Why Python in this role?**
"This role involves log analysis, JSON parsing, and API validation — all tasks Python handles elegantly. I used Python in my HighRadius internship for data cleaning with Pandas, NumPy, and feature engineering. I can write quick scripts to automate repetitive triage tasks, parse log files with regex, or validate API payloads programmatically."

**Q: How do you read and analyze a log file in Python?**
```python
from collections import Counter
import re

error_counts = Counter()

with open("app.log") as f:
    for line in f:
        match = re.search(r'(\w+) service=(\S+)', line)
        if match and match.group(1) == "ERROR":
            error_counts[match.group(2)] += 1

# Top 3 failing services
for service, count in error_counts.most_common(3):
    print(f"{service}: {count} errors")
```

**Q: How do you call and validate a REST API in Python?**
```python
import requests, time

def test_endpoint(url, expected_status):
    start = time.time()
    r = requests.get(url)
    elapsed = round((time.time() - start) * 1000, 2)
    status = "PASS" if r.status_code == expected_status else "FAIL"
    print(f"{status} | {url} | {r.status_code} | {elapsed}ms")
    return r.json()

test_endpoint("http://localhost:8080/students", 200)
```

---

# SECTION F — MICROSERVICES (CONDENSED)

**Story script:** "I designed a scalable e-commerce backend with Product, Order, User, and Inventory services — each with its own Spring Boot app and database. Netflix Eureka handles service discovery. Spring Cloud Gateway is the single entry point — validates JWT, routes to services. Resilience4j Circuit Breaker prevents cascading failures. At KPIT, I also containerized a legacy Windows EXE diagnostic tool into Docker — dealt with Windows container limitations, achieved 70% image size reduction."

**K8s story:** "In the CI/CD project, I configured Kubernetes Horizontal Pod Autoscaler — scales pods based on CPU utilization between min 2 and max 10 replicas. Jenkins automates build → test → Docker push → kubectl apply. This cut deployment time from hours to 15 minutes."

| Term | One-line answer |
|------|----------------|
| Eureka | Service registry — services register, gateway discovers by name not IP |
| API Gateway | Single entry point — routing, auth, rate limiting |
| Circuit Breaker | If service fails X times → open circuit → fallback runs → auto-recover |
| HPA | Auto-scales K8s pods based on CPU/memory metrics |

---

# SECTION G — GENAI CONCEPTS

> **Your edge:** You're doing Coursera Agentic AI course. Use it aggressively.

**Q: What is an LLM?**
Large Language Model — a neural network trained on massive text data to predict the next token. Examples: GPT-4 (OpenAI), Claude (Anthropic), Gemini (Google). They generate text, answer questions, write code, summarize documents.

**Q: What is prompt engineering?**
The practice of crafting inputs to LLMs to get better outputs. Key techniques:
- **Zero-shot:** just ask the question directly
- **Few-shot:** provide 2-3 examples before the question
- **Chain of thought:** ask the model to "think step by step"
- **System prompt:** set the role/context: "You are a senior Java engineer..."

**Q: What is RAG (Retrieval-Augmented Generation)?**
Instead of relying only on LLM's training data, RAG retrieves relevant documents from a vector database first, then passes them as context to the LLM. Result: accurate, up-to-date answers grounded in real data. Used in chatbots, support systems, documentation Q&A.

**Q: What is the difference between ChatGPT, Claude, and Gemini?**
- **ChatGPT (OpenAI GPT-4o):** Most widely used, strong at coding and reasoning
- **Claude (Anthropic):** Known for long context window, nuanced reasoning, safety
- **Gemini (Google):** Multimodal (text + image + code), integrated with Google services

**Q: What is model evaluation / hallucination?**
- **Hallucination:** LLM generates confident but factually incorrect output
- **Evaluation:** Testing LLM output for accuracy, relevance, groundedness
- Metrics: BLEU (text similarity), ROUGE (recall-based), human evaluation

**Q: How is GenAI relevant to this role?**
"This role involves triage and log analysis. GenAI can assist by: (1) auto-classifying bug reports using an LLM, (2) summarizing long log files into actionable insights, (3) generating engineering-ready specs from raw user reports. I'm actively learning agentic AI patterns on Coursera — I understand how to integrate LLMs into engineering workflows."

---

# SECTION H — HR BEHAVIORAL (STAR FORMAT)

**"Tell me about yourself"** (practice 5x out loud)
"I'm a Software Engineer at KPIT Technologies with close to 3 years of experience in Java backend development, Spring Boot, Python, and DevOps. I've delivered high-impact solutions — a caching feature improving performance by 80%, containerizing a legacy Windows tool reducing image size by 70%, and cleaning 500+ code violations improving maintainability by 92%.

I also have Python experience from my HighRadius ML internship where I built predictive models using Pandas and NumPy. And I'm currently doing a Coursera course on Agentic AI — so GenAI is very much in my active learning stack.

I'm drawn to this Custom Software Engineer role at Accenture because it combines what I do best — systematic debugging and root cause analysis — with Java full stack, which is my core strength."

---

**"Tell me about a challenging bug you solved."**
STAR: At KPIT, I was given a legacy diagnostic Windows EXE that needed Dockerization. No documentation for Windows containers existed. I isolated each variable — networking, volumes, base image — systematically. Built and tested incrementally. Result: 70% image size reduction, fully automated pipeline. Won Highflyer Award.

---

**"How do you handle multiple issues at once?"**
"I triage by severity first — production-down issues get immediate attention, lower priority issues get queued. I use a classification system: P1/P2/P3 based on user impact and scope. I communicate status proactively so stakeholders aren't left wondering. At KPIT, I handled multiple parallel Sonar violation categories simultaneously by batching similar issue types together — it's more efficient than fixing one at a time."

---

**"Why this role specifically?"**
"The JD says 'software detectives' — that's exactly how I think about engineering. At KPIT I wasn't just fixing code, I was investigating why 500+ violations existed, why the Docker container was failing, why the testing took 4 days. I want a role where systematic investigation is the core skill, not a side activity. This role also has Python, SQL, and GenAI — all areas I've touched and want to deepen."

---

**"Questions to ask them"**
1. "What does the triage lifecycle look like from issue reported to engineering ticket raised?"
2. "How is GenAI currently being used or explored in this team's workflow?"
3. "What does success look like in the first 90 days?"

---

# SECTION I — RESUME GAP BRIDGING

**"You mention Python — what specifically have you done?"**
"At HighRadius, I used Python for the full ML lifecycle — data cleaning with Pandas, feature engineering, and training regression models for payment delay prediction. The outputs were integrated into a Java + React full stack app. For this role, I've also recently written Python scripts for log parsing with regex and API validation using the requests library."

**"How comfortable are you with log analysis tools?"**
"I've worked with Jenkins build logs extensively — diagnosing pipeline failures requires reading through large log files and identifying the root cause quickly. I've also used SonarQube's issue dashboard to analyze code quality trends across a large codebase. I've built a Python log analyzer script that uses regex to extract patterns from log files and outputs JSON summary reports."

**"Have you worked with A/B testing?"**
"Not directly, but I understand the concept — two variants run simultaneously, traffic split, metrics compared. In my GenAI coursework, I've studied how prompt variations affect model output — which is essentially prompt A/B testing. In a production context, I'd approach A/B testing analysis by querying the metrics tables and looking for statistically significant differences in KPIs between variants."

---

# SECTION J — DS INTERNALS (Quick Reference)

| Structure | Backed By | Get | Insert | Delete | Use Case |
|-----------|-----------|-----|--------|--------|----------|
| HashMap | Array of buckets (LL/Tree) | O(1) avg | O(1) avg | O(1) avg | Key-value cache, frequency count |
| ArrayList | Object[] array | O(1) | O(n) middle | O(n) middle | Random access list |
| LinkedList | Doubly linked nodes | O(n) | O(1) ends | O(1) ends | Queue, frequent head/tail ops |
| Stack (ArrayDeque) | Circular array | O(1) top | O(1) push | O(1) pop | Undo, parentheses, DFS |
| PriorityQueue | Binary min-heap array | O(1) peek | O(log n) | O(log n) | Top-K, scheduling |

**What you used at KPIT:**
"In the Workspace Caching Feature, I used **HashMap** — workspace IDs as keys, computed results as values. O(1) retrieval instead of DB queries = 80% performance improvement. In Robot Framework automation, I used **Lists and Maps** to store test parameters and ECU state mappings. For the diagnostic API's request queue, I used a **Queue** (FIFO) to process incoming diagnostic commands in order."

---

# SECTION K — ANGULAR (Quick 10 Q&A)

1. **Component:** Template + styles + TypeScript class. Decorator: `@Component`
2. **Service:** `@Injectable` class for shared logic/API calls. Singleton via DI.
3. **Observable vs Promise:** Observable = lazy, multiple values, cancellable, operators. Promise = eager, single value.
4. **Two-way binding:** `[(ngModel)]` — input changes reflect in component and vice versa.
5. **Routing:** `RouterModule` maps paths to components. `<router-outlet>` renders active component.
6. **DI:** Angular's DI provides service instances to components automatically.
7. **Pipe:** Transform displayed data. `{{ value | date:'dd/MM' }}`. Custom pipes with `@Pipe`.
8. **ngOnInit:** Lifecycle hook — runs after DI setup. Use for API calls, not constructor.
9. **RxJS switchMap:** Cancels previous observable when new one emits. Used for search inputs.
10. **Your KPIT answer:** "I built the Angular frontend for the Workspace Caching Feature — components, services with RxJS observables for async API calls, and resolved bugs across the existing codebase."

---

# 🔑 KEY IMPACT STATEMENTS

1. "Improved data retrieval by 80% using HashMap-based caching"
2. "Resolved 500+ code violations — systematic triage, reduced complexity by 92%"
3. "Converted Windows EXE to Docker API — 70% image size reduction"
4. "Reduced testing time from 4 days to 6 hours via Robot Framework automation"
5. "Built ML payment prediction system — Python, Pandas, Regression, Java integration"
6. "Currently learning Agentic AI — RAG, LangGraph, multi-agent systems"
7. "CI/CD pipeline: Jenkins → Docker → K8s HPA → 15-minute deployments"
