package org.nav.learning.leetcode

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 */
fun reverseString(s: CharArray) : Unit {
    reverseStringHelper(0, s.size -1, s)
}

private fun reverseStringHelper(start: Int, end: Int, ch: CharArray) {
    if(start >= end ) {
        return;
    }
    ch[start] = (ch[start].toInt() + ch[end].toInt()).toChar()
    ch[end] = (ch[start].toInt() - ch[end].toInt()).toChar()
    ch[start] = (ch[start].toInt() - ch[end].toInt()).toChar()

    reverseStringHelper(start + 1, end - 1, ch)

}
