package org.nav.learning.leetcode

import java.lang.Math.abs

/**
 * <h2>Divide Two Integers</h2>
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 * Return the quotient after dividing dividend by divisor.
 * The integer division should truncate toward zero.
 */
fun divideTwoInt(dividend: Int, divisor: Int): Int {
    if (dividend === Integer.MIN_VALUE && divisor === -1) {
        return Integer.MAX_VALUE;
    }
    val isNegative = if(dividend.toLong() * divisor.toLong() < 0 ) -1 else 1
    var quotient:Long = 0
    var dd = abs(dividend.toLong())
    var dr = abs(divisor.toLong())
    while(dd >= dr) {
        dd-=dr
        quotient+= 1
    }

    return (isNegative * quotient).toInt()
}
