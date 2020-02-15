package org.nav.learning.leetcode

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
 var arr = IntArray(2)
    var length = nums.size
    for(idx in nums.indices) {
        var jdx = idx + 1
        while(jdx < length && nums[idx] + nums[jdx] !== target) {
            jdx++
        }
        if(jdx !== length) {
            arr[0] = idx
            arr[1] = jdx
        }
    }
    return arr
}
