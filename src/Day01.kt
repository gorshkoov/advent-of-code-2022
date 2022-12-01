fun main() {
    fun part1(input: List<String>): Int {
        var counter = 0
        return input
            .map { if (it == "") 0 else it.toInt() }
            .groupBy { if (it == 0) counter++ else counter }
            .map { it.value.sum() }
            .max()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("test")
    val result = part1(testInput)

    println("Result: $result")
}
