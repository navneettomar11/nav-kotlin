package org.nav.learning.leetcode

import java.util.*

/**
 * Given two sequences pushed and popped with distinct values, return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.
 * Example 1:
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 *
 * Example 2:
 * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 * Explanation: 1 cannot be popped before 2.
 */
fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    if(pushed.size === 0 || popped.size === 0) {
        return true;
    }
    if(pushed.size !== popped.size) {
        return false;
    }
    var mystack = Stack<Int>()
    var idx = 0
    var jdx = 0
    var len = pushed.size
    while(true) {
        if(jdx < len && !mystack.isEmpty() && mystack.peek() === popped[jdx]) {
            //println("Pop operation mystack.pop() ==> ${popped[jdx]}")
            mystack.pop();
            jdx++
        }else if(idx < len){
            //println("Push operation mystack.push() ==> ${pushed[idx]}")
            mystack.push(pushed[idx])
            idx++
        }else {
            break;
        }
    }
    return mystack.isEmpty()
}
