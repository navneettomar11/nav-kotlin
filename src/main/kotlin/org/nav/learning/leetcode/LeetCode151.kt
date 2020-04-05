package org.nav.learning.leetcode

import com.sun.xml.internal.fastinfoset.util.StringArray

fun reverseWords(s: String): String {

    //split string into array
    var buffer = StringBuffer()
    var wordArrays = mutableListOf<String>();
    for(ch in s) {
        //println("Ch ==> ${ch} ==== Int: ${ch.toInt()}")
        if( ch.toInt() === 32) {
            if(buffer.length > 0) {
                wordArrays.add(buffer.toString())
                buffer = StringBuffer()
            }
        } else {
            buffer.append(ch)
        }
    }
    if(buffer.length > 0) {
        wordArrays.add(buffer.toString())
    }
    buffer= StringBuffer()
    var idx = wordArrays.size -1
    while (idx >= 0) {
        buffer.append(wordArrays[idx]).append(32.toChar())
        idx--
    }
    if(buffer.length > 0) {
        buffer.delete(buffer.length -1, buffer.length)
    }

    return buffer.toString()
}
