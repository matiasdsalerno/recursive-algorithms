package com.programmingwithmati.functional.subsequence

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SubsequenceTest {


    @Test
    fun testLongestSubsequenceWhenEmpty() {
        assertEquals(emptyList<Int>(), longestSubsequence(emptyList()))
    }

    @Test
    fun testLongestSubsequenceWhenOneItem() {
        assertEquals(listOf(1), longestSubsequence(listOf(1)))
    }

    @Test
    fun testLongestSubsequenceWhenConsecutives() {
        assertEquals(listOf(1,2,3,4), longestSubsequence(listOf(1,2,3,4)))
    }

    @Test
    fun testLongestSubsequenceWhenConsecutivesAndDuplicate() {
        assertEquals(listOf(1,2,3,4), longestSubsequence(listOf(1,2,2,3,3,4)))
    }

    @Test
    fun testLongestSubsequenceWhenNotInOrder() {
        assertEquals(listOf(1,2,3,4), longestSubsequence(listOf(1,4,3,3,2)))
    }

    @Test
    fun testLongestSubsequenceWhen2Subsequences() {
        assertEquals(listOf(1,2,3,4), longestSubsequence(listOf(1,4,3,3,2, 10, 9)))
    }

    @Test
    fun testLongestSubsequenceWhen2SubsequencesAndLongerSequenceIsSecond() {
        assertEquals(listOf(1,2,3,4), longestSubsequence(listOf(9,10,11,1,4,3,3,2)))
    }

    @Test
    fun testLongestSubsequenceWhenNegativeNumbers() {
        assertEquals(listOf(-4,-3,-2,-1), longestSubsequence(listOf(9,10,11,-1,-4,-3,-3,-2)))
    }
}
