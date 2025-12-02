# Advent of Code 2025 — Kotlin Solutions

This repository contains my personal solutions to **Advent of Code 2025**, implemented primarily in **Kotlin**, with lightweight shell scripts to streamline execution. Each day’s puzzle is organized into its own directory and includes separate files for Part 1 and Part 2 when applicable.

## Structure

```
advent-of-code-2025/
│
├── day1/
│   ├── part1.kt
│   ├── part2.kt
│   └── input.txt
│
├── run.sh
└── README.md
```

* **dayX/**: Contains source files and input data for that day.
* **run.sh**: Convenience script for compiling and running solutions.

## Running Solutions

You can execute any day’s solution via:

```bash
./run.sh <day> <part>
```

Example:

```bash
./run.sh 1 2
```

This will compile and run `day1/part2.kt` using the corresponding `input.txt`.

## Requirements

* Kotlin (JVM)
* JDK 17 or later
* Bash (for the run script)

## Notes

* Input files are not modified and follow the exact format provided by Advent of Code.
* Solutions are written for clarity first and optimization second unless otherwise noted.
* This repository is for educational and archival purposes; puzzle inputs are unique per user.
