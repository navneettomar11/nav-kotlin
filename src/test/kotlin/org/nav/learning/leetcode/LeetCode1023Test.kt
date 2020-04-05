package org.nav.learning.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LeetCode1023Test {
    val leetCode1023 = LeetCode1023()

    @Test
    fun `camel case match test case 01`() {
        var result = leetCode1023.camelMatch(arrayOf("FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"), "FB")
        assertArrayEquals(booleanArrayOf(true,false,true,true,false), result)
    }

    @Test
    fun `camel case match test case 02`() {
        var result = leetCode1023.camelMatch(arrayOf("FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"), "FoBa")
        assertArrayEquals(booleanArrayOf(true,false,true,false,false), result)
    }

    @Test
    fun `camel case match test case 03`() {
        var result = leetCode1023.camelMatch(arrayOf("FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"), "FoBaT")
        assertArrayEquals(booleanArrayOf(false,true,false,false,false), result)
    }

}
