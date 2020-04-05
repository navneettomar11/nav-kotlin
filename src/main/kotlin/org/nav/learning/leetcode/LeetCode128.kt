package org.nav.learning.leetcode

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * Your algorithm should run in O(n) complexity.
 */
class LeetCode128 {

    fun longestConsecutive(nums: IntArray): Int {
        if (nums === null || nums.size === 0) {
            return 0
        }
        var count = 1
        var j = 0
        var max = Int.MIN_VALUE
        nums.sort()
        for(i in 1 until nums.size) {
            println("I : ${nums[i]} J: ${nums[j]}")
            if(nums[i] - nums[j] <= 1) {
                count++
                max = Math.max(max, count)
            }
            j = i
        }
        return max
    }
}
