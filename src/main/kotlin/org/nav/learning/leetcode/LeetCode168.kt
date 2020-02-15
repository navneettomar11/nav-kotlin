package org.nav.learning.leetcode

import java.lang.StringBuilder

/**
 * <h2>Excel Sheet Column Title</h2>
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet
 */
fun convertToExcelTitle(n: Int): String {
    val totalNumberOfAlphabets = 26
    if(n <= 0) {
        return ""
    }
    var num = n
    return convertToExcelTitle(--num/totalNumberOfAlphabets) + ('A'.toInt()+(num% totalNumberOfAlphabets)).toChar()
}
