package org.nav.learning

import java.lang.Integer.min
import kotlin.math.abs

/**
 * 3 Sum closest
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 */
fun  threeSumClosest(nums: IntArray, target: Int): Int {
    var size = nums.size;
    val limit = 3;
    if(size < limit) {
        return 0;
    }
    var closestSum = Integer.MAX_VALUE;
    var closestTarget = Integer.MAX_VALUE
    nums.sort()
    for(idx in nums.indices) {
        var jdx = idx + 1
        var kdx = size - 1
        while(jdx < kdx) {
            var sum = nums[idx] + nums[jdx] + nums[kdx]
            var diff = if(sum < target) target.minus(sum) else sum.minus(target)
            if(abs(diff) < abs(closestTarget)){
                closestSum = nums[idx] + nums[jdx] + nums[kdx]
                closestTarget = diff
            }
            if( sum < target) {
                jdx++
            }else {
                kdx--
            }
        }
    }
    return closestSum;
}


