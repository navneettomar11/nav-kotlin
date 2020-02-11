package org.nav.learning

import java.lang.Integer.max
import java.lang.Integer.min

/**
 * Leetcode Question 11 -
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */
fun maxArea(height: IntArray): Int {
    var maxA = 0;
    val size = height.size;
    if (size < 2) {
        return maxA;
    }
    var start = 0;
    var end = size - 1;
    while (start < end) {
        var area = min(height[start], height[end]) * (end - start)
        maxA = max(maxA, area);
        if (height[start] < height[end]) {
            start++
        } else {
            end--;
        }
    }
    return maxA;
}

