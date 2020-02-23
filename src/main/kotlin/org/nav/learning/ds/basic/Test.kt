package org.nav.learning.ds.basic

fun main(args: Array<String>){

    /*var stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.pop()
    println(stack)

    var queue = Queue()
    queue.enqueue(10)
    queue.enqueue(100)
    queue.enqueue(1000)
    queue.enqueue(1001)
    queue.enqueue(1002)
    queue.dequeue()
    println(queue)


    var cq = CircularQueue()
    cq.enqueue(10);
    cq.enqueue(100);
    cq.enqueue(1000);
    cq.enqueue(1001);
    cq.enqueue(1002);
    cq.dequeue()
    cq.display()

    var ll = LinkedList<Int>()
    ll.insert(1)
    ll.insert(2)
    ll.insert(3)
    ll.display()
    ll.delete(2)
    ll.display()
    println(ll.search(1))
*/
    var btree = BinaryTree()
    btree.insertNode(20)
    btree.insertNode(10)
    btree.insertNode(30)
    btree.insertNode(5)
    btree.insertNode(25)
    btree.insertNode(35)
    btree.inOrder()
    println("==============")
    btree.preOrder()
    println("==============")
    btree.postOrder()
    println("Search --> ${btree.search(10)}")
}
