#!/usr/bin/env bash
set -euo pipefail

if [[ $# -ne 1 ]]; then
  echo "Usage: $0 path/to/File.kt" >&2
  exit 1
fi

KOTLIN_FILE="$1"

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
