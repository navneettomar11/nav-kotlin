package org.nav.learning.ds.sorting

class QuickSort {

    fun sort(nums: IntArray) {
        quickSort(nums, 0, nums.size-1)
    }

    fun quickSort(nums:IntArray, low:Int, high: Int) {
        if(low < high) {
            println("Low ${low} high ${high}")
            var q = partition(nums, low, high)
            quickSort(nums, low, q-1)
            quickSort(nums, q+1, high)
        }
    }

    fun partition(nums: IntArray, low: Int, high: Int):Int {
        var pivot = nums[high]
        var idx = low -1
        var jdx = low
        while(jdx < high) {
            println("Nums[jdx] --> ${nums[jdx]} Pivot --> ${pivot}")
            if(nums[jdx] <= pivot) {
                idx++
                var temp = nums[idx]
                nums[idx] = nums[jdx]
                nums[jdx] = temp
                println("Swap Idx --> ${idx} ${nums.toList()}")
            }
            jdx++
        }
        var temp = nums[idx+1]
        nums[idx+1] = nums[high]
        nums[high] = temp
        println("IDX ::: ${idx}")
        return idx + 1
    }
 }
