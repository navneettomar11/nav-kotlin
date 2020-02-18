package org.nav.learning.leetcode


fun mergeSort(nums: IntArray, l: Int, h: Int) {
    if(l < h) {
        var m = (l + h)/2
        mergeSort(nums, l, m)
        mergeSort(nums, m+1, h)
        merge(nums, l, m, h)
    }
}

fun merge(nums: IntArray, l: Int, m: Int, h: Int) {
    var numList = IntArray(nums.size)
    var idx = l
    var jdx = m + 1
    var k = 0
    while(idx <= m && jdx <= h) {
        if(nums[idx] < nums[jdx]) {
            numList[k++] = nums[idx++]
        }else {
            numList[k++] = nums[jdx++]
        }
    }
    while(idx <= m) {
        numList[k++]= nums[idx++]
    }
    while(jdx <= h) {
        numList[k++] = nums[jdx++]
    }
    //println("Number List ${numList.toList()} arr ${arr.toList()}")
    idx = h
    while (idx >= l) {
        nums[idx] = numList[--k]
        idx--
    }
}

fun sortArray(nums: IntArray): List<Int> {
    var tempNums = nums
    mergeSort(tempNums, 0, tempNums.size-1)
    return tempNums.toList()
}
