# 📁 Interview Archive — Bhanu

> Consolidated record of interview experiences, learnings, and prep material.
> **Keep this for reference — don't delete.**

---

## Persistent Systems Interview — Feb 28, 2026

**Role Applied:** Gen AI/Agentic AI Engineer (JD2)
**Outcome:** Not selected

### What Went Well
- Explained RAG flow clearly (document ingestion → chunking → embeddings → vector search → LLM generation)
- Described KPIT chatbot project confidently
- Explained Transformer self-attention mechanism

### Where I Fell Short

| Gap | What I Said | Correct Answer |
|-----|------------|---------------|
| **Hallucination** | "AI checks pre-trained knowledge" | Pre-trained knowledge IS the problem. Grounding = anchoring to retrieved docs. Model says "I don't know" if not in context. |
| **Temperature range** | "0 to 1" (confidently wrong) | **OpenAI: 0 to 2.** Claude/Gemini also 0–2. |
| **LLM eval metrics** | Couldn't answer | BLEU, ROUGE, BERTScore, Ragas (faithfulness, answer relevancy, context precision/recall), Perplexity, LLM-as-Judge |
| **Code from memory** | Couldn't write RAG pipeline imports | Must memorize: `from langchain_community...`, `HuggingFaceEmbeddings`, `FAISS.from_documents`, `RetrievalQA` |
| **Coding on paper** | Froze without IDE | Practice writing code on paper **3x per week** — non-negotiable |

### Key Quote from Interviewer
> *"We want someone who knows"* — meaning hands-on, practiced knowledge, not surface-level concepts.

### Core Lesson
> **Knowing ABOUT something ≠ KNOWING it.** Certificates without muscle memory = zero interview value.
> Next time: code the RAG pipeline on paper first. Then go to the interview.

---

## RAG Pipeline — Must-Memorize Code (Write from Memory Weekly)

```python
# MEMORIZE THIS — write it on paper 3x per week
from langchain_community.document_loaders import PyPDFLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain_community.embeddings import HuggingFaceEmbeddings
from langchain_community.vectorstores import FAISS
from langchain_openai import ChatOpenAI
from langchain.chains import RetrievalQA

loader = PyPDFLoader("data.pdf")
docs = loader.load()
splitter = RecursiveCharacterTextSplitter(chunk_size=1000, chunk_overlap=200)
chunks = splitter.split_documents(docs)
embeddings = HuggingFaceEmbeddings(model_name="all-MiniLM-L6-v2")
vectorstore = FAISS.from_documents(chunks, embeddings)
llm = ChatOpenAI(model="gpt-4o-mini", temperature=0)
qa = RetrievalQA.from_chain_type(llm=llm, retriever=vectorstore.as_retriever())
answer = qa.invoke({"query": "your question here"})
```

```python
# OpenAI API — also memorize
from openai import OpenAI
client = OpenAI()
response = client.chat.completions.create(
    model="gpt-4o",
    messages=[
        {"role": "system", "content": "You are a helpful assistant."},
        {"role": "user", "content": "your question"}
    ],
    temperature=0.7  # range: 0–2 on OpenAI
)
print(response.choices[0].message.content)
```

---

## Top Interview Facts — Never Get These Wrong Again

| Fact | Value |
|------|-------|
| OpenAI temperature range | **0 to 2** (not 0 to 1) |
| Hallucination fix | Ground in retrieved docs. System prompt: "Only answer from context. If unsure, say I don't know." |
| FAISS similarity | Normalize vectors → use IndexFlatIP (inner product = cosine similarity) |
| FAISS vs Pinecone | FAISS: local, fast, free. Pinecone: managed, auto-scales, production-ready |
| LLM eval: RAG | **Ragas** → Faithfulness + Answer Relevancy + Context Precision + Context Recall |
| LLM eval: general | BLEU (translation), ROUGE (summarization), BERTScore (semantic), Perplexity |
| LangGraph vs LangChain | LangChain: linear chains. LangGraph: stateful graph with loops + conditionals |
| CrewAI structure | Agent (role+goal+backstory) → Task → Crew → kickoff() |

---

## JD2 Role Analysis — Why I Chose It Over JD1

| Factor | JD1: Sr AI/ML Engineer | JD2: Gen AI/Agentic AI Engineer |
|--------|------------------------|----------------------------------|
| Domain | U.S. Healthcare (HIPAA, EHR, Claims) | Generic / any domain |
| My Match | ❌ No healthcare knowledge | ✅ RAG, LangChain, Docker, REST APIs |
| Key Frameworks | PyTorch/TF + SageMaker + Databricks | LangChain/LangGraph + FastAPI + Docker |
| My Readiness | 20% | 55% |

**Lesson:** For next GenAI interview, close these gaps:
1. LangGraph (write from memory)  
2. OpenAI function calling / tool use
3. LLM evaluation metrics (Ragas fluency)
4. FastAPI structure (write from memory)
