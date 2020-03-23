package org.nav.learning.leetcode

/**
 * Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
fun numberOfSteps (num: Int): Int {

    var n = num;
    var count =0;
    while(n > 0) {
        var rem =n.rem(2)
        //println("N : ${n} Rem ${rem}")
        n = if( rem === 1) n-rem else n/2
        count++
    }
    return count
}
