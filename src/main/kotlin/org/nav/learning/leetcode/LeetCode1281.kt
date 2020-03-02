package org.nav.learning.leetcode

/**
 * <h2>Subtract the Product and Sum of Digits of an Integer</h2>
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
fun subtractProductAndSum(n: Int): Int {
    var num = n
    var prod = 1
    var sum = 0
    while(num > 0) {
        var rem = num.rem(10)
        prod*=rem
        sum+=rem
        num/=10
    }
    //println("Product --> ${prod}")
    //println("Sum ---> ${sum}")
    return prod - sum;
}
