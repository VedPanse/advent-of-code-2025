import java.io.File
import kotlin.math.*

fun main() {
    var total: Long = 0
    File("day3/input.txt").forEachLine { line ->
        val stack = ArrayDeque<Char>()

        var deletions: Int = line.length - 12

        for (digit in line) {
            while (!stack.isEmpty() && deletions > 0 && digit > stack.last()) {
                stack.removeLast()
                deletions--
            }
            stack.addLast(digit)
        }

        var number: Long = stack.take(12).joinToString("").toLong()

        total += number
    }

    println("total: $total")
}