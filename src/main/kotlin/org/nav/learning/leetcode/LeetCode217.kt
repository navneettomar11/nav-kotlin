package org.nav.learning.leetcode

class LeetCode217 {

    fun containsDuplicate(nums: IntArray): Boolean {
        var map = mutableMapOf<Int, Int>()
        for(num in nums) {
            if(map.containsKey(num)) {
                return true
            }
            map.put(num, 1);
        }
        return false
    }
}
