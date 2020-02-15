package org.nav.learning.leetcode

import java.lang.StringBuilder
import java.math.BigInteger

/**
 * <h2>Fraction to Recurring Decimal</h2>
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
 *
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 */
fun fractionToDecimal(numerator: Int, denominator: Int): String {
    if(numerator === 0) {
        return "0"
    }
    var negativeSign =  if( (numerator < 0).xor(denominator < 0)) -1 else 1
    //println("Negative Sign ${negativeSign} ")
    var nume: BigInteger = numerator.toBigInteger().abs()
    var deno: BigInteger = denominator.toBigInteger().abs()

    var integerPart = nume.div(deno)
    var result = StringBuilder(integerPart.toLong().toString())
    var decimal:BigInteger = nume.rem(deno)
    var map = mutableMapOf<BigInteger, Int>()
    if(decimal.compareTo(BigInteger.ZERO)!==0) {
        result.append(".")
    }
    println("Numer ${nume} and deno = ${deno}")
    while(decimal.compareTo(BigInteger.ZERO)!==0) {
        decimal = decimal.multiply(BigInteger.TEN)
        //println("Result --> ${result} ---> ${deno} deccc ${decimal}")
        var res = decimal.div(deno)
        if(map.containsKey(decimal)) {
            var index = map.get(decimal)!!
            //println("Index ---> ${index} --> result ${result} Map == ${map}")
            result.insert(index-1 , "(").append(")")
            break;
        }else {
            //println("Map --${map} ---> Decimal ${decimal} result ${result} len ${result.length} Res --> ${res}")
            result.append(res);
            map.put(decimal, result.length)
            //println("After res --> ${result}")
        }
        decimal = decimal.rem(deno);
    }
    return "${if(negativeSign === -1) "-" else ""}${result.toString()}"

}
