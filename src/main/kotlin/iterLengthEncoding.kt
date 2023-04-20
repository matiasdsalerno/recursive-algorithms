
fun iterEncodeString(string: String): String {
    val pairs = ArrayList<Pair<Char,Int>>()

    string.forEach {
        when {
            pairs.isEmpty() -> pairs.add(it to 1)
            it == pairs.last().first -> pairs.addOneToResultLastMutable(it)
            else -> pairs.add(it to 1)
        }
    }
    val result = pairs.joinToString(separator = "") { if (it.second != 1) "${it.first}${it.second}" else "${it.first}" }

    return if (result.length > string.length) string else result
}

private fun <T> ArrayList<Pair<T, Int>>.addOneToResultLastMutable(
    it: T
) {
    val removeLast = this.removeLast()
    this.add(it to removeLast.second + 1)
}

fun main() {

    val s: String = readLine()!!

    val out_: String = iterEncodeString(s)
    print("$out_")
}
