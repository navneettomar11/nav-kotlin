package org.nav.learning.leetcode

/**
 * <h2>Excel Sheet Column Number</h2>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
fun excelTitleToNumber(s: String): Int {
    var chrs = s.toCharArray()
    var pow = 1
    var num = 0;
    chrs.reverse()
    for(ch in chrs) {
        //println("Char --> ${ch}")
        //println("1 Num ${num} pow = ${pow} ---> s: ${pow * (ch - 'A').toInt()}")
        num+= (pow * (ch - 'A'+ 1).toInt())
        //println("2 Num ${num} pow = ${pow}")
        pow*=26
    }
    return num;
}
