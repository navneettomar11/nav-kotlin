package org.nav.learning.leetcode

import java.lang.Math.max
import java.lang.Math.pow

/**
 * <h2>Maximum 69 Number</h2>
 * Given a positive integer num consisting only of digits 6 and 9.
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */
fun maximum69Number (num: Int): Int {
    return num.toString().replaceFirst('6', '9').toInt()
}

