package org.nav.learning.ds.basic

open class Queue(capacity: Int = 10) {

    var queue = IntArray(capacity)
    var front = -1
    var rear = -1

    fun enqueue(num: Int) {
        if(front == -1) {
            front++
        }
        if(rear === queue.size -1) {
            println("Queue is full")
            return;
        }
        queue[++rear] = num
    }

    fun dequeue() : Int {
        var elem = queue[front]
        queue[front] = 0
        front++
        return elem
    }

    override fun toString(): String {
        return "Queue (${queue.contentToString()})"
    }

}
