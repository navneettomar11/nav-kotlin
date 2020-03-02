package org.nav.learning.leetcode

/**
 * <h2>Self Dividing Numbers</h2>
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 */
fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    var selfDividingNumberList = mutableListOf<Int>()
    var l = left
    while( l <= right) {
       var n = l
       while ( n > 0) {
           var rem = n.rem(10)
           if(rem==0 || l.rem(rem) !== 0) {
               break
           }
           n/=10
       }
        if(n == 0) {
            selfDividingNumberList.add(l)
        }
        l++
    }
    return selfDividingNumberList
}
