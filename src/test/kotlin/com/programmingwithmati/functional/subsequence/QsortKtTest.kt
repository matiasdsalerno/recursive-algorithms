package com.programmingwithmati.functional.subsequence

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class QsortKtTest {

    @Test
    fun testQsort() {
        assertEquals(listOf(1,2,5,7),  qsort(listOf(2,7,5,1)))
    }
}
