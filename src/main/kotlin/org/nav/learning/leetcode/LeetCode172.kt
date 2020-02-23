package org.nav.learning.leetcode

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 */
fun trailingZeroes(n: Int): Int {

    return if (n === 0) 0 else n / 5 + trailingZeroes(n / 5)
 }

private fun factorial(n: Int) : Int {
    if(n == 0) {
        return 1
    }
    return n * factorial(n -1)
}
