package org.nav.learning.leetcode

fun triangleNumber(nums: IntArray): Int {
    val length = nums.size
    if(length < 3) {
        return 0
    }
    var count = 0;
    nums.sort()
    for (i in 0 until length -1) {
        if(nums[i] === 0) {
            continue;
        }
        var j = i + 1
        while(j < length) {
            var k = j + 1
            while (k < length && nums[i] + nums[j] > nums[k]) {
                println("Nums ${nums[i]} + ${nums[j]} > ${nums[k]}")
                k++
                count++
            }
            j++
        }
    }

    return count;

}
