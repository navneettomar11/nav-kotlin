package org.nav.learning.leetcode

import java.lang.Integer.min
import java.lang.RuntimeException
import kotlin.math.sign

fun complexNumberMultiply(a:String, b: String) {

}

class ComplexNumber() {
    var r: Int = 0
    var i: Int = 0
    var sign: String = "+"

    companion object {
        fun parseComplexNumberToObject(complexNumberStr: String): ComplexNumber{
            var complexNumber = ComplexNumber()
            var splitComplexNumber = complexNumberStr.split("+")
            if (splitComplexNumber.size === 0) {
                throw RuntimeException("Invalid Complex Number")
            }
            if (splitComplexNumber.size === 1 && !splitComplexNumber[0].contains("i")) {
                throw RuntimeException("${complexNumber} is not complex number")
            }
            if (splitComplexNumber[0].contains("i")) {
                complexNumber.i = splitComplexNumber[0].substring(0, splitComplexNumber[0].length - 1).toInt()
            } else {
                complexNumber.r = splitComplexNumber[0].toInt()
                complexNumber.i = splitComplexNumber[1].substring(0, splitComplexNumber[1].length - 1).toInt()
            }
            complexNumber.sign = "+";
            return complexNumber
        }

        fun multiply(a: ComplexNumber, b: ComplexNumber) : ComplexNumber {
            var result = ComplexNumber()
            result.sign = "+"
            result.r = (a.r * b.r) + (a.i * b.i * -1)
            result.i = (a.r * b.i) + (b.r * a.i)
            return result;
        }

    }

    override fun toString(): String {
        return "${r}${sign}${i}i";
    }
}

