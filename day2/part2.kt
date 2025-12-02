import java.io.File

fun isInvalid(input: String): Boolean {
    if (input.length == 2) return input[0] == input[1]

    if (input.length % 2 != 0) return false

    for (i in (input.length / 2) ..< input.length)
        if (input[i] != input[i - (input.length / 2)])
            return false
    
    return true
}

fun main() {
    var total: Long = 0

    File("day2/input.txt").forEachLine() { line ->
        val ids = line.split(",")

        for (i in 0 until ids.size) {
            val low: Long = ids[i].split("-")[0].toLong()
            val high: Long = ids[i].split("-")[1].toLong()

            for (j in low .. high)  {
                if (isInvalid(j.toString())) {
                    total += j
                }
            }
        }
     }

     println(total)
}