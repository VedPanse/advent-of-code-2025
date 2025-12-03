# Advent of Code 2025 — Kotlin Solutions  
<img width="942" height="473" alt="image" src="https://github.com/user-attachments/assets/0aba343a-b332-4eb2-83d6-3c81d79d6cf3" />

Fast, clean, and fully reproducible solutions for **Advent of Code 2025**, written in **Kotlin** with a lightweight runner script for daily execution.

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.9-blueviolet?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Advent%20of%20Code-2025-red?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Solutions-Updated%20Daily-green?style=for-the-badge" />
  <img src="https://img.shields.io/github/stars/VedPanse/advent-of-code-2025?style=for-the-badge" />
</p>

---

## 📌 About This Repository
This repository contains **clean, well-structured, and fully runnable** Kotlin implementations for every Advent of Code 2025 puzzle.

The goal of this repo is:
- ✨ Provide easy-to-read Kotlin implementations  
- ⚡ Keep solutions efficient without sacrificing clarity  
- 🔁 Offer a simple `run.sh` to instantly execute any day/part  
- 📚 Serve as a reference for developers learning Kotlin or AoC patterns  

If you're solving AoC in Kotlin or looking for patterns, this repo is a great place to start.

---

## 🧭 Directory Structure

```
advent-of-code-2025/
│
├── day1/
│   ├── part1.kt
│   ├── part2.kt
│   └── input.txt
│
├── day2/
│   ├── part1.kt
│   ├── part2.kt
│   └── input.txt
│
├── day3/
│   ├── part1.kt
│   ├── part2.kt
│   └── input.txt
│
├── run.sh
└── README.md
```

Each folder contains:
- `part1.kt`
- `part2.kt`
- `input.txt`

---

## 🚀 Running Any Solution

Just use the included runner script:

```bash
./run.sh <day> <part>
```

Example:

```bash
./run.sh 3 2
```

This automatically compiles and runs:
```
day3/part2.kt
```

---

## 📅 Progress Tracker (Auto-Updated Daily)

| Day | Part 1 | Part 2 |
|-----|--------|--------|
| 1 | ✅ Completed | ✅ Completed |
| 2 | ✅ Completed | ✅ Completed |
| 3 | ✅ Completed | ✅ Completed |
| 4 | ⏳ Pending | ⏳ Pending |
| 5 | ⏳ Pending | ⏳ Pending |
| ... | ... | ... |
| 25 | ⏳ Pending | ⏳ Pending |

---

## 🧠 Why Kotlin?

Kotlin hits a sweet spot for Advent of Code:
- Strong standard library  
- Very expressive data transformations  
- Interop with JVM tools  
- Clean syntax that remains readable under pressure  

These puzzles heavily reward languages with concise expressions and fast iteration — Kotlin excels at both.

---

## 🛠️ Requirements

- **Kotlin (JVM)**  
- **JDK 17+**  
- **Bash** (for the run script)

---

## 🔍 Example Code (from one of the days)

```kotlin
fun main() {
    val input = File("day3/input.txt").readLines()
    // Your puzzle logic here
}
```

The repo avoids unnecessary abstraction so readers can clearly follow the logic for each day's challenge.

---

## 🎯 Goals for This Repository

- Solve **all 25 days**
- Provide **idiomatic Kotlin** examples
- Keep solutions clean enough for beginners
- Keep execution fast
- Maintain daily updates during Advent

---

## ⭐ If you find this useful…

Please consider **starring the repository** — it helps visibility and motivates further updates!

<p align="center">
  <a href="https://github.com/VedPanse/advent-of-code-2025">
    <img src="https://img.shields.io/github/stars/VedPanse/advent-of-code-2025?style=social" />
  </a>
</p>

---

## 📫 Contact / Links

- GitHub: https://github.com/VedPanse  
- Portfolio: https://vedpanse.com  

---

## 🎄 Happy Advent of Code 2025!

Good luck on the leaderboard, and enjoy the puzzles!
