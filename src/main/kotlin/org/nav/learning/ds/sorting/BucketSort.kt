package org.nav.learning.ds.sorting

class BucketSort {

    fun sort(nums: FloatArray) {
        var buckets = Array<MutableList<Float>>(nums.size,  {
            i -> mutableListOf()
        })

        var n = nums.size -1;
        for(idx in nums.indices) {
            var bi = (n * nums[idx]).toInt()
            //println("BI ${bi} ")
            buckets[bi].add(nums[idx])
        }

        var insertionSort = InsertionSort()
        for(arr in buckets) {
            insertionSort.sort(arr.toFloatArray())
        }

        var index = 0;
        var idx =0;
        while(idx < n) {
            var jdx = 0
            var size = buckets[idx].size
            while(jdx < size) {
                println(buckets[idx][jdx])
                nums[index++] = buckets[idx][jdx];
              jdx++
            }
            idx++;
        }
    }
}
