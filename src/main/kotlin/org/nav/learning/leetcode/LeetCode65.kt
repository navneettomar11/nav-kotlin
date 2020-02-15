package org.nav.learning.leetcode

fun isNumber(s: String): Boolean {
    var regex = Regex("[+-]?((\\d*\\.\\d+)|(\\d+(\\.\\d*)?))([eE][+-]?\\d+)?\$")
    if(!regex.matches(s.trim())) {
        return false
    }
    return true
}
