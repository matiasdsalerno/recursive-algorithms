package com.programmingwithmati.functional.subsequence


fun encodeString(string: String): String {
    val result = goLengthEncoding(string.toList().drop(1), listOf(string.first() to 1))
        .joinToString(separator = "") { pairToString(it) }
    return if (result.length > string.length) string else result
}

private fun pairToString(pair: Pair<Char, Int>) =
    if (pair.second != 1) "${pair.first}${pair.second}" else "${pair.first}"

fun <T> lengthEncoding(list: List<T>): List<Pair<T, Int>> {
    return goLengthEncoding(list, listOf(list.first() to 1))
}

tailrec fun <T> goLengthEncoding(list: List<T>, result: List<Pair<T, Int>>): List<Pair<T, Int>> {
    return when {
        list.isEmpty() -> result
        list.first() == result.last().first -> goLengthEncoding(list.tail(), addOneToResultLast(result, list.first()))
        else -> goLengthEncoding(list.tail(), result + (list.first() to 1))
    }
}

private fun <T> List<T>.tail() = this.drop(1)

private fun <T> addOneToResultLast(
    result: List<Pair<T, Int>>,
    head: T
) = result.dropLast(1) + (head to result.last().second + 1)
