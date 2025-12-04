import java.io.File

fun main() {
    val grid = File("day4/input.txt").readLines()
    val h = grid.size
    val w = grid[0].length
    var total: Int = 0

    for (i in 0 until h) {
        for (j in 0 until w) {
            if (grid[i][j] != '@') continue
            val n: Int = countNeighbors(i, j, grid)

            if (n < 4) total++
        }
    }

    println("total: $total")
}

val dirs8 = listOf(
    -1 to -1, -1 to 0, -1 to 1,
     0 to -1,          0 to 1,
     1 to -1,  1 to 0, 1 to 1
)

fun countNeighbors(i: Int, j: Int, grid: List<String>): Int {
    val h = grid.size
    val w = grid[0].length

    return dirs8.count { (di, dj) ->
        val ni = i + di
        val nj = j + dj
        ni in 0 until h && nj in 0 until w && grid[ni][nj] == '@'
    }
}
