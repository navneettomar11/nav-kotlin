package org.nav.learning.leetcode

import java.math.BigInteger

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }
}

fun convertListNodeToNumber(listNode: ListNode?): BigInteger {
    var num: BigInteger = BigInteger.ZERO
    var dec = BigInteger.ONE;
    var tempListNode: ListNode? = listNode;
    while(tempListNode !== null) {
        var bigNum = tempListNode.let { it.`val`.toBigInteger() }
        num = num.add(dec.multiply(bigNum))
        dec = dec.multiply(BigInteger.TEN)
        tempListNode = tempListNode.next
    }
    return num
}

fun convertNumberToListNode(num:BigInteger): ListNode? {
    var rootNode: ListNode? = null
    var tempNum = num
    if(tempNum.compareTo(BigInteger.ZERO) === 0 ) {
        return ListNode(tempNum.toInt())
    }
    println("Num --> ${num}")
    while (tempNum.compareTo(BigInteger.ZERO) !== 0) {
        var value = tempNum.remainder(BigInteger.TEN)
        //println("Value Sum Num --> ${value}")
        if(rootNode == null) {
            rootNode = ListNode(value.toInt())
        }else {
            var tempListNode = rootNode
            while(tempListNode?.next !== null) {
                tempListNode = tempListNode.next
            }
            tempListNode?.next = ListNode(value.toInt())
        }
        tempNum = tempNum.divide(BigInteger.TEN)
    }
    return rootNode
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var firstListNumber = l1?.let { convertListNodeToNumber(it) }
    var secondListNumber = l2?.let { convertListNodeToNumber(it) }
    println("L1 --> ${firstListNumber} L2 --> ${secondListNumber}")
    var sum:BigInteger = BigInteger.ZERO;
   if(firstListNumber != null) {
       sum = sum.plus(firstListNumber)
   }
    if(secondListNumber!=null) {
        sum = sum.plus(secondListNumber)
    }
    println("Sum : ${sum}")
    return convertNumberToListNode(sum)
}
