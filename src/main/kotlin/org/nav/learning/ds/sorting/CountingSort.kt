package org.nav.learning.ds.sorting

import java.lang.Integer.max

class CountingSort {

    fun sort(nums:IntArray) {
        var maxNum = maxNum(nums);
            var auxArray = IntArray(maxNum + 1)
        var sortedArray = IntArray(nums.size)
        for(idx in nums.indices) {
            auxArray[nums[idx]]++
        }

        var j = 0;
        for(idx in auxArray.indices) {
            var temp = auxArray[idx]
            while(temp-- > 0) {
                sortedArray[j] = idx
                j++
            }
        }
        System.arraycopy(sortedArray,0, nums, 0, nums.size);
    }

    private  fun maxNum(nums: IntArray): Int {
        var maxValue = Int.MIN_VALUE
        for(num in nums) {
            maxValue = max(num, maxValue)
        }
        return maxValue
    }
}
