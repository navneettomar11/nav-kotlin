package org.nav.learning.leetcode

/**
 * <h2>Search in Rotated Sorted Array</h2>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 */
fun searchInRotatedArray(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size -1
    while(low <= high) {
        //println("Low ${low} high ${high}")
        var mid = low + (high - low) / 2
        var num = nums[mid]
        //println("Mid ${mid} Nums[mid] ${nums[mid]} Condition ${(nums[mid] < nums[0]).xor(target < nums[0])}")
        if ( (nums[mid] < nums[0]) == (target < nums[0])) {
            num = nums[mid]
        }else {
            num = if(target < nums[0]) Int.MIN_VALUE else Int.MAX_VALUE
        }
        //println("Num ${num} Low ${low} high ${high} target ${target} condition ${num < target}")
        if(num < target) {
            low = mid + 1
        }else if (num > target) {
            high = mid -1
        }else {
            return mid
        }

    }
     return -1
}
