package org.nav.learning.leetcode

import java.lang.Integer.min

fun nthUglyNumber(n: Int): Int {
    var uglyNumberList = Array<Int>(n){
        0
    }
    var idx = 1
    var t2 = 0
    var t3 = 0
    var t5 = 0
    uglyNumberList[0] = 1
    while(idx < n) {
        uglyNumberList[idx] =  min(uglyNumberList[t2]*2, min(uglyNumberList[t3]*3, uglyNumberList[t5]*5))
        //println("Idx ${idx} T2 ${t2} T3 ${t3} T5 ${t5} KT2 ${uglyNumberList[t2]} KT3 ${uglyNumberList[t3]} KT5 ${uglyNumberList[t5]}, KIdx ${uglyNumberList[idx]}")
        if(uglyNumberList[idx] === uglyNumberList[t2]*2) t2++
        if(uglyNumberList[idx] === uglyNumberList[t3]*3) t3++
        if(uglyNumberList[idx] === uglyNumberList[t5]*5) t5++

        idx++
    }
    //println(uglyNumberList.contentToString())
    return uglyNumberList[n-1]
}
