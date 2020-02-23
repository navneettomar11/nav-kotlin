package org.nav.learning.ds.basic

class CircularQueue(val capacity: Int = 10){

    var queue = IntArray(capacity)
    var front = -1
    var rear = -1

    fun isFull(): Boolean {
        if(front == 0 && rear == capacity -1) {
            return true
        }else if(front == rear + 1) {
            return true
        }
        return false
    }

    fun isEmpty() : Boolean {
        return this.front === -1
    }

    fun enqueue(num: Int) {
        if(isFull()) {
            println("Queue is full")
            return;
        }
        if(front == -1) {
            front  = 0
        }
        rear = (rear + 1) % queue.size
        queue[rear] = num
    }

    fun dequeue() : Int{
        if(!isEmpty()) {
            var elem = queue[front]
            if(front === rear) {
                front = -1
                rear = -1
            } else {
                front = (front + 1)% queue.size
            }
            return elem
        }
        return -1
    }

    fun display() {
        var i: Int
        if (isEmpty()) {
           return
        } else {
           println("Front -> ${front}")
            println("Elements -> ")
            i = front
            while (i != rear) {
                println("${queue[i]} \t");
                i = (i + 1) % queue.size
            }
            println("${queue[i]}")
            println("Rear -> ${rear}")
        }
    }
}
