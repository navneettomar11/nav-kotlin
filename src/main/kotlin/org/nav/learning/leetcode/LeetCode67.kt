package org.nav.learning.leetcode

import java.math.BigInteger

/**
 * <h2>Add Binary</h2>
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 */
fun toNumber(binary: String) : BigInteger {
    var num = BigInteger.ZERO
    for(ch in binary.toCharArray()) {
        var n = Character.getNumericValue(ch)
        num = num.multiply(2.toBigInteger()).add(n.toBigInteger())
    }
    return num
}

fun toBinary(num: BigInteger): String {
    if(num.compareTo(BigInteger.ZERO)===0) {
        return "0"
    }
    var n = num
    var buffer = StringBuilder()

    while(n.compareTo(BigInteger.ZERO) !== 0) {
        buffer.append(n.rem(2.toBigInteger()))
        n /= 2.toBigInteger()
    }
    return buffer.reverse().toString()
}

fun addBinary(a: String, b: String): String {
    return toBinary(toNumber(a).add(toNumber(b)))
}
