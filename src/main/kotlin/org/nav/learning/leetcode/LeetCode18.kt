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
    return kSums(nums, target, 0, 4)
}

fun kSums(nums: IntArray, target: Int, startIdx: Int, kSize: Int): List<List<Int>> {

    if(kSize==2) {
        //println("kSize: 2 target : ${target} startidx : ${startIdx}")
        return twoSums(nums, target, startIdx);
    }
    var elementList = mutableMapOf<String, List<Int>>()
    for(idx in startIdx..nums.size-1) {
        //println("More than 2 size ::  idx : $idx , nums: ${nums[idx]} target: ${target - nums[idx]} , kSize: ${kSize} ")
        var tempList =
            kSums(nums, (target - nums[idx]), idx + 1, kSize - 1)
        //println(" Temp list ${tempList}")
        if(!tempList.isEmpty()) {
            for(list in tempList) {
                var newList = mutableListOf<Int>()
                newList.add(nums[idx])
                newList.addAll(list)
                var key = newList.joinToString()
                //if(!elementList.containsKey(key)) {
                    elementList.put(key, newList)
                //}

            }
        }
    }
    return elementList.values.toList()
}

fun twoSums(nums: IntArray, target: Int, startIdx: Int): List<List<Int>> {
    var list = mutableListOf<List<Int>>()
    var size = nums.size
    for(idx in startIdx until size) {
        var jdx = idx + 1
        while(jdx < size && (nums[idx] + nums[jdx]) !== target) {
            jdx++
        }
        if(jdx !== size) {
            list.add(mutableListOf(nums[idx], nums[jdx]))
        }
    }
    //println("Target ${target} : list: ${list}")
    return list
}
