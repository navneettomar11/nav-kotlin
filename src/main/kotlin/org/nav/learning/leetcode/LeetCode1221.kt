package org.nav.learning.leetcode

/**
 * <h2>Split a String in Balanced Strings</h2>
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 */
fun balancedStringSplit(s: String): Int {
   var count = 0
   var r = 0
   var l = 0

   for(ch in s) {
       if(ch === 'R') {
           r++
       }
       if( ch === 'L') {
           l++
       }

       if(r === l) {
           r=0
           l=0
           count++
       }
   }

    return count
}
