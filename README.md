# Kinetik ⚡

Kinetik is a configuration-driven Android animation engine that enables
zero-touch UI animations using a Gradle plugin and a lightweight runtime.

It supports **Jetpack Compose and View-based UIs**, allowing animations
to be defined remotely without changing app code.

---

## ✨ Why Kinetik?

Modern Android apps require:
- Rapid UI experimentation
- A/B testing animations
- Feature-flag driven motion
- No redeployments for animation changes

Kinetik solves this by combining **compile-time instrumentation** with
**runtime animation orchestration**.

---

## 🧠 How It Works

1. **Gradle Plugin**
   - Instruments Activities, Fragments, and Compose entry points
   - Injects lifecycle and navigation hooks at compile time

2. **Runtime Engine**
   - Receives screen & UI events
   - Resolves target views / composables
   - Applies animations dynamically

3. **Configuration Layer**
   - Animations are defined via JSON / DSL
   - Can be served remotely or bundled locally

---

## 🚀 Features

- Zero-touch animation injection
- Jetpack Compose screen tracking
- View & Compose interoperability
- Configuration-driven animations
- No reflection, no accessibility hacks
- Safe bytecode instrumentation (AGP 8+)

---

## 📦 Modules

kinetik-gradle-plugin/
kinetik-runtime/
samples/

---

## 🧩 Supported UI Stacks

- ✅ Jetpack Compose
- ✅ Android Views
- 🔜 React Native
- 🔜 Flutter

---

## 🛠 Installation

> Coming soon

---

## 📖 Documentation

> Coming soon

---

## 🧪 Status

Kinetik is currently **under active development**.

---

## 📄 License

Apache License 2.0
