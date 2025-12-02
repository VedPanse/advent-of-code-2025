#!/usr/bin/env bash
set -euo pipefail

if [[ $# -ne 2 ]]; then
  echo "Usage: $0 <day> <part>  # e.g. $0 1 2 to run day1/part2.kt" >&2
  exit 1
fi

DAY="$1"
PART="$2"

KOTLIN_FILE="day${DAY}/part${PART}.kt"

if [[ ! -f "$KOTLIN_FILE" ]]; then
  echo "Error: Kotlin file '$KOTLIN_FILE' not found." >&2
  exit 1
fi

if ! command -v kotlinc >/dev/null 2>&1; then
  echo "Error: 'kotlinc' not found in PATH. Please install the Kotlin compiler." >&2
  exit 1
fi

if ! command -v java >/dev/null 2>&1; then
  echo "Error: 'java' not found in PATH. Please install a JDK." >&2
  exit 1
fi

TMP_JAR="$(mktemp /tmp/kotlin-run-XXXXXX.jar)"
cleanup() {
  rm -f "$TMP_JAR"
}
trap cleanup EXIT

kotlinc "$KOTLIN_FILE" -include-runtime -d "$TMP_JAR"
java -jar "$TMP_JAR"
