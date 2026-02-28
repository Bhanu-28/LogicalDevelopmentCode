# ⚡ JD2: Gen AI/Agentic AI Engineer — 48-Hour Battle Plan

> **Now:** 12:37 AM, Feb 26 | **Interview:** 9:00 AM, Feb 28 | **Time Left: ~54 hours**

---

# 📅 Hour-by-Hour Roadmap

## Feb 26 (Wednesday) — Foundation Day

### Morning (9 AM – 12 PM): Agentic AI Frameworks
| Time | Topic | Resource | Goal |
|------|-------|----------|------|
| 9:00–9:30 | What is Agentic AI + ReAct pattern | [Agentic AI Explained (15 min)](https://www.youtube.com/watch?v=F8NKVhkZZWI) | Understand agent = LLM + Tools + Memory + Reasoning |
| 9:30–10:15 | **LangGraph** ⭐ | [LangGraph Crash Course (30 min)](https://www.youtube.com/watch?v=R8KB-Zcynxc) | Understand state, nodes, edges, conditional routing |
| 10:15–10:45 | **CrewAI** | [CrewAI Tutorial (20 min)](https://www.youtube.com/watch?v=tnejrr-0a94) | Understand Agent, Task, Crew, Process |
| 10:45–11:15 | **AutoGen** | [AutoGen Explained (15 min)](https://www.youtube.com/watch?v=vU2S6dVf79M) | Understand AssistantAgent, UserProxy, GroupChat |
| 11:15–12:00 | LangChain Agents refresh | [LangChain Agents Docs](https://python.langchain.com/docs/how_to/#agents) | ReAct, tool-calling, custom tools |

### Afternoon (1 PM – 4 PM): RAG + Vector DBs + Embeddings
| Time | Topic | Resource | Goal |
|------|-------|----------|------|
| 1:00–1:45 | RAG Deep Dive | [RAG from Scratch (45 min)](https://www.youtube.com/watch?v=sVcwVQRHIc8) | Chunking, embeddings, retrieval, generation |
| 1:45–2:15 | Vector Databases Comparison | [Vector DB Comparison Blog](https://www.pinecone.io/learn/vector-database/) | FAISS vs Pinecone vs Chroma vs Weaviate |
| 2:15–3:00 | Embeddings Deep Dive | [What are Embeddings? (20 min)](https://www.youtube.com/watch?v=wjZofJX0v4M) | How text→vector, cosine similarity, sentence transformers |
| 3:00–3:30 | Advanced RAG Techniques | [Advanced RAG Blog](https://www.llamaindex.ai/blog/a-cheat-sheet-and-some-recipes-for-building-advanced-rag-803a9d94c41b) | Hybrid search, reranking, query decomposition, HyDE |
| 3:30–4:00 | **Practice:** Explain your KPIT RAG pipeline aloud | — | Time yourself: 2 min explanation |

### Evening (5 PM – 8 PM): LLMs + OpenAI API + Prompt Engineering
| Time | Topic | Resource | Goal |
|------|-------|----------|------|
| 5:00–6:00 | **Andrej Karpathy LLM Talk** ⭐ | [Intro to LLMs (1hr)](https://www.youtube.com/watch?v=zjkBMFhNj_g) | Best single resource for LLM understanding |
| 6:00–6:30 | OpenAI API Structure | [OpenAI API Docs](https://platform.openai.com/docs/quickstart) | Chat completions, embeddings, function calling |
| 6:30–7:15 | Prompt Engineering | [Prompt Engineering Guide](https://www.promptingguide.ai/) | Zero-shot, few-shot, CoT, ReAct |
| 7:15–8:00 | Hallucination + Guardrails | [Guardrails AI](https://www.guardrailsai.com/docs) + Google | 6 strategies to reduce hallucination |

### Night (9 PM – 11 PM): Interview Q&A Revision
| Time | Topic | Resource |
|------|-------|----------|
| 9:00–10:00 | GenAI Interview Questions | Read Q&A bank below (Section 3 of this doc) |
| 10:00–11:00 | Practice project explanations aloud | Use Section 4 of this doc |

---

## Feb 27 (Thursday) — Sharpen & Polish Day

### Morning (9 AM – 12 PM): Remaining Tech Gaps
| Time | Topic | Resource | Goal |
|------|-------|----------|------|
| 9:00–9:30 | FastAPI basics | [FastAPI in 5 min](https://www.youtube.com/watch?v=0sOvCWFmrtA) | Know endpoints, Pydantic models |
| 9:30–10:00 | LLM Evaluation (BLEU, ROUGE, Ragas) | [LLM Eval Guide](https://www.confident-ai.com/blog/llm-evaluation-metrics-everything-you-need-for-llm-evaluation) | Know what each metric measures |
| 10:00–10:30 | Azure OpenAI vs OpenAI | [Azure OpenAI Overview](https://learn.microsoft.com/en-us/azure/ai-services/openai/overview) | Same models, enterprise compliance, your own deployment |
| 10:30–11:15 | HuggingFace Transformers | [HuggingFace Crash Course (30 min)](https://www.youtube.com/watch?v=QEaBAZQCtwE) | Model hub, pipeline API, tokenizers |
| 11:15–12:00 | ML Fundamentals Quick Refresh | [Stanford CS-229 Cheatsheets](https://github.com/afshinea/stanford-cs-229-machine-learning) | Skim 5 sheets: supervised, unsupervised, DL, NLP, tips |

### Afternoon (1 PM – 4 PM): System Design + Behavioral
| Time | Topic | Resource | Goal |
|------|-------|----------|------|
| 1:00–2:00 | GenAI System Design | Practice designing: RAG chatbot, doc Q&A, recommendation engine | Use the template in PERSISTENT_GENAI_INTERVIEW_PREP.md |
| 2:00–2:30 | Microservices recap | Skim INTERVIEW_PREP_ROADMAP.md Part 3 | 15 concepts table + architecture diagram |
| 2:30–3:00 | Redis/Kafka/K8s/Terraform recap | Skim INTERVIEW_PREP_ROADMAP.md | Talking points only |
| 3:00–3:30 | Behavioral answers (STAR format) | Practice aloud | "Tell me about yourself", "Why Persistent?", "Challenging project" |
| 3:30–4:00 | SQL Quick Practice | [SQL Practice — HackerRank](https://www.hackerrank.com/domains/sql) | Do 5 JOIN + 3 Window Function problems |

### Evening (5 PM – 8 PM): Full Mock Interview
| Time | Activity |
|------|----------|
| 5:00–5:30 | Mock: "Tell me about yourself" + "Walk through RAG project" |
| 5:30–6:00 | Mock: Agentic AI questions (use Q&A bank) |
| 6:00–6:30 | Mock: Code a simple function (pick 3 from DSA practice files) |
| 6:30–7:00 | Mock: System design — "Design a document Q&A bot" |
| 7:00–7:30 | Mock: SQL queries (write 3 from memory) |
| 7:30–8:00 | Review weak spots from mock |

### Night (9 PM – 10:30 PM): Final Revision
| Time | Activity |
|------|----------|
| 9:00–9:30 | Re-read Night-Before Checklist |
| 9:30–10:00 | Skim all talking points one last time |
| 10:00–10:30 | Prepare clothes, resume printout, ID, reach venue plan |
| 10:30 PM | **SLEEP** 🛌 — A rested mind > 2 more hours of cramming |

---

# 📚 Curated Resource Links (Organized by JD2 Requirement)

## Agentic AI
| Resource | Type | Time |
|----------|------|------|
| [What is Agentic AI — IBM](https://www.youtube.com/watch?v=F8NKVhkZZWI) | Video | 15 min |
| [LangGraph Crash Course](https://www.youtube.com/watch?v=R8KB-Zcynxc) | Video | 30 min |
| [CrewAI Tutorial](https://www.youtube.com/watch?v=tnejrr-0a94) | Video | 20 min |
| [AutoGen Explained](https://www.youtube.com/watch?v=vU2S6dVf79M) | Video | 15 min |
| [LangGraph Official Docs](https://langchain-ai.github.io/langgraph/) | Docs | Reference |
| [CrewAI Docs](https://docs.crewai.com/) | Docs | Reference |
| [Agentic AI Patterns Blog](https://www.deeplearning.ai/the-batch/how-agents-can-improve-llm-performance/) | Blog | 10 min |

## RAG & Vector Search
| Resource | Type | Time |
|----------|------|------|
| [RAG from Scratch — LangChain](https://www.youtube.com/watch?v=sVcwVQRHIc8) | Video | 45 min |
| [Advanced RAG Cheatsheet — LlamaIndex](https://www.llamaindex.ai/blog/a-cheat-sheet-and-some-recipes-for-building-advanced-rag-803a9d94c41b) | Blog | 15 min |
| [Vector DB Comparison — Pinecone](https://www.pinecone.io/learn/vector-database/) | Blog | 10 min |
| [LangChain RAG Tutorial](https://python.langchain.com/docs/tutorials/rag/) | Docs | 20 min |
| [Chunking Strategies](https://www.pinecone.io/learn/chunking-strategies/) | Blog | 10 min |

## LLMs & Transformers
| Resource | Type | Time |
|----------|------|------|
| [Andrej Karpathy: Intro to LLMs](https://www.youtube.com/watch?v=zjkBMFhNj_g) | Video | 60 min |
| [Jay Alammar: Illustrated Transformer](https://jalammar.github.io/illustrated-transformer/) | Blog | 30 min |
| [Jay Alammar: Illustrated GPT-2](https://jalammar.github.io/illustrated-gpt2/) | Blog | 20 min |
| [3Blue1Brown: Neural Networks](https://www.youtube.com/playlist?list=PLZHQObOWTQDNU6R1_67000Dx_ZCJB-3pi) | Video | 60 min |
| [HuggingFace NLP Course](https://huggingface.co/learn/nlp-course) | Course | Reference |

## Prompt Engineering
| Resource | Type | Time |
|----------|------|------|
| [Prompt Engineering Guide](https://www.promptingguide.ai/) | Website | 30 min |
| [OpenAI Prompt Engineering Best Practices](https://platform.openai.com/docs/guides/prompt-engineering) | Docs | 15 min |
| [DeepLearning.AI: ChatGPT Prompt Engineering](https://www.deeplearning.ai/short-courses/chatgpt-prompt-engineering-for-developers/) | Course | 1 hr (free) |

## Python / ML
| Resource | Type | Time |
|----------|------|------|
| [Stanford CS-229 ML Cheatsheets](https://github.com/afshinea/stanford-cs-229-machine-learning) | PDF | 30 min skim |
| [Scikit-learn Cheatsheet](https://scikit-learn.org/stable/tutorial/machine_learning_map/) | Visual | 5 min |
| [Python Interview Questions — InterviewBit](https://www.interviewbit.com/python-interview-questions/) | Website | 30 min |

## GenAI Interview Q&A
| Resource | Type | Time |
|----------|------|------|
| [Great Learning: GenAI Interview Qs](https://www.mygreatlearning.com/blog/generative-ai-interview-questions/) | Website | 30 min |
| [InterviewBit: ML Questions](https://www.interviewbit.com/machine-learning-interview-questions/) | Website | 30 min |
| [khangich/machine-learning-interview](https://github.com/khangich/machine-learning-interview) | Repo | Reference |
| [Simplilearn: AI Interview Qs](https://www.simplilearn.com/tutorials/artificial-intelligence-tutorial/artificial-intelligence-interview-questions) | Website | 20 min |

---

# 🎤 Interview Q&A Bank — 50 Questions with Answers

## Section A: Generative AI & LLMs (15 Questions)

**Q1: What is a Large Language Model (LLM)?**
> A neural network trained on massive text data using the Transformer architecture. It learns statistical patterns in language and can generate, summarize, translate, and reason. Examples: GPT-4, Claude, Gemini, Llama.

**Q2: Explain the Transformer architecture.**
> Input → Tokenization → Positional Encoding → Self-Attention (Q,K,V matrices compute relevance between all tokens) → Feed-Forward → Output. Key innovation: self-attention allows parallel processing and captures long-range dependencies.

**Q3: What is self-attention?**
> Mechanism where each token "attends to" all other tokens in the sequence. Computes Query, Key, Value matrices. Attention score = softmax(QK^T / √d) × V. This lets the model understand context — "bank" means different things in "river bank" vs "bank account."

**Q4: BERT vs GPT — what's the difference?**
> BERT = encoder-only, bidirectional (reads left+right), good for understanding (classification, NER, Q&A). GPT = decoder-only, autoregressive (left-to-right), good for generation (text completion, chatbots). Both use Transformers.

**Q5: What is fine-tuning vs RAG vs prompt engineering?**
> - **Prompt Engineering:** Craft better inputs. No model change. Cheapest, fastest.
> - **RAG:** Retrieve relevant docs → inject into prompt. No model change. Best for knowledge injection.
> - **Fine-tuning:** Retrain model on custom data. Changes model weights. Best for behavior/style change.
> Use case: Need company knowledge → RAG. Need model to write in specific tone → fine-tune. Quick experiment → prompt engineering.

**Q6: What is temperature in LLMs?**
> Controls randomness. 0 = deterministic (always picks highest-probability token). 1 = creative/random. For factual tasks: 0–0.3. For creative writing: 0.7–1.0.

**Q7: What are tokens?**
> Subword units that LLMs process. "unhappiness" → ["un", "happiness"]. GPT-4: ~1 token ≈ 4 chars. Billing, context windows, and generation limits are all in tokens.

**Q8: What is the context window?**
> Maximum number of tokens an LLM can process in a single call (input + output). GPT-4o = 128K tokens. Important for RAG: context window limits how much retrieved content you can inject.

**Q9: What is function calling / tool use in LLMs?**
> LLM decides to call a predefined function instead of generating text. You define functions (name, params, description) → LLM outputs a structured JSON call → your code executes the function → result fed back to LLM. Powers agents.

**Q10: OpenAI API vs Azure OpenAI — when to use which?**
> Same models. Azure OpenAI for: enterprise compliance (HIPAA, SOC2), data residency, private deployment, Azure integration. OpenAI for: quick prototyping, latest models first, simpler setup.

**Q11: What is a system prompt?**
> Instruction given to the LLM that sets its behavior, personality, and constraints. Persists across the conversation. Example: "You are a helpful assistant. Only answer from the provided context. If unsure, say 'I don't know.'"

**Q12: What is few-shot prompting?**
> Providing examples in the prompt so the LLM learns the pattern. "Classify sentiment: 'I love it' → Positive. 'Terrible' → Negative. 'It's fine' → ?"

**Q13: What is Chain-of-Thought (CoT) prompting?**
> Adding "Let's think step by step" to make the LLM show reasoning. Dramatically improves accuracy on math, logic, and multi-step problems. Can be zero-shot ("think step by step") or few-shot (show reasoning examples).

**Q14: How do you reduce hallucination?**
> 1. RAG (ground in retrieved docs) 2. Temperature=0 3. System prompt constraints 4. Output validation/parsing 5. Citation tracking 6. Fact-checking chain (second LLM verifies)

**Q15: What is model quantization?**
> Reducing model precision (FP32 → INT8 or INT4) to decrease memory and increase speed. Trade-off: slight accuracy loss for significant performance gain. Tools: GPTQ, GGUF, bitsandbytes. Enables running large models on smaller GPUs.

---

## Section B: RAG & Vector Search (10 Questions)

**Q16: What is RAG (Retrieval-Augmented Generation)?**
> Pattern that combines retrieval (finding relevant docs) with generation (LLM answering). Solves: knowledge cutoff, hallucination, domain-specific answers. Flow: Query → Embed → Search vector DB → Retrieve top-k → Inject as context → LLM generates answer.

**Q17: Walk through your RAG pipeline.**
> "At KPIT, I built a RAG system for diagnostic data:
> 1. **Ingest:** PDF docs → PyPDF extraction
> 2. **Chunk:** RecursiveCharacterTextSplitter (1000 chars, 200 overlap)
> 3. **Embed:** HuggingFace sentence-transformers → 384-dim vectors
> 4. **Store:** FAISS vector index
> 5. **Retrieve:** User query embedded → cosine similarity → top 5 chunks
> 6. **Generate:** Context + query in prompt template → LLM → answer
> 7. **Guardrails:** System prompt constrains answer to provided context"

**Q18: What are embeddings?**
> Dense vector representations of text where semantic meaning is captured. Similar texts → close vectors in high-dimensional space. "king - man + woman ≈ queen." Models: text-embedding-ada-002 (OpenAI), all-MiniLM-L6-v2 (HuggingFace, free).

**Q19: Explain chunking strategies.**
> - **Fixed-size:** Split every N characters. Simple but may break mid-sentence.
> - **Recursive Character:** Splits by paragraphs → sentences → words. Preserves structure.
> - **Sentence splitting:** Each chunk = complete sentences. Good for Q&A.
> - **Semantic chunking:** Group sentences by meaning (embedding similarity). Best quality, most complex.
> Trade-off: Small chunks = precise retrieval but may miss context. Large chunks = more context but noisy.

**Q20: FAISS vs Pinecone vs ChromaDB?**
> - **FAISS:** Facebook library. Local, fast, free. Good for prototyping and medium scale. No managed infra.
> - **Pinecone:** Managed cloud service. Auto-scales, metadata filtering, zero-ops. Best for production.
> - **ChromaDB:** Open-source, easy setup. Good for quick prototyping. Less performant at scale.
> "I used FAISS at KPIT for fast in-memory search. For production at scale, I'd recommend Pinecone."

**Q21: What is cosine similarity?**
> Measures angle between two vectors. cos(θ) = (A·B) / (|A|×|B|). Range: -1 to 1. 1 = identical direction (same meaning), 0 = orthogonal (unrelated). Used in vector search to find similar documents.

**Q22: What is hybrid search?**
> Combining keyword search (BM25/TF-IDF) with vector search (embeddings). Catches both exact matches AND semantic similarity. Weaviate and Pinecone support hybrid search natively.

**Q23: What is reranking?**
> After initial retrieval, a more powerful model (like Cohere Rerank or cross-encoder) re-scores the results for relevance. Improves accuracy on top of basic vector search. Typical flow: vector search → top 20 → reranker → top 5.

**Q24: How do you handle large documents that exceed context window?**
> 1. Chunk into smaller pieces (primary approach via RAG)
> 2. Map-Reduce: summarize each chunk → combine summaries → final answer
> 3. Refine: process chunks sequentially, each refining the previous answer
> 4. Use models with large context windows (GPT-4o: 128K)

**Q25: How do you evaluate a RAG pipeline?**
> Use **Ragas** framework:
> - **Faithfulness:** Is the answer grounded in retrieved context? (not hallucinated)
> - **Answer Relevancy:** Does the answer address the question?
> - **Context Precision:** Are retrieved docs relevant?
> - **Context Recall:** Did we retrieve all relevant docs?
> Also: human evaluation, A/B testing with users.

---

## Section C: Agentic AI (10 Questions)

**Q26: What is Agentic AI?**
> AI systems that autonomously plan, reason, use tools, and take actions to achieve goals. Beyond just generating text — they can search the web, run code, query databases, and collaborate. Key pattern: Perceive → Think → Plan → Act → Observe → Repeat.

**Q27: Explain the ReAct pattern.**
> Reason + Act. The agent: 1) Thinks about what to do (reasoning) 2) Decides which tool to use (action) 3) Observes the result 4) Thinks again based on result. Loop continues until task is complete. Used in LangChain agents.

**Q28: What is LangGraph? How is it different from LangChain?**
> LangChain = linear chains and basic agents. LangGraph = graph-based stateful workflows with loops, conditionals, and parallel execution. Define nodes (agent functions) and edges (transitions). Better for complex multi-step tasks where you need control flow.

**Q29: Explain CrewAI architecture.**
> Role-based multi-agent framework:
> - **Agent:** Has role, goal, backstory, and optional tools
> - **Task:** Description + expected output + assigned agent
> - **Crew:** Team of agents + tasks + process type
> - **Process:** Sequential (one after another) or Hierarchical (manager delegates)
> Example: Research Agent → finds data, Writer Agent → creates report, Editor Agent → reviews.

**Q30: What is AutoGen?**
> Microsoft's multi-agent conversational framework. Agents talk to each other to solve problems:
> - **AssistantAgent:** LLM-powered, generates responses/code
> - **UserProxyAgent:** Executes code, can be human or auto-reply
> - **GroupChat:** Multiple agents in a conversation
> Unique: agents can write AND execute Python code autonomously.

**Q31: When would you use CrewAI vs LangGraph vs AutoGen?**
> - **LangGraph:** Complex workflow with specific control flow (loops, conditions). You need fine-grained control.
> - **CrewAI:** Team of specialized agents, each with a role. Simpler API, good for business workflows.
> - **AutoGen:** Agents need to write/execute code. Research and coding tasks. Conversational problem-solving.

**Q32: How do agents use tools?**
> 1. Define tools with name, description, and function 2. LLM receives tool descriptions 3. Based on user query, LLM decides which tool to call 4. LLM outputs tool name + arguments (structured JSON) 5. Your code executes the tool 6. Result fed back to LLM for final response. OpenAI calls this "function calling."

**Q33: What is agent memory?**
> Short-term: conversation history (buffer memory, window memory). Long-term: vector store of past interactions (search by similarity). Summary: LLM summarizes past conversations. Memory lets agents maintain context across multi-turn interactions and learn from past sessions.

**Q34: How do you evaluate an agent?**
> - Task success rate (did it complete the goal?)
> - Tool selection accuracy (did it pick the right tool?)
> - Number of steps to complete (efficiency)
> - Hallucination rate in final output
> - Latency and cost per task
> - Human satisfaction score

**Q35: How do you handle errors in agent workflows?**
> 1. Retry with modified prompt 2. Fallback to alternative tool 3. Human-in-the-loop escalation 4. Max iteration limit (prevent infinite loops) 5. Graceful degradation (partial answer > no answer) 6. Logging all agent decisions for debugging.

---

## Section D: Python Coding & ML Basics (10 Questions)

**Q36: Write a function to remove vowels from a string.**
```python
def remove_vowels(s):
    return ''.join(c for c in s if c.lower() not in 'aeiou')
```

**Q37: Find duplicates in a list.**
```python
def find_duplicates(arr):
    seen, dups = set(), set()
    for x in arr:
        if x in seen: dups.add(x)
        seen.add(x)
    return list(dups)
```

**Q38: Explain bias-variance tradeoff.**
> Simple model (e.g., linear regression) = high bias (underfits). Complex model (e.g., deep neural net) = high variance (overfits). Goal: find the sweet spot. Fix high bias: more features, complex model. Fix high variance: more data, regularization, simpler model.

**Q39: What is overfitting? How to prevent it?**
> Model performs great on training data but poorly on unseen data. Prevention: regularization (L1/L2), dropout, early stopping, data augmentation, cross-validation, simpler model.

**Q40: Supervised vs Unsupervised vs Reinforcement Learning?**
> - **Supervised:** Labeled data. Predict output. (Classification, regression)
> - **Unsupervised:** No labels. Find patterns. (Clustering, dimensionality reduction)
> - **Reinforcement:** Agent + environment + reward. Learn by trial. (Game AI, robotics)

**Q41: Precision vs Recall vs F1?**
> - **Precision:** Of all predicted positive, how many are actually positive? TP/(TP+FP)
> - **Recall:** Of all actual positives, how many did we find? TP/(TP+FN)
> - **F1:** Harmonic mean of precision and recall. Balances both. 2×(P×R)/(P+R)

**Q42: What is TF-IDF?**
> Term Frequency × Inverse Document Frequency. Measures word importance in a document relative to the entire corpus. High TF-IDF = word is frequent in this doc but rare overall → important. Used for text features before embeddings era.

**Q43: Explain Word2Vec.**
> Neural network that learns word vectors from context. "You shall know a word by the company it keeps." Two methods: CBOW (predict word from context) and Skip-gram (predict context from word). king - man + woman ≈ queen.

**Q44: What is a confusion matrix?**
> Table showing TP, TN, FP, FN for a classification model. Rows = actual labels, columns = predicted. Helps visualize where the model makes errors. From it you derive accuracy, precision, recall, F1.

**Q45: Write SQL: Second highest salary.**
```sql
SELECT MAX(salary) FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);
-- OR with DENSE_RANK:
SELECT salary FROM (
    SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
    FROM employees
) t WHERE rnk = 2;
```

---

## Section E: System Design & Deployment (5 Questions)

**Q46: How would you deploy a GenAI application?**
> 1. **API:** FastAPI/Flask serves the LLM pipeline
> 2. **Containerize:** Docker image with dependencies
> 3. **Orchestrate:** Kubernetes for auto-scaling, health checks
> 4. **Gateway:** API Gateway for rate limiting, auth
> 5. **Monitor:** Prometheus + Grafana for latency, errors, cost per token
> 6. **CI/CD:** GitHub Actions → Docker build → K8s deploy
> 7. **Cache:** Redis for frequent queries

**Q47: Design a document Q&A system.**
> Ingestion: docs → chunk → embed → vector DB. Query: user question → embed → similarity search → top-k contexts + query → LLM → answer. Add: caching (Redis), guardrails (system prompt), monitoring (latency, accuracy), feedback loop (thumbs up/down).

**Q48: How to handle scale in an LLM app (1M users)?**
> - Async processing (Kafka for request queuing)
> - Response caching (Redis — same queries get cached answers)
> - Horizontal scaling (K8s HPA on API pods)
> - LLM load balancing (multiple model instances, or use managed API)
> - Rate limiting per user
> - Vector DB sharding for large document corpora

**Q49: What is CI/CD for ML/GenAI?**
> Code CI/CD (lint, test, deploy) + Data validation (schema checks, drift detection) + Model validation (eval metrics pass threshold) + Deployment pipeline (canary/blue-green) + Monitoring (auto-alert on metric drops). Tools: GitHub Actions, MLflow, Docker, K8s.

**Q50: Explain microservices in context of GenAI.**
> Each AI capability as a separate service:
> - Embedding Service (converts text to vectors)
> - Retrieval Service (vector DB search)
> - Generation Service (LLM inference)
> - Agent Orchestrator (LangGraph/CrewAI)
> Each independently scalable, deployable. Communicate via REST or Kafka. Benefits: scale LLM service independently, update retrieval without touching generation.

---

# ⚡ Quick Revision Cards (Read 5 min before interview)

```
AGENTIC AI = LLM + Tools + Memory + Reasoning + Action Loop

LANGGRAPH = Graph-based stateful agents. Nodes + Edges + Conditions.
CREWAI    = Role-based agent teams. Agent + Task + Crew.
AUTOGEN   = Multi-agent conversations + code execution.

RAG FLOW  = Chunk → Embed → Store → Retrieve → Generate

HALLUCINATION FIX = RAG + Low temp + System prompt + Output validation

VECTOR DB = FAISS (local/fast) | Pinecone (managed) | Chroma (simple)

OPENAI API = client.chat.completions.create(model, messages, temperature)

PROMPT ENG = Zero-shot | Few-shot | Chain-of-Thought | ReAct

DEPLOY = FastAPI → Docker → K8s → API Gateway → Monitor
```

> [!CAUTION]
> **Time management:** Don't get stuck on any single topic. Cover breadth over depth. You can explain concepts at interview level without being an expert. The Q&A bank above covers 90% of what they'll ask. Review it twice and you're solid.
