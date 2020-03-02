package org.nav.learning.leetcode

/**
 * <h2>Happy Number</h2>
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 */
fun isHappy(n: Int): Boolean {
    var alreadyExists = mutableSetOf<Int>()
    var num = n
    while (num !== 1) {
        alreadyExists.add(num)
        var tmpNum = num
        var sumSqureNbr = 0
        while(tmpNum > 0) {
            var rem = tmpNum.rem(10)
            sumSqureNbr+=rem * rem
            tmpNum = tmpNum.div(10)
            //println("Rem --> ${rem} Sum ${sumSqureNbr} tmpNum ${tmpNum}")
        }
        num = sumSqureNbr
        if(alreadyExists.contains(num)) {
            break
        }
    }
    return num === 1
}
