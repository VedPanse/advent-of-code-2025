import java.io.File
import kotlin.math.*

fun main() {
    var total: Int = 0
    File("day3/input.txt").forEachLine { line ->
        val n: Int = line.length
        var number: Int = line[0].digitToInt() * 10 + line[1].digitToInt()
        var l: Int = 0
        var r: Int = 1

        while (r < n) {
            val thisNumber: Int = line[l].digitToInt() * 10 + line[r].digitToInt()

            number = max(thisNumber, number)
            if (line[l] < line[r]) {
                l = r
            }
            r++
        }
        total += number
    }

    println("total: $total")
}