import java.io.File

fun main() {
    var pointer = 50
    var zeroCount = 0

    File("day1/input.txt").forEachLine { line ->
        val dir = if (line[0] == 'L') -1 else 1
        val amount = line.substring(1).toInt()

        repeat(amount) {
            pointer = (pointer + dir + 100) % 100
            if (pointer == 0) zeroCount++
        }
    }

    println(zeroCount)
}
