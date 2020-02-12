package org.nav.learning

import java.math.BigInteger
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * <h2>String to Integer (atoi)</h2>
 * Implement atoi which converts a string to an integer.
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned.
 */
fun myAtoi(str: String): Int {
    //0-48 -- 9 - 57
    var newStr = str.trim()
    if(newStr.length === 0){
        return 0;
    }
    var regex = Regex("^(\\+|-)?\\d+")
   try{
       return newStr.toInt()
   }catch(nbex: NumberFormatException) {
       var matchResult = regex.find(newStr)
       if(matchResult?.value == null) {
           return 0
       }
       try{
           return matchResult?.value?.toInt()!!
       }catch (nbex0: java.lang.NumberFormatException) {
           return if(newStr.startsWith("-")) Int.MIN_VALUE else Int.MAX_VALUE
       }
   }
   return 0
    /*for(idx in charArray.indices) {
        //println("First ${charArray[idx]} valid ${valid}")
        var ascii = charArray[idx].toInt()
        if(!valid && idx > 0) {
            break
        }
        if(ascii in 48..57 ) {
            var currNum = Character.getNumericValue(charArray[idx]).toBigInteger()
            num = num.multiply(BigInteger.TEN) + currNum
            if(!valid && idx === 0) {
                valid = true
            }
        } else if ((ascii === 45 && charArray[idx+1].toInt()!== 43)  || (ascii === 43 && charArray[idx+1].toInt()!== 45) ) {
            negativeSign = if(ascii=== 45) -1 else 1
            if(!valid && idx === 0) {
                valid = true
            }
        }else {
            valid = false
        }
    }
    var temp = num.toInt()// if(negativeSign === -1) Int.MAX_VALUE else Int.MIN_VALUE*/

    /*if(num.compareTo(Int.MIN_VALUE.toBigInteger()) < 0) {
        temp = Int.MAX_VALUE
    }else if(num.compareTo(Int.MAX_VALUE.toBigInteger()) > 0) {
        temp = Int.MIN_VALUE
    }
    return temp * negativeSign*/
}


