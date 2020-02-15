package org.nav.learning.leetcode

import java.lang.NumberFormatException

/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 */
fun multiply(num1: String, num2: String): String {
    val MAX_LEN = 110
    if(num1.length > MAX_LEN || num2.length > MAX_LEN) {
        return "0"
    }
    try{
        var n1 = num1.toBigInteger()
        var n2 = num2.toBigInteger()
        return (n1 * n2).toString()
    }catch (nbex: NumberFormatException) {
        return "0"
    }

}
