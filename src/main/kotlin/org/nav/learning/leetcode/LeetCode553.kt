package org.nav.learning.leetcode

fun optimalDivision(nums: IntArray): String {

    if (nums.size === 1) return nums[0].toString() + ""
    if (nums.size === 2) return nums[0].toString() + "/" + nums[1]
    val res = StringBuilder(nums[0].toString() + "/(" + nums[1])
    for (i in 2 until nums.size) {
        res.append("/" + nums[i])
    }
    res.append(")")
    return res.toString()

}
