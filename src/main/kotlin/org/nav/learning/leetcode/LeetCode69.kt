package org.nav.learning.leetcode

import java.math.BigInteger

/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 */
fun mySqrt(x: Int) : Int {
    var n = x.toBigInteger();
    if(n.compareTo(BigInteger.ZERO) === 0 || n.compareTo(BigInteger.ONE)===0) {
        return n.toInt()
    }

    var idx = BigInteger.ONE
    while( idx.multiply(idx).compareTo(n) <= 0  ) {
        idx++
    }
    return idx.toInt() - 1
}


