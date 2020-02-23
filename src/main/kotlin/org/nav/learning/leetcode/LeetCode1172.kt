package org.nav.learning.leetcode

/**
 * You have an infinite number of stacks arranged in a row and numbered (left to right) from 0, each of the stacks has the same maximum capacity.
 * Implement the DinnerPlates class:
 * DinnerPlates(int capacity) Initializes the object with the maximum capacity of the stacks.
 * void push(int val) pushes the given positive integer val into the leftmost stack with size less than capacity.
 * int pop() returns the value at the top of the rightmost non-empty stack and removes it from that stack, and returns -1 if all stacks are empty.
 * int popAtStack(int index) returns the value at the top of the stack with the given index and removes it from that stack, and returns -1 if the stack with that given index is empty.
 */
class LeetCode1172(val capacity: Int) {

    var dinnerplateList = mutableListOf<MyStack>()

    fun push(`val`: Int) {

        var len = dinnerplateList.size
        var position = 0
        var myStack : MyStack? = null
        while(position < len) {
            var tempStack = dinnerplateList[position]
            if(!tempStack.isCapacityFull()) {
                //println("emp Stack ${tempStack} at Position : ${position}")
                myStack = tempStack
                break;
            }
            position+=1
        }
        if(myStack == null) {
            myStack = MyStack(this.capacity)
            dinnerplateList.add(myStack)
        }
        myStack.push(`val`)
        println("Pushing : ${dinnerplateList.toList()}")
    }

    fun pop(): Int {
        println("POPPPP ---> ${dinnerplateList}")
        if(dinnerplateList.isEmpty()){
            return -1
        }
        var myStack = dinnerplateList[dinnerplateList.size-1]
        var elem = myStack.pop()
        if(myStack.isEmpty()) {
            dinnerplateList.remove(myStack)
        }
        return elem
    }

    fun popAtStack(index: Int): Int {
        if(index >= dinnerplateList.size) {
            return -1
        }
        var myStack = dinnerplateList[index]
        var elem = myStack.pop()
        if(myStack.isEmpty()) {
            dinnerplateList.remove(myStack)
        }
        return elem
    }


}

class MyStack(val capacity: Int) {

    var elements: IntArray = IntArray(capacity){
            it -> Int.MIN_VALUE
    }

    fun isEmpty(): Boolean {
        var empty = true
        for(elem in elements) {
            if(elem !== Int.MIN_VALUE) {
                empty = false
                break;
            }
        }
        return empty;
    }

    fun isCapacityFull(): Boolean {
        var filled = true
        for(elem in elements) {
            if (elem === Int.MIN_VALUE) {
                filled = false
                break;
            }
        }
        return elements.size === capacity && filled
    }
    fun push(`val`: Int) {
        var idx = 1
        while (idx < capacity) {
            if(elements[idx] == Int.MIN_VALUE) {
                elements[idx] = elements[idx -1]
            }
            idx++
        }
        elements[0] = `val`
    }

    fun pop() : Int {
       var elem = elements[0]
        var idx = 0
        //println("Elements ${elements.toList()}")
        while (idx < capacity - 1) {
            elements[idx] = elements[idx + 1]
            idx++
        }
        elements[idx] = Int.MIN_VALUE
        //println("After elements ${elements.toList()}")
        return if(elem === Int.MIN_VALUE) -1 else elem
    }

    override fun toString(): String {
        return "MyStack(${elements.contentToString()})"
    }


}
