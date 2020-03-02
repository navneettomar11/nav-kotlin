package org.nav.learning.leetcode

fun diStringMatch(S: String): IntArray {
    var arr = IntArray(S.length + 1)
    var left = 0
    var right = S.length
    var idx = 0
    for(ch in S) {
        arr[idx++] = if(ch ==='I') left++ else right--
    }
    arr[idx] = left
    return arr
}
