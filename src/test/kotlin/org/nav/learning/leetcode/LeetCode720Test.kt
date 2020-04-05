package org.nav.learning.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LeetCode720Test {

    var leetCOde720 = LeetCode720()

    @Test
    fun `longest word test case 01`() {
        var result = leetCOde720.longestWord(arrayOf("w", "wo", "wor", "worl", "world"))
        assertEquals("world", result)
    }


    @Test
    fun `longest word test case 02`() {
        var result = leetCOde720.longestWord(arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple"))
        assertEquals("apple", result)
    }

    @Test
    fun `longest word test case 03`() {
        var result = leetCOde720.longestWord(arrayOf("b","br","bre","brea","break","breakf","breakfa","breakfas","breakfast","l","lu","lun","lunc","lunch","d","di","din","dinn","dinne","dinner"))
        assertEquals("breakfast", result)
    }

    @Test
    fun `longest word test case 04`() {
        var result = leetCOde720.longestWord(arrayOf("t","ti","tig","tige","tiger","e","en","eng","engl","engli","englis","english","h","hi","his","hist","histo","histor","history"))
        assertEquals("english", result)

    }

    @Test
    fun `longest word test case 05`() {
        var result = leetCOde720.longestWord(arrayOf("m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"))
        assertEquals("latte", result)
    }
}
