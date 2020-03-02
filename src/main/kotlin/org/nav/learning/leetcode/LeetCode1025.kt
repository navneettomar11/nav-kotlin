package org.nav.learning.leetcode

fun divisorGame(N: Int): Boolean {
    var x = 1
    var n = N
    while( x < n) {
        x+=1
    }
    return x.rem(2)==0
}
