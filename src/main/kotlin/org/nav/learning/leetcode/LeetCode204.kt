package org.nav.learning.leetcode

fun countPrimes(n: Int): Int {
    var nonPrimes =Array<Boolean>(n) {
        false
    }
    var idx = 2
    var count = 0
    while(idx  < n) {
        if(!nonPrimes[idx]) {
            count++
            var jdx = 2
            while( (idx*jdx) < n) {
                nonPrimes[idx*jdx] = true
                jdx++
            }
        }
        idx++
    }
    return count
}

