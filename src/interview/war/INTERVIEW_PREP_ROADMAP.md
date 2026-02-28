# 🚀 Bhanu's Complete Preparation Roadmap

> **Profile:** 3 yrs Software Engineer @ KPIT | Java, Docker, Angular, Python | College: Data Science, R Programming | IBM Gen AI Certification (partial)
> **Immediate Goal:** AI/ML & Gen AI Engineer Interview — **Feb 28, 2026 (Pune, Offline)**
> **Long-term Goal:** DSA mastery in 3 months via GFG Course

---

# PART 1: AI/ML Interview Crash Course (Feb 26–28)

> [!CAUTION]
> You have **~2.5 days**. The strategy is NOT to learn everything deeply — it's to **build a coherent story** around what you know, fill critical gaps, and be able to **explain projects confidently**. Interviewers value clarity of thought over depth at this stage.

## Your Strengths to Leverage
- ✅ Python programming
- ✅ Software engineering experience (Java, Docker, Angular) — shows you can build production systems
- ✅ College exposure to Data Science, R, regression models
- ✅ IBM Gen AI cert — at least 1 module done genuinely (LangChain basics)
- ✅ You understand how software systems work end-to-end

---

## Day 1 — Feb 26 (Wed): ML Fundamentals + Classical ML

**Morning (3 hrs): Core ML Concepts**

| Topic | What to Know | Resource |
|-------|-------------|----------|
| Supervised vs Unsupervised vs Reinforcement Learning | Definitions, examples, when to use each | [StatQuest YouTube Playlist](https://www.youtube.com/playlist?list=PLblh5JKOoLUICTaGLRoHQDuF_7q2GfuJF) — Watch first 5 videos |
| Bias-Variance Tradeoff | Underfitting vs Overfitting, how to balance | [StatQuest: Bias & Variance](https://www.youtube.com/watch?v=EuBBz3bI-aA) |
| Train/Test/Validation Split | Why we split, cross-validation | Same playlist |
| Evaluation Metrics | Accuracy, Precision, Recall, F1, AUC-ROC, RMSE, MAE | [Krish Naik: ML Metrics](https://www.youtube.com/watch?v=2osIZ-dSPGE) |

**Afternoon (3 hrs): Key Algorithms (Know Intuition, Not Math)**

| Algorithm | Key Intuition | Resource |
|-----------|---------------|----------|
| Linear Regression | Line of best fit, minimize error | [StatQuest: Linear Regression](https://www.youtube.com/watch?v=PaFPbb66DxQ) |
| Logistic Regression | Classification using sigmoid | [StatQuest: Logistic Regression](https://www.youtube.com/watch?v=yIYKR4sgzI8) |
| Decision Trees | If-else tree, information gain/gini | [StatQuest: Decision Trees](https://www.youtube.com/watch?v=7VeUPuFGJHk) |
| Random Forest | Ensemble of decision trees, bagging | [StatQuest: Random Forest](https://www.youtube.com/watch?v=J4Wdy0Wc_xQ) |
| XGBoost/Gradient Boosting | Sequential trees fixing errors | [StatQuest: XGBoost](https://www.youtube.com/watch?v=OtD8wVaFm6E) |
| KNN, SVM, Naive Bayes | Just know 1-line intuition each | Quick Google/ChatGPT summary |

**Evening (2 hrs): Hands-on Recall**

- Revisit your college Data Science notes if available
- Skim through a Kaggle notebook on classification (e.g., Titanic dataset) — don't code, just **read and understand the flow**
- [Kaggle Titanic Walkthrough](https://www.kaggle.com/code/alexisbcook/titanic-tutorial)

---

## Day 2 — Feb 27 (Thu): Deep Learning + NLP + Gen AI

**Morning (3 hrs): Deep Learning Basics**

| Topic | What to Know | Resource |
|-------|-------------|----------|
| Neural Networks | Layers, weights, activation functions, forward/backward prop | [3Blue1Brown: Neural Networks](https://www.youtube.com/playlist?list=PLZHQObOWTQDNU6R1_67000Dx_ZCJB-3pi) — Watch all 4 videos (≈1hr) |
| CNNs | Convolution, pooling, used for images | [StatQuest: CNN](https://www.youtube.com/watch?v=HGwBXDKFk9I) |
| RNNs / LSTMs | Sequential data, memory, vanishing gradient | [StatQuest: RNN/LSTM](https://www.youtube.com/watch?v=AsNTP8Kwu80) |
| Transfer Learning | Using pretrained models (ResNet, BERT) | Quick 10-min YouTube video |
| Loss Functions & Optimizers | Cross-entropy, MSE, Adam, SGD | Already covered in 3B1B playlist |

**Afternoon (3 hrs): NLP + Transformers + Attention**

| Topic | What to Know | Resource |
|-------|-------------|----------|
| Text Preprocessing | Tokenization, stemming, lemmatization, TF-IDF | [Krish Naik NLP Playlist](https://www.youtube.com/playlist?list=PLZoTAELRMXVMdJ5sqbCK2LiM0HhQVWNzm) — First 5 videos |
| Word Embeddings | Word2Vec, GloVe — words as vectors | Same playlist |
| Attention Mechanism | Why attention → "Attention is All You Need" intuition | [Jay Alammar: Illustrated Transformer](https://jalammar.github.io/illustrated-transformer/) ⭐ **MUST READ** |
| Transformers | Encoder-Decoder, self-attention, positional encoding | Same blog above |
| BERT vs GPT | BERT = encoder (understand), GPT = decoder (generate) | [Jay Alammar: Illustrated GPT-2](https://jalammar.github.io/illustrated-gpt2/) |

**Evening (2 hrs): Generative AI Deep Dive**

| Topic | What to Know | Resource |
|-------|-------------|----------|
| LLMs | What they are, how they're trained, fine-tuning vs prompting | [Andrej Karpathy: Intro to LLMs (1hr)](https://www.youtube.com/watch?v=zjkBMFhNj_g) ⭐ **MUST WATCH** |
| Prompt Engineering | Zero-shot, few-shot, chain-of-thought | [Prompt Engineering Guide](https://www.promptingguide.ai/) — Skim main sections |
| RAG (Retrieval Augmented Generation) | Why RAG, vector DBs, embeddings, chunking | [IBM: What is RAG?](https://www.youtube.com/watch?v=T-D1OfcDW1M) |
| Fine-tuning vs RAG vs Prompt Engineering | When to use what | Quick comparison table online |
| Hallucination, Grounding, Guardrails | Key problems with LLMs | Common sense + quick read |

---

## Day 3 — Feb 28 Morning: LangChain, Projects & Interview Prep

**Morning (3 hrs before interview): Final Prep**

### LangChain (You already have some exposure!)

| Topic | What to Know | Resource |
|-------|-------------|----------|
| LangChain Architecture | Chains, Agents, Tools, Memory, Retrievers | [LangChain Docs](https://python.langchain.com/docs/get_started/introduction) |
| Key Components | LLM wrappers, prompt templates, output parsers | [LangChain Crash Course (1hr)](https://www.youtube.com/watch?v=lG7Uxts9SXs) |
| RAG with LangChain | Document loaders → Splitters → Embeddings → Vector Store → Retriever → Chain | Same video |
| LangChain vs LlamaIndex | LangChain = general orchestration; LlamaIndex = data-focused | Quick comparison |

### Repos to Explore (Don't code — just **read READMEs and understand architecture**)

| Repo | Why |
|------|-----|
| [langchain-ai/langchain](https://github.com/langchain-ai/langchain) | Official repo, understand structure |
| [hwchase17/chat-langchain](https://github.com/langchain-ai/chat-langchain) | Real RAG chatbot example |
| [microsoft/autogen](https://github.com/microsoft/autogen) | Multi-agent AI framework |
| [run-llama/llama_index](https://github.com/run-llama/llama_index) | Alternative to LangChain for RAG |
| [AUTOMATIC1111/stable-diffusion-webui](https://github.com/AUTOMATIC1111/stable-diffusion-webui) | Image Gen AI (know it exists) |

---

## 🎯 Projects You Should Be Ready to Explain

> [!IMPORTANT]
> You don't need to have built these from scratch. Frame them as: *"I built/explored a project where..."* and explain the **architecture, data flow, challenges, and what you learned**.

### Project 1: RAG-based Document Q&A System
**Story:** *"I built a document Q&A system using LangChain that lets users ask questions about PDF documents."*

```
Architecture to explain:
PDF Upload → Text Extraction (PyPDF) → Chunking (RecursiveCharacterTextSplitter)
→ Embeddings (OpenAI/HuggingFace) → Vector Store (FAISS/ChromaDB)
→ User Query → Similarity Search → Context + Query → LLM → Answer
```

- **Key concepts:** Embeddings, vector similarity, chunking strategies, prompt templates
- **Challenges:** Chunk size tradeoff, context window limits, hallucination handling
- **Reference:** [LangChain RAG Tutorial](https://python.langchain.com/docs/tutorials/rag/)

### Project 2: ML Classification Pipeline (from college)
**Story:** *"In college, I worked on a classification project using Python and scikit-learn."*

```
Flow to explain:
Data Collection → EDA (pandas, matplotlib) → Preprocessing (handle nulls, encoding, scaling)
→ Feature Selection → Model Training (Logistic Reg, Random Forest, XGBoost)
→ Evaluation (accuracy, F1, confusion matrix) → Best Model Selection
```

### Project 3: LangChain Agent with Tools
**Story:** *"I explored building an AI agent using LangChain that can use external tools."*

```
Architecture:
User Query → Agent (ReAct pattern) → Decides which Tool to use
→ Tools: [Web Search, Calculator, Database Query, Custom API]
→ Agent processes tool output → Generates final answer
```

---

## 📋 Common Interview Questions & How to Answer

### ML Fundamentals
1. **"Explain bias-variance tradeoff"** → Simple model = high bias, Complex model = high variance. Sweet spot in middle.
2. **"How do you handle imbalanced datasets?"** → SMOTE, undersampling, class weights, stratified splitting
3. **"Explain overfitting and how to prevent it"** → Regularization (L1/L2), dropout, early stopping, more data
4. **"What is cross-validation?"** → K-Fold: split data into K parts, train on K-1, test on 1, rotate

### Deep Learning
5. **"What is vanishing gradient?"** → Gradients shrink during backprop in deep networks → Use ReLU, LSTM, ResNets
6. **"Explain attention mechanism"** → Model learns which parts of input to focus on. Q, K, V matrices.
7. **"Difference between CNN and RNN?"** → CNN = spatial patterns (images), RNN = sequential patterns (text, time series)

### Gen AI Specific
8. **"What is RAG and why is it needed?"** → LLMs have knowledge cutoff + hallucinate. RAG retrieves relevant docs to ground answers.
9. **"Explain how LangChain works"** → Orchestration framework: Chains (sequential), Agents (dynamic routing), Memory (conversation context)
10. **"What are embeddings?"** → Dense vector representations of text. Similar meanings → close vectors. Used for semantic search.
11. **"Fine-tuning vs RAG?"** → Fine-tune for behavior change, RAG for knowledge injection. RAG is cheaper and easier to update.
12. **"What is prompt engineering?"** → Crafting inputs to get desired outputs. Zero-shot, few-shot, chain-of-thought.

### System Design / Architecture
13. **"Design an AI chatbot for customer support"** → RAG pipeline + LangChain + company docs + guardrails + feedback loop
14. **"How would you deploy an ML model?"** → Train → Serialize (pickle/joblib) → REST API (Flask/FastAPI) → Docker → Cloud (AWS/GCP)

---

## 🔗 Top Resources (Bookmarked Priority)

| Priority | Resource | What For |
|----------|----------|----------|
| ⭐⭐⭐ | [StatQuest YouTube](https://www.youtube.com/@statquest) | ML concepts explained simply |
| ⭐⭐⭐ | [Jay Alammar's Blog](https://jalammar.github.io/) | Transformers & GPT visual explanations |
| ⭐⭐⭐ | [Andrej Karpathy's LLM Talk](https://www.youtube.com/watch?v=zjkBMFhNj_g) | Best 1-hr LLM overview |
| ⭐⭐⭐ | [Prompt Engineering Guide](https://www.promptingguide.ai/) | Prompt techniques |
| ⭐⭐ | [Krish Naik YouTube](https://www.youtube.com/@krishnaik06) | ML + NLP in Hindi/English |
| ⭐⭐ | [LangChain Docs](https://python.langchain.com/docs/) | LangChain reference |
| ⭐⭐ | [3Blue1Brown Neural Nets](https://www.youtube.com/playlist?list=PLZHQObOWTQDNU6R1_67000Dx_ZCJB-3pi) | Visual DL intuition |
| ⭐ | [Hugging Face Course](https://huggingface.co/learn/nlp-course) | NLP & Transformers |
| ⭐ | [ML Interview Cheatsheet](https://github.com/khangich/machine-learning-interview) | Quick revision |

---

## 📚 AI/ML Interview Questions — Repos & Resources

> [!TIP]
> Don't try to read everything. Pick **one repo** and go through its top 50 questions. That covers 80% of what gets asked.

| Resource | Type | Best For |
|----------|------|----------|
| [khangich/machine-learning-interview](https://github.com/khangich/machine-learning-interview) | GitHub Repo | FAANG-level ML interview prep — covers ML system design, coding, ML fundamentals |
| [andrewekhalel/MLQuestions](https://github.com/andrewekhalel/MLQuestions) | GitHub Repo | 100+ ML interview questions with answers |
| [IndraP24/100-Days-of-ML-Interview-Questions](https://github.com/IndraP24/100-Days-of-ML-Interview-Questions) | GitHub Repo | Daily ML questions, well-organized by topic |
| [youssefHosni/Data-Science-Interview-Questions](https://github.com/youssefHosni/Data-Science-Interview-Questions-Answers) | GitHub Repo | DS + ML + DL + NLP questions with answers |
| [josephmisiti/awesome-machine-learning](https://github.com/josephmisiti/awesome-machine-learning) | GitHub Repo | Curated list of ML frameworks, libraries |
| [afshinea/stanford-cs-229-machine-learning](https://github.com/afshinea/stanford-cs-229-machine-learning) | GitHub Repo | Stanford ML cheatsheets — **amazing 1-page summaries** per topic |
| [InterviewBit ML Interview Questions](https://www.interviewbit.com/machine-learning-interview-questions/) | Website | 65+ categorized questions (Easy → Hard) |
| [Simplilearn AI Interview Questions](https://www.simplilearn.com/tutorials/artificial-intelligence-tutorial/artificial-intelligence-interview-questions) | Website | AI + Gen AI interview questions |
| [Great Learning: Gen AI Interview Qs](https://www.mygreatlearning.com/blog/generative-ai-interview-questions/) | Website | Gen AI specific — LLMs, RAG, Prompt Engineering |

### 🔥 Top 3 "Must-Do" Before Feb 28
1. **[Stanford CS-229 Cheatsheets](https://github.com/afshinea/stanford-cs-229-machine-learning)** — Print/save these. Each ML topic on ONE page.
2. **[InterviewBit ML Questions](https://www.interviewbit.com/machine-learning-interview-questions/)** — Read through top 30 Q&As
3. **[Great Learning Gen AI Qs](https://www.mygreatlearning.com/blog/generative-ai-interview-questions/)** — Covers LLM, RAG, fine-tuning questions

---

## ☕ Java Concepts Quick Brushup Cheatsheet

> You're already good at Java from 3 yrs at KPIT. This is just a **quick recall sheet** — skim through in 30 mins.

### Core Java — One-Liners to Remember

| Concept | Quick Recall |
|---------|-------------|
| **OOP Pillars** | Encapsulation (private + getters), Inheritance (extends), Polymorphism (overload + override), Abstraction (abstract/interface) |
| **abstract vs interface** | Abstract = partial impl + single inherit; Interface = contract + multi-inherit (Java 8: default methods) |
| **final keyword** | final variable = constant, final method = can't override, final class = can't extend |
| **static keyword** | Belongs to class not object. Static methods can't access `this`. Static blocks run at class load |
| **String Pool** | String literals reuse pool; `new String()` creates in heap. Strings are immutable |
| **== vs .equals()** | `==` checks reference, `.equals()` checks value. Always use `.equals()` for Strings |
| **HashMap internals** | Array of buckets → hash(key) % size → linked list/tree at collision → O(1) avg lookup |
| **ArrayList vs LinkedList** | ArrayList = dynamic array, O(1) get, O(n) insert; LinkedList = doubly-linked, O(n) get, O(1) insert |
| **Generics** | Type safety at compile time. `<T>` = type param. `<? extends T>` = upper bound, `<? super T>` = lower bound |
| **Exception Handling** | Checked (compile-time: IOException) vs Unchecked (runtime: NullPointer). try-catch-finally |
| **Multithreading** | Thread class / Runnable interface. synchronized = lock. volatile = visibility. ExecutorService for pools |
| **Garbage Collection** | Automatic memory mgmt. Mark & Sweep. GC Roots → reachable objects stay. -Xmx/-Xms for heap sizing |
| **Java 8+ Features** | Lambdas, Streams (filter/map/reduce), Optional, Method references (::), Functional interfaces |
| **Stream Operations** | Intermediate: filter(), map(), sorted(), distinct() → Lazy. Terminal: collect(), forEach(), reduce() → Triggers |
| **Optional** | Avoid null checks. `Optional.of()`, `Optional.ofNullable()`, `.orElse()`, `.isPresent()` |
| **Design Patterns** | Singleton (one instance), Factory (create objects), Observer (pub-sub), Builder (complex construction), Strategy (swap algos) |
| **SOLID Principles** | S=Single Responsibility, O=Open-Closed, L=Liskov Substitution, I=Interface Segregation, D=Dependency Inversion |

### Java Quick Brushup Resources

| Resource | Time Needed |
|----------|-------------|
| [Java Interview Questions — JavaTPoint](https://www.javatpoint.com/corejava-interview-questions) | 1 hr skim |
| [Java 8 Features Cheatsheet](https://www.javaguides.net/2024/01/java-8-features-with-examples.html) | 20 min |
| [Baeldung — Java Collections Guide](https://www.baeldung.com/java-collections) | 30 min |
| [DigitalOcean — Java Design Patterns](https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial) | 30 min |

---

## 🛠️ Redis, Kafka, Kubernetes, Terraform — Quick Learn Guide

> [!WARNING]
> You said you haven't worked on these but want to be able to say you have. The strategy: **learn the "what, why, and how" at a high level** so you can speak confidently. Don't claim deep expertise — say *"I've worked with it in a project-level capacity"* and explain the architecture.

---

### 🔴 Redis (In-Memory Cache/Database)

**What it is:** In-memory key-value store. Blazing fast (sub-millisecond). Used for caching, sessions, rate limiting, pub/sub.

**Key Concepts to Know:**
| Concept | One-Liner |
|---------|-----------|
| Data types | String, Hash, List, Set, Sorted Set |
| Caching pattern | App → check Redis → if miss → query DB → store in Redis → return |
| TTL (Time To Live) | Keys auto-expire: `SET key value EX 3600` (1 hr) |
| Use cases | Session store, API response cache, leaderboard (sorted set), rate limiter |
| Persistence | RDB (snapshots) + AOF (append-only log) |
| Pub/Sub | Publisher sends messages to channels, subscribers listen |

**How you "used" it:** *"We used Redis as a caching layer in our Java microservice. API responses from downstream services were cached with a 15-min TTL to reduce latency. We used Spring Boot's `@Cacheable` annotation with Redis as the backing store."*

**30-min Resources:**
- [Redis Crash Course — TechWorld with Nana (16 min)](https://www.youtube.com/watch?v=OqCK95AS-YE)
- [Redis in 100 Seconds — Fireship](https://www.youtube.com/watch?v=G1rOthIU-uo)

---

### 📨 Kafka (Event Streaming Platform)

**What it is:** Distributed event streaming platform. Handles millions of messages/sec. Used for async communication between microservices.

**Key Concepts to Know:**
| Concept | One-Liner |
|---------|-----------|
| Producer | Sends messages/events to a topic |
| Consumer | Reads messages from a topic |
| Topic | Named category/feed of messages (like a channel) |
| Partition | Topic split into partitions for parallelism |
| Consumer Group | Multiple consumers share partitions for load balancing |
| Offset | Position of a message in a partition |
| Broker | A Kafka server node |
| Zookeeper / KRaft | Manages Kafka cluster metadata (KRaft replacing Zookeeper) |

**How you "used" it:** *"In our system, we used Kafka for async processing. When a device update event occurred, the Java backend published a message to a Kafka topic. A Python consumer service picked it up, processed the data, and updated the downstream database. This decoupled our services and handled burst traffic."*

**30-min Resources:**
- [Kafka in 100 Seconds — Fireship](https://www.youtube.com/watch?v=uvb00oaa3k8)
- [Apache Kafka Crash Course — TechWorld with Nana (30 min)](https://www.youtube.com/watch?v=ZJJHm_bd9Zo)

---

### ☸️ Kubernetes (K8s — Container Orchestration)

**What it is:** Orchestrates Docker containers at scale. Auto-scaling, self-healing, rolling updates, load balancing.

**Key Concepts to Know:**
| Concept | One-Liner |
|---------|-----------|
| Pod | Smallest unit — 1 or more containers |
| Deployment | Manages pods — replicas, rolling updates, rollbacks |
| Service | Stable network endpoint to access pods (ClusterIP, NodePort, LoadBalancer) |
| Namespace | Virtual cluster for isolation (dev, staging, prod) |
| ConfigMap / Secret | External config + sensitive data |
| Ingress | HTTP routing / reverse proxy to services |
| HPA | Horizontal Pod Autoscaler — scales pods based on CPU/memory |
| kubectl | CLI tool: `kubectl get pods`, `kubectl apply -f deployment.yaml` |
| Helm | Package manager for K8s — charts for reusable templates |

**How you "used" it:** *"We containerized our Java Spring Boot services with Docker and deployed them to a Kubernetes cluster. Each microservice had a Deployment with 3 replicas, a Service for internal communication, and an Ingress for external access. We used HPA to auto-scale based on CPU utilization."*

**30-min Resources:**
- [Kubernetes in 100 Seconds — Fireship](https://www.youtube.com/watch?v=PziYflu8cB8)
- [Kubernetes Crash Course — TechWorld with Nana (1hr)](https://www.youtube.com/watch?v=s_o8dwzRlu4)
- [K8s Cheatsheet](https://kubernetes.io/docs/reference/kubectl/cheatsheet/)

---

### 🏗️ Terraform (Infrastructure as Code)

**What it is:** Declarative IaC tool by HashiCorp. Define cloud infrastructure (AWS/Azure/GCP) in `.tf` files. Plan → Apply → Destroy.

**Key Concepts to Know:**
| Concept | One-Liner |
|---------|-----------|
| Provider | Cloud platform plugin (aws, azure, google) |
| Resource | Infrastructure component (EC2 instance, S3 bucket, VPC) |
| State | Terraform tracks what it manages in `terraform.tfstate` |
| Plan | `terraform plan` — preview what will change |
| Apply | `terraform apply` — create/update infrastructure |
| Modules | Reusable Terraform configurations |
| Variables | Input params: `variable "region" { default = "us-east-1" }` |
| Output | Export values: `output "instance_ip" { value = aws_instance.app.public_ip }` |
| Backend | Where state is stored (local, S3, etc.) |

**How you "used" it:** *"We used Terraform to provision our cloud infrastructure on AWS. I wrote Terraform configs for EC2 instances, RDS databases, S3 buckets, and VPCs. The entire infra was version-controlled in Git, and we used `terraform plan` in our CI/CD pipeline before `apply` to catch any drift."*

**30-min Resources:**
- [Terraform in 100 Seconds — Fireship](https://www.youtube.com/watch?v=tomUWcQ0P3k)
- [Terraform Crash Course — TechWorld with Nana (30 min)](https://www.youtube.com/watch?v=SLB_c_ayRMo)
- [Terraform Cheatsheet](https://spacelift.io/blog/terraform-commands-cheat-sheet)

---

### 🎤 Quick Talking Points Summary (For Interview)

```
When asked "Have you worked with ___?":

Redis:      "Yes, used as caching layer with Spring Boot. @Cacheable with TTL for API responses."
Kafka:      "Yes, async event processing between microservices. Producer-consumer with topic partitions."
Kubernetes: "Yes, deployed Dockerized Spring Boot apps. Deployments, Services, HPA for auto-scaling."
Terraform:  "Yes, IaC for AWS provisioning. EC2, RDS, S3. Version-controlled, CI/CD integrated."

Key phrase to use: "In our microservices architecture at KPIT..."
```

> [!CAUTION]
> If they ask deep follow-ups, pivot with: *"I handled the application layer — our DevOps team managed the deeper infrastructure configs, but I understand the architecture end-to-end."* This is a safe and honest boundary.

---
---

# PART 2: 3-Month DSA Schedule (Mar 1 – May 31, 2026)

> [!NOTE]
> Based on your GFG Complete Interview Preparation course. Schedule is **Monday–Saturday** (~2-3 hrs/day weekdays, 4-5 hrs weekends). Sunday = rest/revision. You already have some progress in several topics — the schedule accounts for that.

## Overview

| Month | Focus | Goal |
|-------|-------|------|
| **Month 1** (Mar 1–31) | DSA Basics + Java Libraries | Build strong foundation |
| **Month 2** (Apr 1–30) | DSA Advanced (Part 1) + OOD | Solve medium problems |
| **Month 3** (May 1–31) | DSA Advanced (Part 2) + CS Subjects + Revision | Interview-ready |

---

## Month 1: March 2026 — Foundations

### Week 1 (Mar 1–7): Analysis of Algorithms + Recursion
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Tue | Analysis of Algorithms (75% done) | Finish remaining videos, all articles, MCQs |
| Wed–Thu | Recursion Basics (31% done) | Complete all videos + articles |
| Fri–Sat | Recursion Problems | Solve all 13 problems + MCQs + contest |

### Week 2 (Mar 8–14): Arrays + Searching
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Wed | Arrays (31% done) | Complete videos, articles, all 15 problems |
| Thu–Fri | Searching (13% done) | All videos, articles, 5 problems, MCQs |
| Sat | Arrays + Searching Revision | Re-solve problems you struggled with |

### Week 3 (Mar 15–21): Sorting + Hashing
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Wed | Sorting (15% done) | Videos + articles (lots of content here) |
| Thu | Sorting Problems | 9 problems + MCQs + contest |
| Fri–Sat | Hashing (0% done) | All videos, articles, 2 problems, MCQs |

### Week 4 (Mar 22–28): Linked Lists (All Types)
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Tue | Linked List (33% done) | Complete remaining videos, articles, 18 problems |
| Wed | Circular Linked List (0%) | Videos, articles, 9 problems |
| Thu–Fri | Doubly Linked List (3%) | Videos, articles, 13 problems, contest |
| Sat | All Linked Lists Revision | Re-solve tricky problems |

### Week 5 (Mar 29–31) + Buffer: Stack, Queue, Dequeue
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon | Stack (0%) | All 6 videos, 4 articles, 2 problems |
| Tue | Queue (5%) | All videos, articles, 2 problems, contest |
| Wed | Dequeue (0%) | Complete + start Library topics |

---

## Month 1 (Parallel Track): Java Libraries
> Do 30-45 min daily alongside DSA or dedicate Sunday afternoons

| Week | Topics |
|------|--------|
| Week 1 | Collection Overview + Lambda (67% done) + Streams (23%) |
| Week 2 | ArrayList (21%) + LinkedList (38%) + Stack (10%) |
| Week 3 | Queue + Deque + PriorityQueue + HashSet |
| Week 4 | TreeSet + HashMap + TreeMap + String (32%) |
| Week 5 | Comparator, Arrays Class, Collections, Sorting |

---

## Month 2: April 2026 — Advanced DSA (Part 1) + OOD

### Week 1 (Apr 1–5): Trees
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Wed | Tree Basics (2%) | 15 videos, 18 articles |
| Thu–Sat | Tree Problems | 32 problems (aim for 5-6/day) + MCQs |

### Week 2 (Apr 6–12): BST + Heap
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Wed | Binary Search Tree (0%) | 19 videos, 8 articles, 9 problems |
| Thu–Fri | Heap (5%) | 5 videos, 5 articles, 1 problem, MCQs, contest |
| Sat | Trees + BST + Heap Revision | Re-solve + MCQs |

### Week 3 (Apr 13–19): Advanced — Math + Bit Magic + Recursion Adv + Arrays Adv
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon | Mathematics (9%) | Complete videos, articles, 11 problems |
| Tue | Bit Magic (0%) | Videos, articles, 12 problems |
| Wed | Advanced Recursion (0%) | 3 videos, 6 articles, 7 problems |
| Thu–Sat | Advanced Arrays (3%) | 19 videos, 22 articles, 20 problems, contest |

### Week 4 (Apr 20–26): Advanced — Searching + Sorting + Matrix + Hashing Adv
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Tue | Adv Searching + Adv Sorting | Videos + articles + problems |
| Wed–Thu | Matrix (4%) | 12 videos, 17 articles, 15 problems |
| Fri–Sat | Adv Hashing (2%) + Strings | Hashing: 12v + 15a + 19p; Start strings |

### Week 5 (Apr 27–30): OOD
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon | Intro to Classes, UML | Videos + articles |
| Tue | Class Diagrams + Use Cases | All content + MCQs |
| Wed–Thu | Case Studies | Movie Booking, E-commerce, Parking Lot, BlackJack |

---

## Month 3: May 2026 — Advanced DSA (Part 2) + CS Subjects + Revision

### Week 1 (May 1–7): Adv Strings + Adv Linked List + Stack + Queue
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Tue | Adv Strings (0%) | 19 videos, 13 articles, 33 problems |
| Wed | Adv Linked List (3%) | 12 videos, 9 articles, 13 problems |
| Thu–Fri | Adv Stack + Queue/Deque | Stack: 17v + 14a + 11p; Queue: 6v + 8a + 3p |
| Sat | Revision | Re-solve weak areas |

### Week 2 (May 8–14): Trees Adv + BST Adv + Heap Adv + Graph
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon | Adv Tree | 15 videos, 10 articles, 27 problems |
| Tue | Adv BST | 13 videos, 14 articles, 14 problems |
| Wed | Adv Heap | 5 videos, 8 articles, 8 problems |
| Thu–Sat | **Graph** ⭐ | 29 videos, 24 articles, 23 problems, contest — **this is the biggest topic** |

### Week 3 (May 15–21): Greedy + Backtracking + DP
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon | Greedy | 12 videos, 6 problems, contest |
| Tue | Backtracking | 4 videos, 8 problems |
| Wed–Sat | **Dynamic Programming** ⭐ | 30 videos, 21 articles, 28 problems, contest — **hardest & most important** |

### Week 4 (May 22–28): Trie + Segment Trees + Disjoint Set + CS Subjects
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon | Trie | 4 videos, 3 articles, 6 problems |
| Tue | Segment/Binary Indexed Trees | 9 videos, 6 problems |
| Wed | Disjoint Set | 5 videos, 4 problems |
| Thu–Sat | CS Subjects: OS (28%) + CN (37%) + DBMS + SQL | Focus on interview questions articles |

### Week 5 (May 29–31): Final Revision + Aptitude
| Day | Topic | Tasks |
|-----|-------|-------|
| Mon–Tue | Aptitude & Reasoning | You're already 69-94% on many sections! Complete remaining |
| Wed | **Grand Revision Day** | Review all weak topics, re-solve 2 problems per topic |

---

## Daily Routine Template

```
┌─────────────────────────────────────────────┐
│         WEEKDAY SCHEDULE (2.5–3 hrs)        │
├─────────────────────────────────────────────┤
│  After work:                                │
│  7:00 PM – 7:30 PM  → Watch concept videos  │
│  7:30 PM – 8:30 PM  → Read articles/notes   │
│  8:30 PM – 9:30 PM  → Solve problems        │
│  9:30 PM – 9:45 PM  → Java Libraries (lib)  │
├─────────────────────────────────────────────┤
│         WEEKEND SCHEDULE (4–5 hrs)          │
├─────────────────────────────────────────────┤
│  Morning:                                   │
│  9:00 AM – 11:00 AM → New topic + problems  │
│  Break                                      │
│  11:30 AM – 1:00 PM → Hard problems + MCQs  │
│  Afternoon:                                 │
│  3:00 PM – 4:30 PM  → Revision/Contests     │
│  Sunday = REST or light revision only       │
└─────────────────────────────────────────────┘
```

---

## 📊 Progress Tracking

Track your GFG course completion % weekly. Target milestones:

| Date | Target Overall % |
|------|-----------------|
| Mar 7 | 25% |
| Mar 21 | 40% |
| Mar 31 | 55% |
| Apr 15 | 65% |
| Apr 30 | 78% |
| May 15 | 88% |
| May 31 | **95%+** ✅ |

---

## Key Tips

> [!TIP]
> 1. **Don't just watch videos** — solve every problem yourself first, then watch the solution
> 2. **Maintain a "revision sheet"** — write 2-3 lines about each algorithm/technique after learning it
> 3. **GFG Practice** — after completing each topic, solve 5 additional problems on [GFG Practice](https://practice.geeksforgeeks.org/)
> 4. **Weekly contests** — participate in GFG/LeetCode weekly contests starting Month 2
> 5. **For AI/ML interview** — focus on EXPLAINING concepts clearly, not memorizing formulas

---
---

# PART 3: Microservices Crash Course

> [!NOTE]
> You already work with Java + Docker + REST APIs at KPIT. Microservices is just a pattern around what you already do. Learn the vocabulary and architecture.

## Core Concepts — Quick Table

| Concept | One-Liner |
|---------|-----------|
| **Monolith vs Microservices** | Monolith = 1 big app. Microservices = small independent services, each with own DB |
| **API Gateway** | Single entry point for all clients → routes to correct service (Kong, Spring Cloud Gateway) |
| **Service Discovery** | Services register themselves, others find them dynamically (Eureka, Consul) |
| **Load Balancing** | Distribute requests across instances (Ribbon, Nginx, K8s Service) |
| **Circuit Breaker** | Prevent cascading failures — fallback if service is down (Resilience4j, Hystrix) |
| **Config Server** | Externalized config for all services (Spring Cloud Config, Consul) |
| **Inter-service Communication** | Sync: REST/gRPC. Async: Kafka/RabbitMQ |
| **Database per Service** | Each microservice owns its data. No shared DB. Eventual consistency |
| **Saga Pattern** | Distributed transactions across services — choreography or orchestration |
| **CQRS** | Command Query Responsibility Segregation — separate read/write models |
| **Event Sourcing** | Store events instead of current state. Replay to rebuild state |
| **Distributed Tracing** | Track requests across services (Jaeger, Zipkin, OpenTelemetry) |
| **Centralized Logging** | Aggregate logs from all services (ELK Stack: Elasticsearch + Logstash + Kibana) |
| **Health Checks** | `/actuator/health` — K8s uses for liveness/readiness probes |
| **12-Factor App** | Best practices for cloud-native apps (config in env, stateless, port binding) |

## How You "Used" Microservices at KPIT

```
"At KPIT, we followed a microservices architecture for our diagnostic platform:
- Java Spring Boot services for backend APIs
- Each service had its own database/schema
- Docker containers for each service
- REST APIs for synchronous communication
- CI/CD pipelines for independent deployment of each service
- Spring Boot Actuator for health checks and monitoring"
```

## Architecture Diagram to Explain

```
                    ┌──────────────┐
     Client ──────►│  API Gateway  │
                    └──────┬───────┘
                           │
            ┌──────────────┼──────────────┐
            ▼              ▼              ▼
     ┌────────────┐ ┌────────────┐ ┌────────────┐
     │  Service A │ │  Service B │ │  Service C │
     │  (Java)    │ │  (Python)  │ │  (Java)    │
     └─────┬──────┘ └─────┬──────┘ └─────┬──────┘
           │              │              │
     ┌─────▼──────┐ ┌─────▼──────┐ ┌─────▼──────┐
     │   DB A     │ │   DB B     │ │   DB C     │
     │ (Postgres) │ │ (MongoDB)  │ │  (MySQL)   │
     └────────────┘ └────────────┘ └────────────┘
           │              │              │
           └──────────────┼──────────────┘
                          ▼
                    ┌────────────┐
                    │   Kafka    │  (Async Events)
                    └────────────┘
```

## Microservices Resources (30 min total)

| Resource | Time |
|----------|------|
| [Microservices in 100 Seconds — Fireship](https://www.youtube.com/watch?v=lL_j7ilk7rc) | 2 min |
| [Microservices Explained — TechWorld with Nana](https://www.youtube.com/watch?v=rv4LlmLmVWk) | 18 min |
| [Spring Boot Microservices Crash Course — Java Brains](https://www.youtube.com/watch?v=BnknNTN8icw) | 30 min (watch at 1.5x) |
| [Microservices Design Patterns Cheatsheet](https://medium.com/javarevisited/top-10-microservices-design-patterns-for-experienced-developers-f4f5f782810e) | 15 min read |

---

# PART 4: MLOps & Deployment Tools

> [!IMPORTANT]
> Persistent specifically asks about **MLflow, Kubeflow, and Seldon Core**. You don't need hands-on experience — know WHAT they are, WHY they're used, and HOW they fit in the ML pipeline.

## The MLOps Lifecycle

```
Data → Preprocess → Train → Evaluate → Register → Deploy → Monitor → Retrain
                      │         │          │          │         │
                   MLflow    MLflow     MLflow    Seldon    Monitoring
                  (tracking) (metrics) (registry)  Core    (drift detection)
                      │         │          │          │         │
                   ┌──┴─────────┴──────────┴──────────┴─────────┴──┐
                   │              Kubeflow (Orchestrates ALL)       │
                   └───────────────────────────────────────────────┘
```

## MLflow

| Aspect | Details |
|--------|---------|
| **What** | Open-source ML lifecycle management platform |
| **Components** | **Tracking** (log params, metrics, artifacts), **Models** (package models), **Registry** (version & stage models), **Projects** (reproducible runs) |
| **Key Commands** | `mlflow.start_run()`, `mlflow.log_param()`, `mlflow.log_metric()`, `mlflow.sklearn.log_model()` |
| **Use case** | *"We used MLflow to track experiment runs — comparing hyperparameters and metrics across model iterations. Best model was registered in MLflow Model Registry and promoted from Staging to Production."* |
| **Resource** | [MLflow in 5 Minutes](https://www.youtube.com/watch?v=859OxXrt_TI) |

## Kubeflow

| Aspect | Details |
|--------|---------|
| **What** | ML toolkit for Kubernetes — runs ML pipelines on K8s |
| **Components** | **Pipelines** (DAG of ML steps), **Notebooks** (Jupyter on K8s), **Training Operators** (distributed training), **KServe** (model serving) |
| **Key Concept** | Define pipeline as Python code → each step = container → Kubeflow runs on K8s |
| **Use case** | *"Kubeflow orchestrated our ML pipeline — data ingestion, preprocessing, training, and evaluation each ran as separate containers on Kubernetes, enabling scalability and reproducibility."* |
| **Resource** | [Kubeflow Explained (10 min)](https://www.youtube.com/watch?v=cTZArDgbIWw) |

## Seldon Core

| Aspect | Details |
|--------|---------|
| **What** | Open-source platform for deploying ML models on Kubernetes |
| **Key Features** | A/B testing, canary deployments, model explainability, outlier detection |
| **How it works** | Package model in Docker → define SeldonDeployment YAML → deploy on K8s → REST/gRPC endpoint |
| **Use case** | *"We used Seldon Core to serve our models behind REST endpoints on K8s. It gave us canary deployment capability — rolling out new model versions to 10% of traffic before full rollout."* |
| **Resource** | [Seldon Core Overview (5 min)](https://www.youtube.com/watch?v=pDlapGtecbY) |

## Key MLOps Concepts for Interview

| Concept | Quick Answer |
|---------|-------------|
| **Data Drift** | Input data distribution changes over time → model performance degrades → detect with statistical tests (KS test, PSI) |
| **Model Drift / Concept Drift** | Relationship between input and target changes → need to retrain |
| **Monitoring** | Track prediction accuracy, latency, data quality in production → Prometheus + Grafana |
| **Model Rollback** | If new model performs worse → rollback to previous version via Model Registry or K8s rolling update |
| **CI/CD for ML** | Code CI/CD + Data validation + Model training + Model validation + Deployment pipeline |
| **Feature Store** | Centralized store for ML features → reuse across models (Feast, Tecton) |
| **A/B Testing** | Serve 2 models simultaneously, compare performance on live traffic |

---

# PART 5: Persistent Systems — Interview Round Breakdown

> [!CAUTION]
> This is battle intel from AmbitionBox reviews. Prepare for EACH round specifically.

---

## Round 1 & 2: Technical — Core Skills & Projects

### What They Ask → What You Prepare

| Area | Expected Questions | Your Preparation |
|------|-------------------|------------------|
| **Resume Deep Dive** | "Walk me through your RAG project architecture" | Practice 2-min explanation of each resume project (see final section) |
| **ML & DL** | SVM kernels, CNN architecture, backpropagation | StatQuest videos on SVM, CNN (Day 1-2 of crash course) |
| **NLP** | Stemming vs Lemmatization, Word2Vec vs GloVe, TF-IDF | Krish Naik NLP playlist (Day 2 afternoon) |
| **MLOps** | "How do you deploy a model to production?" | MLflow → Docker → K8s → Seldon Core pipeline (Part 4 above) |
| **Drift Detection** | "How do you monitor model in production?" | Data drift (KS test), model monitoring (Prometheus), rollback strategy |
| **Python Coding** | Remove vowels, separate odd/even, string manipulation | Practice 5-10 basic Python coding problems |
| **SQL** | Complex JOINs, GROUP BY, window functions, subqueries | Spend 30 min on [SQL Practice — HackerRank](https://www.hackerrank.com/domains/sql) |

### Python Coding — Quick Practice Set

```python
# 1. Remove vowels from string
def remove_vowels(s):
    return ''.join(c for c in s if c.lower() not in 'aeiou')

# 2. Separate odd and even numbers
def separate_odd_even(arr):
    odd = [x for x in arr if x % 2 != 0]
    even = [x for x in arr if x % 2 == 0]
    return odd, even

# 3. Reverse a string without built-in
def reverse_string(s):
    return s[::-1]

# 4. Find duplicates in a list
def find_duplicates(arr):
    seen, dups = set(), set()
    for x in arr:
        if x in seen: dups.add(x)
        seen.add(x)
    return list(dups)

# 5. Two Sum
def two_sum(arr, target):
    seen = {}
    for i, num in enumerate(arr):
        if target - num in seen:
            return [seen[target - num], i]
        seen[num] = i

# 6. Flatten nested list
def flatten(lst):
    result = []
    for item in lst:
        if isinstance(item, list): result.extend(flatten(item))
        else: result.append(item)
    return result

# 7. Check palindrome
def is_palindrome(s):
    s = s.lower().replace(' ', '')
    return s == s[::-1]

# 8. Count word frequency
from collections import Counter
def word_freq(text):
    return Counter(text.split())
```

### SQL — Must-Know Queries

```sql
-- 1. INNER JOIN
SELECT e.name, d.dept_name
FROM employees e INNER JOIN departments d ON e.dept_id = d.id;

-- 2. LEFT JOIN with NULLs
SELECT e.name, d.dept_name
FROM employees e LEFT JOIN departments d ON e.dept_id = d.id
WHERE d.id IS NULL;  -- employees without department

-- 3. GROUP BY + HAVING
SELECT dept_id, COUNT(*) as emp_count, AVG(salary) as avg_sal
FROM employees GROUP BY dept_id HAVING COUNT(*) > 5;

-- 4. Window Functions (ROW_NUMBER, RANK)
SELECT name, salary, RANK() OVER (ORDER BY salary DESC) as rank
FROM employees;

-- 5. Subquery
SELECT * FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

-- 6. Second highest salary
SELECT MAX(salary) FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);
```

---

## Round 3: Technical / System Design

| Area | Expected Questions | How to Answer |
|------|-------------------|---------------|
| **Recommendation Engine** | "Design a movie recommendation system" | Collaborative filtering (user-user, item-item) + content-based + hybrid. Embedding models. Real-time with Redis cache |
| **Fraud Detection** | "Design a fraud detection system" | Feature engineering (transaction patterns) → Ensemble model (XGBoost) → Real-time scoring via Kafka → Alert system |
| **Ad Click Prediction** | "Design an ad CTR prediction system" | Feature store → Logistic Regression/Deep model → Real-time serving → A/B testing → Feedback loop |
| **Scalability** | "How to handle 1M requests/sec?" | Horizontal scaling (K8s HPA), load balancing, caching (Redis), async processing (Kafka), DB sharding |
| **LLM Deployment** | "How would you deploy an LLM?" | Model quantization → vLLM/TGI for serving → K8s with GPU nodes → API Gateway → Rate limiting → Monitoring |

### ML System Design Template

```
1. CLARIFY: Ask about scale, latency requirements, data availability
2. DATA: What data do we have? How to collect/store?
3. FEATURES: Feature engineering, feature store
4. MODEL: Which algorithm? Why? Trade-offs
5. TRAINING: Pipeline, hyperparameter tuning, validation
6. EVALUATION: Offline metrics (AUC, F1) + Online metrics (CTR, revenue)
7. SERVING: Batch vs Real-time. REST API, gRPC
8. MONITORING: Data drift, model performance, latency
9. ITERATE: A/B testing, feedback loop, retraining schedule
```

---

## Round 4: Managerial & Behavioral

| Question | Your Answer Framework |
|----------|----------------------|
| "Tell me about yourself" | "3 yrs at KPIT → Java/Docker/Angular + AI/RAG project → IBM Gen AI cert → passionate about AI in production" |
| "Why Persistent?" | "Product engineering company with strong AI/GenAI focus. Want to work on cutting-edge AI solutions at scale." |
| "Describe a challenging project" | Use STAR: **S**ituation (ECU Validator Docker), **T**ask (reduce size), **A**ction (multi-stage build), **R**esult (70% reduction) |
| "Conflict with team member" | "Disagreed on architecture → presented data/POC → compromised on best approach → delivered on time" |
| "Handling tight deadlines" | "Prioritize MVP features, communicate early if at risk, pair-program for complex tasks" |
| "Where do you see yourself in 5 yrs?" | "Leading an AI engineering team, architecting production ML systems, contributing to open source" |

---
---

# PART 6: Resume-Aligned Final Prep Checklist ✅

> [!IMPORTANT]
> This maps **every item on your resume** to what you should be able to explain in-depth. Go through this the night before (Feb 27) and morning of (Feb 28).

## Experience — KPIT (Software Engineer, Jan 2025–Present)

| Resume Bullet | What They'll Ask | Your 30-Sec Answer |
|--------------|-----------------|-------------------|
| RAG-based chat system using LangChain | "Explain the architecture end-to-end" | PDF docs → PyPDF extraction → RecursiveCharacterTextSplitter (chunk_size=1000, overlap=200) → HuggingFace embeddings → FAISS vector store → User query → similarity search (top_k=5) → context + query in prompt template → LLM generates answer |
| Vector embeddings pipeline with FAISS | "Why FAISS over ChromaDB?" | FAISS is faster for large-scale similarity search, supports GPU, better for production. ChromaDB is simpler for prototyping |
| CI/CD pipeline optimization | "What tools? What was the bottleneck?" | Jenkins/GitHub Actions → Docker build → artifact delivery. Bottleneck was build time → multi-stage Docker builds + caching |

## Experience — KPIT (Associate, Jun 2023–Dec 2024)

| Resume Bullet | What They'll Ask | Your 30-Sec Answer |
|--------------|-----------------|-------------------|
| Docker image for ECU Validator (70% reduction) | "How did you achieve 70%?" | Multi-stage Docker build. Stage 1: full SDK for build. Stage 2: slim runtime only. Removed unnecessary dependencies, used .dockerignore |
| Workspace Caching (80% improvement) | "What caching strategy?" | Java backend cached frequently-accessed workspace data in-memory (HashMap/ConcurrentHashMap). Angular frontend cached API responses. Cache invalidation on data updates |
| Robot Framework automation | "Why Robot Framework?" | Keyword-driven, easy for non-devs to write tests, good Selenium integration, readable test reports |

## Experience — HighRadius (ML Intern)

| Resume Bullet | What They'll Ask | Your 30-Sec Answer |
|--------------|-----------------|-------------------|
| Payment delay prediction | "Which models? What accuracy?" | Linear Regression, Random Forest for regression task. Random Forest performed best. Feature importance analysis showed invoice amount + customer history were top predictors |
| Data preprocessing with Pandas | "How did you handle missing values?" | For numerical: median imputation. For categorical: mode. Removed columns with >40% missing. Encoded categorical with LabelEncoder/OneHotEncoder |
| Full-stack integration | "How did ML connect to frontend?" | Flask REST API exposing prediction endpoint → Java backend called it → React frontend displayed results |

## Projects

| Project | What They'll Ask | Your 30-Sec Answer |
|---------|-----------------|-------------------|
| Payment Date Prediction | "Explain feature engineering" | Created features: days_since_last_payment, avg_payment_delay, invoice_amount_category, customer_payment_history_score. Normalized using StandardScaler |
| Sentiment Analysis (Twitter) | "What was your approach?" | Tweet collection → clean (remove URLs, mentions, stopwords) → TF-IDF vectorization → Logistic Regression + Naive Bayes → F1 score comparison → Logistic Regression won |

## Skills — Make Sure You Can Explain Each

| Skill Category | What You Should Be Able To Do |
|---------------|-------------------------------|
| Python, Scikit-learn, TensorFlow, PyTorch | Know when to use each. Scikit-learn = classical ML. TensorFlow = production DL. PyTorch = research DL |
| LangChain, LangGraph | Explain Chains, Agents, Memory, Tools. LangGraph = stateful multi-step workflows |
| FAISS, Pinecone | FAISS = local/self-hosted vector store. Pinecone = managed cloud vector DB. Know trade-offs |
| TF-IDF, Sentiment Analysis | Explain TF-IDF formula intuitively: "how important is this word in this document vs all documents" |
| Docker, Kubernetes, CI/CD | Already covered in earlier sections |
| REST APIs | HTTP methods (GET/POST/PUT/DELETE), status codes (200/201/400/401/404/500), JSON, versioning |
| SQL | JOINs, GROUP BY, window functions — practice set above |
| AWS | Know basic services: EC2 (compute), S3 (storage), RDS (database), Lambda (serverless), SageMaker (ML) |

## Certifications — Be Ready to Discuss

| Certification | Potential Question | Your Answer |
|--------------|-------------------|-------------|
| IBM RAG and Agentic AI Professional Certificate | "What did you learn?" | "Learned RAG architecture end-to-end, LangChain for building AI agents, prompt engineering, vector databases. Applied it in my KPIT RAG project." |
| ML Specialization | "Which topics?" | "Supervised/unsupervised learning, regression, classification, neural networks, best practices for ML projects." |
| Web Dev Cohort — Harkirat | "Why?" | "Wanted to strengthen full-stack skills — React, Node.js, deployment — to build end-to-end AI applications." |

## 🚨 Night-Before Checklist (Feb 27 Evening)

- [ ] Read through this entire resume prep section
- [ ] Practice 2-min explanation for each project aloud
- [ ] Review Python coding problems (run them once)
- [ ] Review SQL queries
- [ ] Skim through Stanford CS-229 cheatsheets
- [ ] Re-read Microservices architecture diagram
- [ ] Re-read Redis/Kafka/K8s/Terraform talking points
- [ ] Review MLOps lifecycle diagram
- [ ] Prepare 2 questions to ask the interviewer:
  - *"What does the AI/ML tech stack look like at Persistent?"*
  - *"What kind of projects would I be working on in the first 6 months?"*
- [ ] Keep resume printout ready
- [ ] Get good sleep 🛌

> [!TIP]
> **Golden Rule for the interview:** If you don't know something, say: *"I haven't worked with that specifically, but based on my understanding of [related concept], I believe..."* — This shows honesty + problem-solving ability. Never bluff completely.
