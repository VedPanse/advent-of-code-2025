import java.io.File

fun main() {
    var zeroCount: Int = 0
    var pointer: Int = 50

    File("day1/input.txt").forEachLine { line ->
        val rotation: Char = line[0];
        val value: Int = line.substring(1).toInt();

        pointer += if (rotation == 'R') value else -value
        pointer %= 100

        if (pointer == 0) zeroCount++
    }

    println("ZeroCount: $zeroCount")
}