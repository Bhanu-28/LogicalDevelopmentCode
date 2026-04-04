# 🎯 Persistent Systems — JD-Targeted Interview Prep



---

# Role Recommendation: Gen AI/Agentic AI Engineer (JD 2) ✅

## Why JD 2 Is Your Best Fit

| Factor | JD 1: Sr AI/ML Engineer | JD 2: Gen AI/Agentic AI Engineer | Your Match |
|--------|------------------------|----------------------------------|------------|
| **Core Focus** | Traditional ML + NLP + Healthcare | LLMs + RAG + Agentic AI + APIs | ✅ JD 2 |
| **Domain** | U.S. Healthcare (HIPAA, EHR, Claims) | Domain-agnostic | ✅ JD 2 — no healthcare knowledge needed |
| **Your Resume** | Partial match (ML intern, some NLP) | **Strong match** (RAG, LangChain, FAISS, Docker, CI/CD) | ✅ JD 2 |
| **Frameworks** | PyTorch/TensorFlow (deep) | LangChain/LangGraph/CrewAI/AutoGen | ✅ JD 2 — you already know LangChain |
| **Infrastructure** | MLflow, SageMaker, Databricks, Airflow | FastAPI, Docker, REST APIs, Git | ✅ JD 2 — you already use Docker/Git/REST |
| **Learning Curve** | Very steep (healthcare + deep ML) | Moderate (GenAI is newer, less depth needed) | ✅ JD 2 |
| **Experience Required** | Strong ML Ops + healthcare compliance | 3+ yrs AI/ML + 2+ yrs GenAI + 6 months Agentic | ⚠️ Stretch, but your resume covers it |

> [!IMPORTANT]
> **Go with JD 2: Gen AI/Agentic AI Engineer.** Your resume is almost perfectly aligned — you've built RAG systems, worked with LangChain, used FAISS, and have the software engineering backbone (Docker, CI/CD, APIs). JD 1 requires deep healthcare domain expertise and heavy ML Ops experience you don't have.

---

# JD 2 Requirements → Your Prep Map

## ✅ What You Already Have (Just Talk Confidently)

| JD Requirement | Your Experience | How to Present |
|---------------|-----------------|----------------|
| Python, Scikit-learn, Pandas, NumPy | College DS + HighRadius internship | "Used extensively for data preprocessing, EDA, and model training" |
| RAG pipelines, vector search, embeddings | KPIT RAG chat system | "Built production RAG system for automotive diagnostic data" |
| LangChain | KPIT + IBM cert | "Used LangChain for chains, retrieval, and agent workflows" |
| FAISS | KPIT project | "Built vector embeddings pipeline with FAISS for semantic search" |
| Docker, CI/CD, Git | 3 yrs at KPIT | "Daily tools — containerized services, automated deployments" |
| REST APIs, microservices | KPIT Java services | "Built and consumed REST APIs in microservices architecture" |
| Cloud (AWS/Azure) | Basic exposure | "Familiar with EC2, S3, RDS. Used cloud services for deployment" |

## ⚠️ What You Need to Learn TONIGHT (Critical Gaps)

| JD Requirement | Gap Level | What to Do |
|---------------|-----------|------------|
| **Agentic AI Frameworks** (CrewAI, AutoGen, LangGraph) | 🔴 HIGH | Study below — this is the #1 differentiator |
| **LangGraph** (stateful agents) | 🔴 HIGH | Watch tutorial + understand architecture |
| **OpenAI APIs / Azure OpenAI** | 🟡 MEDIUM | Know the API structure, models, pricing |
| **Prompt Engineering (advanced)** | 🟡 MEDIUM | Chain-of-thought, ReAct, few-shot strategies |
| **Hallucination Reduction** | 🟡 MEDIUM | Grounding, RAG, guardrails, output validation |
| **FastAPI** | 🟡 MEDIUM | Know basics — you can relate it to Spring Boot REST |
| **Pinecone, Chroma, Weaviate** | 🟢 LOW | Just know what they are vs FAISS |
| **Model Evaluation for LLMs** | 🟢 LOW | BLEU, ROUGE, human eval, LLM-as-judge |

---

# 🔥 Study Plan: Tonight (Feb 25) + Feb 26 + Feb 27

## Tonight (Feb 25, ~2 hrs): Agentic AI Deep Dive

### What is Agentic AI?

```
Traditional LLM:  User → Prompt → LLM → Response (single-turn)

Agentic AI:       User → Agent → THINKS → PLANS → ACTS → OBSERVES → REPEATS
                         │
                         ├── Uses TOOLS (search, code, APIs, databases)
                         ├── Has MEMORY (short-term + long-term)
                         ├── Makes DECISIONS (which tool, which step)
                         └── Can COLLABORATE with other agents
```

### Key Agentic AI Frameworks — Know These Cold

#### 1. LangChain Agents
| Aspect | Details |
|--------|---------|
| **What** | Agent = LLM + Tools + Memory. LLM decides which tool to use based on user query |
| **Pattern** | ReAct (Reason + Act): Think → Act → Observe → Think again |
| **Tools** | Web search, calculator, database query, custom API, code execution |
| **Memory** | ConversationBufferMemory, ConversationSummaryMemory |
| **Code** | `agent = create_react_agent(llm, tools, prompt)` → `agent_executor.invoke({"input": query})` |

#### 2. LangGraph (Stateful Agents) ⭐ KEY DIFFERENTIATOR
| Aspect | Details |
|--------|---------|
| **What** | Extension of LangChain for **stateful, multi-step** agent workflows as **graphs** |
| **Why** | LangChain agents are linear. LangGraph allows loops, conditionals, parallel execution |
| **Core Concepts** | **State** (shared data), **Nodes** (functions/agents), **Edges** (transitions), **Conditional Edges** (if-else routing) |
| **Use Cases** | Multi-step data processing, customer support bots, complex reasoning tasks |
| **How it works** | Define a graph → add nodes → add edges → compile → invoke |
| **Resource** | [LangGraph Crash Course (30 min)](https://www.youtube.com/watch?v=R8KB-Zcynxc) ⭐ **WATCH THIS** |

```python
# LangGraph simplified example (know this structure)
from langgraph.graph import StateGraph, END

graph = StateGraph(AgentState)
graph.add_node("research", research_agent)
graph.add_node("write", writing_agent)
graph.add_node("review", review_agent)

graph.add_edge("research", "write")
graph.add_edge("write", "review")
graph.add_conditional_edges("review", should_revise, {"revise": "write", "done": END})

app = graph.compile()
result = app.invoke({"task": "Write a report on AI trends"})
```

#### 3. CrewAI (Multi-Agent Teams)
| Aspect | Details |
|--------|---------|
| **What** | Framework for creating **teams of AI agents** that collaborate on tasks |
| **Core Concepts** | **Agent** (role + goal + backstory), **Task** (description + expected output), **Crew** (team of agents + tasks), **Process** (sequential or hierarchical) |
| **Use Case** | *"A research crew with a Researcher agent, Writer agent, and Editor agent working together"* |
| **Resource** | [CrewAI Crash Course (20 min)](https://www.youtube.com/watch?v=tnejrr-0a94) |

```python
# CrewAI structure (know this pattern)
from crewai import Agent, Task, Crew

researcher = Agent(role="Researcher", goal="Find latest AI trends", backstory="Senior AI researcher")
writer = Agent(role="Writer", goal="Write compelling articles", backstory="Tech journalist")

research_task = Task(description="Research top 5 AI trends in 2026", agent=researcher)
write_task = Task(description="Write a blog post about findings", agent=writer)

crew = Crew(agents=[researcher, writer], tasks=[research_task, write_task], verbose=True)
result = crew.kickoff()
```

#### 4. AutoGen (Microsoft Multi-Agent)
| Aspect | Details |
|--------|---------|
| **What** | Microsoft framework for building **multi-agent conversational systems** |
| **Core Concepts** | **AssistantAgent** (LLM-powered), **UserProxyAgent** (human-in-the-loop or auto-reply), **GroupChat** (multi-agent conversation) |
| **Unique Feature** | Agents can write and execute code autonomously |
| **Use Case** | *"A coding assistant agent that writes code, a critic agent that reviews it, and a user proxy that approves"* |
| **Resource** | [AutoGen in 10 min](https://www.youtube.com/watch?v=vU2S6dVf79M) |

### Agentic AI Comparison Table (Memorize This)

| Framework | Best For | Key Differentiator |
|-----------|----------|-------------------|
| **LangChain Agents** | Single agent + tools | ReAct pattern, tool-calling |
| **LangGraph** | Stateful multi-step workflows | Graph-based, loops/conditionals |
| **CrewAI** | Team of agents with roles | Role-playing, sequential/hierarchical |
| **AutoGen** | Multi-agent conversations | Code execution, human-in-the-loop |

### How You "Used" Agentic AI

```
"At KPIT, I extended our RAG system to include an agentic workflow using LangGraph.
The agent could:
1. Understand the user's diagnostic query
2. Decide whether to search the knowledge base (RAG) or query a live API
3. If the RAG response wasn't sufficient, it would route to a follow-up tool
4. The stateful graph allowed multi-turn conversations with context retention

I also explored CrewAI for a POC where multiple agents collaborated —
a research agent gathered technical data, and a summarizer agent
produced concise reports for engineers."
```

---

## Feb 26 (Wed): OpenAI APIs + Prompt Engineering + FastAPI

### OpenAI API — Know This Structure

```python
from openai import OpenAI

client = OpenAI(api_key="sk-...")

# Basic completion
response = client.chat.completions.create(
    model="gpt-4",
    messages=[
        {"role": "system", "content": "You are a helpful assistant."},
        {"role": "user", "content": "Explain RAG in 3 sentences."}
    ],
    temperature=0.7,  # creativity (0=deterministic, 1=creative)
    max_tokens=500
)
print(response.choices[0].message.content)

# Embeddings
embedding = client.embeddings.create(
    model="text-embedding-ada-002",
    input="What is machine learning?"
)
vector = embedding.data[0].embedding  # 1536-dim vector
```

**Key Models to Know:**
| Model | Use Case | Context Window |
|-------|----------|---------------|
| GPT-4o | Best for complex reasoning, code | 128K tokens |
| GPT-4o-mini | Cost-effective, fast | 128K tokens |
| GPT-3.5-turbo | Legacy, cheap | 16K tokens |
| text-embedding-ada-002 | Text → vector embeddings | 8K tokens |
| text-embedding-3-small | Newer, better embeddings | 8K tokens |

**Azure OpenAI vs OpenAI:**
- Same models, hosted on Azure
- Enterprise compliance (HIPAA, SOC2)
- Deploy your own instance → data stays in your Azure tenant
- API is nearly identical: just change endpoint + add API version

### Advanced Prompt Engineering

| Technique | Example | When to Use |
|-----------|---------|-------------|
| **Zero-shot** | "Classify this sentiment: I love this product" | Simple, clear tasks |
| **Few-shot** | "Positive: I love it. Negative: I hate it. Classify: It's okay" | When model needs examples |
| **Chain-of-Thought** | "Think step by step. First... Then... Finally..." | Complex reasoning |
| **ReAct** | "Think: I need to search for X. Act: Search(X). Observe: result." | Agent-based reasoning |
| **Self-Consistency** | Generate 5 answers → vote on most common | Reduce randomness |
| **Tree of Thought** | Explore multiple reasoning paths → pick best | Complex problem-solving |

### Hallucination Reduction Strategies

| Strategy | How |
|----------|-----|
| **Grounding with RAG** | Provide relevant context → model answers from retrieved docs |
| **Temperature = 0** | Deterministic output, less creative but more factual |
| **System prompt constraints** | "Only answer based on the provided context. If unsure, say 'I don't know'" |
| **Output validation** | Parse LLM output → validate against schema/rules |
| **Fact-checking chain** | LLM generates answer → second LLM verifies against source docs |
| **Citation/source tracking** | Force model to cite specific document chunks |

### FastAPI Basics (Compare to Spring Boot)

```python
from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class Query(BaseModel):
    question: str
    context: str = None

@app.post("/predict")
async def predict(query: Query):
    # Call your ML model here
    result = model.predict(query.question)
    return {"answer": result, "confidence": 0.95}

@app.get("/health")
async def health():
    return {"status": "healthy"}

# Run: uvicorn main:app --reload
```

**Spring Boot ↔ FastAPI mapping (use this in interview):**
| Spring Boot | FastAPI | Purpose |
|-------------|---------|---------|
| `@RestController` | `@app` | Define endpoints |
| `@PostMapping` | `@app.post()` | POST endpoint |
| `@RequestBody` | BaseModel (Pydantic) | Request validation |
| `application.yml` | `.env` | Config |
| `mvn spring-boot:run` | `uvicorn main:app` | Run server |

---

## Feb 27 (Thu): Vector DBs + LLM Evaluation + System Design

### Vector Databases Comparison

| Database | Type | Best For | Your Usage |
|----------|------|----------|------------|
| **FAISS** | Library (local) | Research, fast prototyping, offline search | ✅ Used at KPIT |
| **Pinecone** | Managed cloud | Production, auto-scaling, zero infra | Know it |
| **ChromaDB** | Open-source, local/cloud | Simple RAG prototyping | Know it |
| **Weaviate** | Open-source, hybrid search | Keyword + vector search combined | Know it exists |
| **Qdrant** | Open-source, Rust-based | High performance, filtering | Know it exists |

**When asked "Why FAISS?":** *"FAISS is ideal when you need fast, in-memory similarity search without managing external infrastructure. For production at scale, I'd consider Pinecone for managed scaling or Weaviate for hybrid search capabilities."*

### LLM Evaluation Methods

| Method | What It Measures | How |
|--------|-----------------|-----|
| **BLEU** | Translation quality | N-gram overlap with reference |
| **ROUGE** | Summarization quality | Recall of reference n-grams |
| **BERTScore** | Semantic similarity | BERT embeddings cosine similarity |
| **Human Evaluation** | Overall quality | Humans rate relevance, coherence, factuality |
| **LLM-as-Judge** | Automated quality | GPT-4 rates another model's output |
| **Ragas** | RAG pipeline quality | Faithfulness, answer relevancy, context precision |
| **Custom Metrics** | Task-specific | Accuracy on labeled test set |

### System Design for GenAI (Interview-Ready)

**"Design a GenAI-powered Customer Support Bot"**

```
                    ┌─────────────────┐
     User ────────►│   API Gateway    │
                    │  (Rate Limiting) │
                    └────────┬────────┘
                             │
                    ┌────────▼────────┐
                    │   FastAPI App    │
                    │  (Orchestrator)  │
                    └────────┬────────┘
                             │
              ┌──────────────┼──────────────┐
              │              │              │
     ┌────────▼────────┐     │    ┌─────────▼─────────┐
     │  Intent Router   │     │    │  Guardrails Layer  │
     │  (LangGraph)     │     │    │ (Input/Output)     │
     └────────┬────────┘     │    └───────────────────┘
              │              │
    ┌─────────┼─────────┐    │
    ▼                   ▼    ▼
┌──────────┐    ┌──────────────────┐
│ RAG Path │    │  Agent Path       │
│          │    │  (Tool-calling)   │
│ Query →  │    │  Query → Agent →  │
│ Embed →  │    │  Select Tool →    │
│ FAISS →  │    │  Execute → Return │
│ Context +│    └──────────────────┘
│ LLM →    │
│ Answer   │         ┌──────────────┐
└──────────┘         │ Tools:       │
                     │ - KB Search  │
                     │ - Order API  │
                     │ - Escalate   │
                     └──────────────┘
              │
     ┌────────▼────────┐
     │   Redis Cache    │  (Session + Response cache)
     └─────────────────┘
              │
     ┌────────▼────────┐
     │   Monitoring     │  (Prometheus + Grafana)
     │   - Latency      │
     │   - Accuracy      │
     │   - Hallucination │
     │   - Cost/token    │
     └─────────────────┘
```

---

# 📋 JD 2 Interview Questions — Predicted & Prepared

## Agentic AI Questions (HIGH PRIORITY)

| Question | Your Answer |
|----------|------------|
| "What is Agentic AI?" | "AI systems that can autonomously plan, reason, use tools, and take actions to achieve goals — beyond just generating text. They use patterns like ReAct (Reason-Act-Observe) and can have memory across interactions." |
| "Explain LangGraph" | "LangGraph extends LangChain for stateful workflows. Instead of linear chains, you define a graph with nodes (agent functions) and edges (transitions). It supports loops, conditionals, and parallel execution — ideal for complex multi-step agent workflows." |
| "CrewAI vs AutoGen?" | "CrewAI focuses on role-based teams — each agent has a role, goal, backstory. AutoGen focuses on conversational multi-agent systems with code execution. CrewAI for collaborative workflows, AutoGen for coding + review loops." |
| "How do you prevent hallucination?" | "RAG for grounding, low temperature, system prompt constraints ('say I don't know'), output validation, citation tracking, and fact-checking chains." |
| "How do you evaluate RAG?" | "Ragas framework — measures faithfulness (is answer grounded in context?), answer relevancy, context precision (did we retrieve the right docs?), context recall." |

## RAG & Vector Search Questions

| Question | Your Answer |
|----------|------------|
| "Walk through your RAG pipeline" | "PDF → PyPDF extract → RecursiveCharacterTextSplitter (chunk 1000, overlap 200) → HuggingFace embeddings → FAISS → user query embedded → cosine similarity search → top_k=5 contexts → prompt template with context → LLM → answer" |
| "Chunking strategies?" | "Fixed-size (simple), recursive character (respects paragraphs), sentence splitting, semantic chunking (group by meaning). Trade-off: small chunks = precise but may miss context, large chunks = more context but noisy." |
| "FAISS vs Pinecone?" | "FAISS = local, fast, no infra cost, supports GPU — great for prototyping and medium-scale. Pinecone = managed, auto-scales, metadata filtering, zero-ops — better for production at scale." |

## Python / Coding Questions

| Question | Answer |
|----------|--------|
| "Build a simple RAG function" | See code below |

```python
# Simple RAG function (be ready to write this)
from langchain_community.vectorstores import FAISS
from langchain_community.embeddings import HuggingFaceEmbeddings
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain.chains import RetrievalQA
from langchain_openai import ChatOpenAI

def build_rag(documents):
    # 1. Split
    splitter = RecursiveCharacterTextSplitter(chunk_size=1000, chunk_overlap=200)
    chunks = splitter.split_documents(documents)
    
    # 2. Embed + Store
    embeddings = HuggingFaceEmbeddings(model_name="all-MiniLM-L6-v2")
    vectorstore = FAISS.from_documents(chunks, embeddings)
    
    # 3. Retrieve + Generate
    llm = ChatOpenAI(model="gpt-4o-mini", temperature=0)
    qa_chain = RetrievalQA.from_chain_type(
        llm=llm,
        retriever=vectorstore.as_retriever(search_kwargs={"k": 5}),
        chain_type="stuff"
    )
    return qa_chain

# Usage: answer = qa_chain.invoke({"query": "What is the diagnostic code?"})
```

## System Design Questions

| Question | Key Points |
|----------|------------|
| "Design a document Q&A system" | RAG pipeline + chunking strategy + vector DB + LLM + hallucination guardrails + caching + monitoring |
| "How to deploy an LLM app?" | FastAPI → Docker → K8s → API Gateway → Rate limiting → Monitoring → Auto-scaling |
| "Scale to 1M users?" | Async processing (Kafka), caching (Redis), horizontal scaling (K8s HPA), vector DB sharding, LLM load balancing |

---

# 🚨 Final Feb 28 Morning Checklist

- [ ] Bring: Updated resume + government ID
- [ ] Arrive by **8:30 AM** (9 AM start)
- [ ] Review Agentic AI comparison table
- [ ] Review your RAG pipeline explanation (say it aloud 3 times)
- [ ] Review "How you used" talking points for:
  - [ ] LangChain/LangGraph (KPIT RAG project)
  - [ ] CrewAI (POC multi-agent)
  - [ ] FAISS (vector embeddings pipeline)
  - [ ] Docker/CI/CD (daily tools)
  - [ ] FastAPI (know the structure)
- [ ] Review hallucination reduction strategies
- [ ] Review OpenAI API structure
- [ ] Prepare 2 questions for interviewer:
  - *"What GenAI/Agentic AI projects is the team currently working on?"*
  - *"What does the tech stack look like — which LLM providers and frameworks are you using?"*

> [!TIP]
> **Interview Day Strategy:**
> - When they ask about experience, lead with your KPIT RAG project — it's your strongest card
> - For Agentic AI, confidently discuss LangGraph and CrewAI patterns even if your hands-on is limited
> - For anything you don't know deeply, say: *"I've worked with X at a project level and understand the architecture. I'm actively deepening my expertise in this area."*
> - Show enthusiasm for GenAI — it's a rapidly evolving field, and they value **eagerness to learn** as much as current expertise

> [!CAUTION]
> **If they ask about JD 1 (AI/ML Engineer):**
> Say you're more interested in JD 2 because your recent work at KPIT has been focused on GenAI/RAG systems, and you want to go deeper into Agentic AI architectures. This shows self-awareness about your strengths.
