package org.nav.learning.leetcode

import java.lang.Integer.min


/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
class LeetCode155 {

    var elements: IntArray = IntArray(0)

    private fun isempty(): Boolean {
        return elements== null || elements.size  == 0
    }
    fun push(x: Int) {
        var temp = elements.copyOf()
        elements = IntArray(temp.size + 1)
        elements[0] = x
        System.arraycopy(temp,0, elements, 1, temp.size)
    }

    fun pop() {
        if(isempty()) {
            return;
        }
        var elem = elements[0]
        var temp = elements.copyOf()
        elements = IntArray(temp.size - 1)
        System.arraycopy(temp,1, elements, 0, elements.size)
        println("Pop --> ${elements.toList()}")
    }

    fun top(): Int {
        if(isempty()) {
            return Int.MIN_VALUE;
        }
        return elements[0]
    }

    fun getMin(): Int {
       var minValue = Int.MAX_VALUE
       for(elem in elements){
           minValue = min(elem,minValue)
       }
        return minValue
    }
}
