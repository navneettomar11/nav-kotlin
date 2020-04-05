package org.nav.learning.leetcode

import java.lang.Math.abs

class LeetCode220 {

    fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
        if( k< 1 || t < 0) return false
        var map = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size) {
            var m = Math.floor( (nums[i] / (t+1)).toDouble()).toInt()
            //println("M ---> ${m} Nums[${i}] ${nums[i]}  Maps ${map}")
            if( map.containsKey(m) ||
                ((map.containsKey(m - 1) && abs(nums[i].minus(map[m - 1]!!)) <= t) ||
                 ((map.containsKey(m + 1)) && abs(nums[i].minus(map[m + 1]!!)) <= t))) {
               return true
            }
            map[m] = nums[i]
            if( i>= k) map.remove(Math.floor((nums[i-k]/ (t+1)).toDouble()).toInt())
        }
        return false
    }
}
