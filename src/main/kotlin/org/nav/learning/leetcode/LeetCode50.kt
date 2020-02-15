package org.nav.learning.leetcode

/**
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 */
fun myPow(x: Double, n: Int): Double {
    if(n == 0){
        return 1.0;
    }
    if(n==1){
        return x;
    }
    if(n < 0){
        return 1 / x * myPow(1 / x, -(n + 1));
    }
    if(n%2 != 0){
        return x * myPow(x * x, n / 2);
    }
    return myPow(x * x, n / 2);
}
