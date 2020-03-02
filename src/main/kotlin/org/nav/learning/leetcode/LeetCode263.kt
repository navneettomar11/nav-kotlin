package org.nav.learning.leetcode

fun isUgly(num: Int): Boolean {
    var n = num
    var uglyNumbers = intArrayOf(2,3,5)
    while( n > 1) {
        var uglyFlag = false
        for(nn in uglyNumbers) {
            if(n.rem(nn) == 0) {
                n/=nn
                uglyFlag = true
                break
            }
        }
        //println("N ${n}")

        if(!uglyFlag) {
            break;
        }

    }

    return n === 1
}
