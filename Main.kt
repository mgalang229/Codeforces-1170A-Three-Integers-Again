
fun main(args: Array<String>) {
    val tc = readln().toInt()
    for (t in 0 until tc) {
        var (x, y) = readln().split(" ").map { it.toInt() }
        if (x < y) {
            y = x.apply { x = y }
        }
        println("${x - y + 1} 1 ${y - 1}")
    }
}
