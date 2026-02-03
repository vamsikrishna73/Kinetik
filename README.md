# 🚀 Kinetik

**Kinetik** is a configuration‑driven Android animation engine with a Gradle plugin that enables **zero‑touch UI animations** at both **compile time** and **runtime**.

> Move UI elements, define triggers, and turn them into animations — without modifying app code.

---

## ✨ Key Features

* ⚡ Config‑driven animations (no hardcoding)
* 🧩 Zero app‑code changes (ASM bytecode injection)
* 🧠 Runtime animation engine
* 🎨 Supports **Android Views** and **Jetpack Compose**
* 🔁 Trigger‑based execution (screen, events, lifecycle)
* 🧱 SDK‑friendly and scalable

---

## 📦 Project Structure

```text
kinetik/
├── kinetik-runtime/
│   ├── AnimatorEngine.kt
│   ├── TargetResolver.kt
│   ├── ViewExecutor.kt
│   ├── ComposeExecutor.kt
│   ├── TriggerManager.kt
│   └── ScreenTracker.kt
│
├── kinetik-gradle-plugin/
│   ├── KinetikPlugin.kt
│   ├── ASMVisitor.kt
│   └── TransformUtils.kt
│
└── samples/
```

---

## 🧠 High‑Level Architecture

```text
┌──────────────┐
│ Animation    │
│ Configuration│
└──────┬───────┘
       │
       ▼
┌──────────────┐
│ Target       │
│ Resolver     │
└──────┬───────┘
       │
       ▼
┌──────────────┐
│ Animator     │
│ Engine       │
└──────┬───────┘
       │
 ┌─────┴─────────────┐
 │                   │
 ▼                   ▼
ViewExecutor     ComposeExecutor
```

---

## 🧩 Modules Explained

### 1️⃣ kinetik‑runtime

Handles **runtime animation execution**.

| Component         | Description                     |
| ----------------- | ------------------------------- |
| `AnimatorEngine`  | Central animation coordinator   |
| `TargetResolver`  | Maps config → actual UI element |
| `ViewExecutor`    | Executes animations on Views    |
| `ComposeExecutor` | Executes animations on Compose  |
| `TriggerManager`  | Event & lifecycle triggers      |
| `ScreenTracker`   | Tracks visible screens          |

---

### 2️⃣ kinetik‑gradle‑plugin

Handles **compile‑time bytecode manipulation** using ASM.

| Component        | Description                 |
| ---------------- | --------------------------- |
| `KinetikPlugin`  | Gradle plugin entry point   |
| `ASMVisitor`     | Injects hooks into bytecode |
| `TransformUtils` | Bytecode helpers            |

✔ No manual Activity / View changes required

---

## ⚙️ How It Works

1. Gradle plugin injects lifecycle & view hooks at build time
2. App starts → `ScreenTracker` detects active screen
3. Config defines animation targets & triggers
4. `AnimatorEngine` resolves target
5. Executor applies animation

---

## 🧪 Samples

The `samples/` module contains:

* Demo apps
* Example animation configs
* Integration references

---

## 🚧 Getting Started (Coming Soon)

```text
- Plugin installation
- Runtime initialization
- Animation config format
- Sample animations
```

---

## 🛣 Roadmap

* [ ] Visual animation editor
* [ ] Gesture‑based triggers
* [ ] Remote config support
* [ ] iOS engine (future)

---

## 🤝 Contributing

Contributions, ideas, and discussions are welcome.

---

## 📄 License

TBD