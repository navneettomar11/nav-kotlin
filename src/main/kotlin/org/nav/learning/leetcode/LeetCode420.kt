package org.nav.learning.leetcode

import java.lang.Integer.max
import java.lang.Math.min
import java.util.*

fun strongPasswordChecker(s: String): Int {
    var upper = 1
    var lower = 1
    var digit = 1
    var missing = 0
    var slen = s.length
    var res = 0

    var arr = IntArray(slen)

    val MAX_LENGTH = 20
    val MIN_LENGTH = 6

    var idx = 0
    while(idx < slen) {
        var ch = s[idx]
        if(Character.isUpperCase(ch)) {
            upper = 0
        } else if(Character.isLowerCase(ch)) {
            lower = 0
        }else if(Character.isDigit(ch)) {
            digit = 0
        }
        //println("CH --- ${ch} Idx ${idx}")
        if(idx <= slen - 3) {
            var jdx = idx
            while(idx < slen && s[jdx] === s[idx] ) {
                //println("Ch ${ch} ==== ${s[idx]} ")
                idx++
            }
            arr[jdx] = idx - jdx

        }else
            idx++
    }


    //println("Flag Lower--> ${lowerCaseFlag}  Upper ${upperCaseFlag}  Digit ${digitFlag}")
    missing = upper + lower + digit
    //println("Missing ---> ${missing} Repeating ----> ${arr.contentToString()}")
    if(slen < MIN_LENGTH) {
        res+= missing + max(0, MIN_LENGTH - (slen + missing))
    }else  {
        var overLength = max(slen - MAX_LENGTH, 0)
        var leftOver = 0
        res+=overLength
        //println("OveLength >> ${overLength}")
        var l = slen -1
        var kdx = overLength

        for (k in 1..2) {
            var i = 0
            while (i < arr.size && overLength > 0) {
                //println("Arr[i] ==> " + arr[i] + " --- k " + k)
                if (arr[i] < 3 || arr[i] % 3 != k - 1) {
                    i++
                    continue
                }
                //println("Arr --> " + Arrays.toString(arr) + " K ==> " + k + " Overlen " + overLength)
                arr[i] -= min(overLength, k)
                overLength-=k
                i++
            }
        }
        for (i in arr.indices) {
            if (arr[i] >= 3 && overLength > 0) {
                val need = arr[i] - 2
                arr[i] -= overLength
                overLength -= need
            }
            if (arr[i] >= 3) leftOver += arr[i] / 3
        }
        res+=max(missing, leftOver)
    }
   return res
}
