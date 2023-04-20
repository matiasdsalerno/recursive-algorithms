package com.programmingwithmati.functional.subsequence

fun longestSubsequence(list: List<Int>): List<Int> {
    if (list.isEmpty()) return emptyList()

    val sorted = list
        .distinct()
        .sorted()

    return recSubsequences(sorted.drop(1), initializeResults(sorted))
        .maxByOrNull { it.size }
        ?: emptyList()
}

private fun initializeResults(sorted: List<Int>) = listOf(listOf(sorted.first()))


tailrec fun recSubsequences(remaining: List<Int>, results: List<List<Int>>) : List<List<Int>> {
    if (remaining.isEmpty()) return results

    val current = remaining.first()
    val newResults = if (results.last().last() + 1  == current) results.replaceLast(results.last() + current)
    else results + listOf(listOf(current))

    return recSubsequences(remaining.drop(1), newResults)
}

private fun List<List<Int>>.replaceLast(newLast: List<Int>) = this.dropLast(1) + listOf(newLast)
