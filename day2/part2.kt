import java.io.File

fun isInvalid(s: String): Boolean {
    val n = s.length
    val lps = IntArray(n)

    // Build LPS (Longest Prefix Suffix)
    var len = 0
    var i = 1
    while (i < n) {
        if (s[i] == s[len]) {
            len++
            lps[i] = len
            i++
        } else {
            if (len != 0) {
                len = lps[len - 1]
            } else {
                lps[i] = 0
                i++
            }
        }
    }

    val longest = lps[n - 1]
    return longest > 0 && n % (n - longest) == 0
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