package com.programmingwithmati.functional.subsequence

fun <T: Comparable<T>> qsort(list: List<T>) : List<T> {
    if (list.size <= 1) return list

    val pivot = list.first()
    val leftList = list.filter { it < pivot }
    val pivotList = listOf(pivot)
    val rightList = list.filter { it > pivot }

    return qsort(leftList) + pivotList + qsort(rightList)
}

