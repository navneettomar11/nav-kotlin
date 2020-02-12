package org.nav.learning

fun romanToInt(s: String): Int {
    var numbers = IntArray(s.length)
    var sum = 0
    var idx = 0
    for(roman in s) {
        var current = when(roman) {
            'I' ->  1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
        numbers[idx] = current;
        idx+=1
    }

    var nlen = numbers.size
    for(i in numbers.indices) {
        if( i < nlen -1 && numbers[i] < numbers[i + 1]) {
            numbers[i]*=-1
        }
        sum+=numbers[i]
    }
    return sum

}

