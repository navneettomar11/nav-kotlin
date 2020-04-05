package org.nav.learning.leetcode

class LeetCode189 {

    fun rotate(nums: IntArray, k: Int): Unit {
        var length = nums.size;
        var results = IntArray(nums.size)

        rotateArray(nums,k)
        println(nums.contentToString());
    }

    private fun rotateArray(nums: IntArray, k: Int) {
        var length = nums.size;
        if(k == 0 || length == 0) {
            return;
        }
        for(i in 1 until length ) {
            nums[0]+=nums[i]
            nums[i] = nums[0] - nums[i]
            nums[0] = nums[0] - nums[i]
        }
        rotateArray(nums, k -1)
    }

}
