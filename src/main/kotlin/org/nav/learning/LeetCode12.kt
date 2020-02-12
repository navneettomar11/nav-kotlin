package org.nav.learning

fun intToRoman(num: Int): String {
    var numberToRomanNumberMap = mutableMapOf<Int, String>()
    numberToRomanNumberMap.put(1000, "M")
    numberToRomanNumberMap.put(900, "CM")
    numberToRomanNumberMap.put(500, "D")
    numberToRomanNumberMap.put(400, "CD")
    numberToRomanNumberMap.put(100, "C")
    numberToRomanNumberMap.put(90, "XC")
    numberToRomanNumberMap.put(50, "L")
    numberToRomanNumberMap.put(40, "XL")
    numberToRomanNumberMap.put(10, "X")
    numberToRomanNumberMap.put(9, "IX")
    numberToRomanNumberMap.put(5, "V")
    numberToRomanNumberMap.put(4, "IV")
    numberToRomanNumberMap.put(1, "I")
    var stringBuffer = StringBuffer()
    var temp = num
    for((kNum, str) in numberToRomanNumberMap) {
        var matches = temp / kNum
        //println("Matches ${matches} --> temp ${temp}")
        if(matches > 0) {
            stringBuffer.append(str.repeat(matches))
        }
        temp = temp.rem(kNum)
    }
    return stringBuffer.toString()
}
