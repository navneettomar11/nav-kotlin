package org.nav.learning.ds.sorting

import java.lang.Integer.max

class RadixSort {

    fun sort(nums: IntArray) {
        var maxx = this.maxNum(nums);
        this.radixSort(nums, maxx)
    }

    private fun radixSort(nums: IntArray, maxx: Int) {
        var mult = 1
        var maxxx = maxx;
        while(maxxx > 0) {
            countSort(nums, mult)
            mult*=10
            maxxx/=10
        }
    }

    private fun countSort(nums: IntArray, place:Int) {
        var range = 10
        var auxArray = IntArray(range)
        var newNums = IntArray(nums.size)

        for(idx in nums.indices) {
            auxArray[(nums[idx]/place)%range]++
        }
       var idx = 1
        while(idx < auxArray.size) {
            auxArray[idx]+=auxArray[idx -1]
            idx++
        }
        idx = nums.size -1
        while(idx >= 0) {
            newNums[auxArray[(nums[idx]/place)%10]-1] = nums[idx]
            auxArray[(nums[idx]/place)%10]--
            idx--
        }
        System.arraycopy(newNums,0, nums,0, nums.size);
        println("Place ${place} Nums : ${nums.toList()}")
    }

    private fun maxNum(nums: IntArray): Int {
        var maxValue = Int.MIN_VALUE
        for(num in nums) {
            maxValue = max(num, maxValue)
        }
        return maxValue
    }
}
