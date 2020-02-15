package org.nav.learning.leetcode

import java.lang.Math.abs
import java.lang.Math.pow
import java.math.BigInteger

/**
 * Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
fun reverseInt(x: Int): Int {
    var xx = x
    var num = 0
    var prevNum = 0
    while (xx !== 0) {
        val currNum = xx.rem(10)
        num = num * 10 + currNum
        if ((num - currNum) / 10 != prevNum) {
            return 0
        }
        xx = xx.div(10)
        prevNum = num
    }
    return num
}
