package org.nav.learning.ds.basic

class Stack {
    var elements: IntArray = IntArray(0)

    fun push(`val`: Int) {
        var idx = 0
        var temp = elements.copyOf()
        elements = IntArray(temp.size + 1)
        elements[idx++] = `val`
        for(num in temp) {
            elements[idx++] = num
        }
    }

    fun pop(): Int {
       var elem = elements[0]
       var temp = elements.copyOf()
       elements = IntArray(elements.size -1)
       var idx = 0;
       while(idx < temp.size -1) {
           elements[idx] = temp[idx+1]
           idx++
       }
       return elem
    }

    fun top() : Int{
        return if(elements.size > 0) elements[0] else -1
    }

    override fun toString(): String {
        return "Stack (${elements.contentToString()})"
    }
}
