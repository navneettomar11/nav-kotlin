package org.nav.learning.leetcode

/**
 * 4Sum
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target
 */
fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    val size = nums.size;
    if (size < 4) {
        return emptyList()
    }
    nums.sort()
    val length = nums.size
    var sumTargetList = mutableMapOf<String, List<Int>>()
    for(i in 0 until length - 1) {
        var newTarget = target - nums[i]
        for(j in 0 until length - 1) {
            if(i==j) {
                continue;
            }
            var l = j + 1
            var r = length -1
            while( l < r && i < r ) {
                if( l === i ){
                    l++;
                    continue;
                }
                //println("Idx --> ${j}, ${l}, ${r}  ===j ==l  ${j==l},  l == r ${l == r} j===r ${j==r}")
                var sum = nums[j] + nums[l] + nums[r]
                if(sum === newTarget) {
                    //println("Nums ${nums[i]}, ${nums[j]}, ${nums[l]}, ${nums[r]}")
                    var list = mutableListOf<Int>(nums[i], nums[j], nums[l], nums[r])
                    list.sort()
                    var key = list.joinToString("")
                    sumTargetList.put(key, list)
                }
                if(sum < newTarget) {
                    l++
                }else {
                    r--
                }
            }
        }
    }
    return sumTargetList.values.toMutableList();
}

