package com.programmingwithmati.functional.subsequence

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LenghtencodingTest {

    @Test
    fun lengthEncodingWhenEmpty() {
        assertEquals(emptyList<Pair<Int,Int>>(), lengthEncoding(emptyList<Int>()))
    }

    @Test
    fun lengthEncodingWhenOneValue() {
        assertEquals(listOf(2 to 1), lengthEncoding(listOf(2)))
    }

    @Test
    fun lengthEncodingWhenTwoOfSame() {
        assertEquals(listOf(2 to 2), lengthEncoding(listOf(2,2)))
    }

    @Test
    fun lengthEncodingWhenTwoDifferent() {
        assertEquals(listOf(2 to 2, 3 to 1), lengthEncoding(listOf(2,2,3)))
    }

    @Test
    fun lengthEncodingWhenTwoSameNotConsecutive() {
        assertEquals(listOf(2 to 2, 3 to 1, 2 to 1), lengthEncoding(listOf(2,2,3,2)))
    }

}
