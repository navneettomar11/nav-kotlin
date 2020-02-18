package org.nav.learning.leetcode



/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 */
fun searchInsert(nums: IntArray, target: Int): Int {

    var high = nums.size - 1
    var low = 0
    var minValue = Int.MAX_VALUE
    var minIndex = -1
    while(low <= high) {
        var mid = (low + high)/2
        //println("Mid --> ${mid} nums[mid] --> ${nums[mid]} low --> ${low} high --> ${high} minIdx --> ${minIndex} minVale -- ${minValue}")
        var value =  if(target > nums[mid]) target - nums[mid] else nums[mid] - target
        if( value < minValue) {
            minValue = value
            minIndex = mid
        }
        if(nums[mid] < target) {
            low++
        }else {
            high--
        }
    }
    if(nums[minIndex] < target) {
        minIndex+=1
    }
    return minIndex
}
