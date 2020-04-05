package org.nav.learning.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LeetCode648Test {

    val leetCode648 = LeetCode648()

    @Test
    fun `replace words test case 01`() {
        var result = leetCode648.replaceWords(listOf("cat", "bat", "rat"), "the cattle was rattled by the battery")
        assertEquals("the cat was rat by the bat", result)
    }
}
