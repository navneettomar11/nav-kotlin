package org.nav.learning.leetcode

import java.util.*

fun kSimilarity(A: String, B: String): Int {
    if(A.equals(B)) return 0
    var visited = hashSetOf<String>()
    var queue = PriorityQueue<String>()
    var res = 0;

    if(visited.add(A)) {
        queue.add(A)
    }
    while (queue.isNotEmpty()) {

        var sz = queue.size
        while(sz > 0) {
            var s = queue.poll()
            var i = 0
            while(s[i] === B[i]) {
                i++
            }
            for(j in i+1 until s.length) {
                if(s[j] === B[j] || s[j] !== B[i])
                    continue
                var temp = s[i]
                var ns = swap(s, i, j)
                if(ns.equals(B)) {
                    return res
                }
                res++
                if(visited.add(ns)) {
                    queue.add(ns)
                }
            }
            sz--
        }
    }
    return res
}

private fun swap(s:String, i: Int, j: Int): String {
    val ca: CharArray = s.toCharArray()
    val temp = ca[i]
    ca[i] = ca[j]
    ca[j] = temp
    return String(ca)
}
