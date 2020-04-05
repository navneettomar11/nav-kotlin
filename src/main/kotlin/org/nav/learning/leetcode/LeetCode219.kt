package org.nav.learning.leetcode

class LeetCode219 {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var map = mutableMapOf<Int, Int>()
        for(j in 0 until nums.size) {
            if(map.containsKey(nums[j])) {
                var i = map[nums[j]]
                if( j.minus(i!!) <= k  ) {
                    return true
                }
            }
            map.put(nums[j], j)
        }
        return false
    }
}
