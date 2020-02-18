package org.nav.learning.leetcode

/**
 * <h2>Merge Sorted Array</h2>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <strong>Note:</strong>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 */
fun mergeSortedArray(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var idx =0
    var jdx = 0
    var k = 0
    var mergeNums =  nums1.copyOf(m+n)
    while( idx < m && jdx < n) {
        //println("Idx ${idx} Jdx ${jdx} Nums1[idx] ${nums1[idx]} Nums2[jsdx] ${nums2[jdx]}")
        if(nums1[idx] < nums2[jdx]) {
            mergeNums[k++] = nums1[idx++]
        }else {
            mergeNums[k++] = nums2[jdx++]
        }
    }
    //println("Idx ${idx}")
    while(idx < m) {
        mergeNums[k++] = nums1[idx++]
    }
    //println("jdx ${jdx}")
    while(jdx < n) {
        mergeNums[k++] = nums2[jdx++]
    }

    System.arraycopy(mergeNums, 0, nums1, 0, m + n)
    //println("Num1 ${nums1.toList()}")
}
