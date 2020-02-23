package org.nav.learning.ds.basic

class LinkedList<T> {

    var headNode: Node<T>? = null

    fun getLastNode(): Node<T>? {
        var tempNode = headNode
        while(tempNode?.next != null)     {
            tempNode = tempNode?.next
        }
        return tempNode
    }

    fun getPreviousNode(node: Node<T>?): Node<T>? {
        if(node === headNode) {
            return null
        }
        var tempNode = headNode
        while(tempNode?.next != node)     {
            tempNode = tempNode?.next
        }
        return tempNode
    }

    fun insert(`val`: T) {
        if(headNode == null) {
            headNode = Node(`val`)
        }else {
            var node = getLastNode()
            node?.next = Node(`val`)
        }
    }

    fun insertBefore(node: Node<T>, `val`: T) {
        var parentNode = getPreviousNode(node)
        parentNode?.next = Node(`val`)
        parentNode?.next?.next = node
    }

    fun insertAfter(node: Node<T>, `val`: T) {
        var nextNode = node.next
        node?.next = Node(`val`)
        node?.next?.next = nextNode
    }

    fun display() {
        var tempNode = headNode
        while(tempNode != null)     {
           print("${tempNode.value} --> ")
            tempNode = tempNode.next
        }
        println("NULL")
    }

    fun search(data: T): Node<T>? {
        var tempNode = headNode
        while(tempNode?.value != data)     {
            tempNode = tempNode?.next
        }
        return tempNode
    }

    fun delete(data: T) {
        var node = search(data)
        var parent = getPreviousNode(node)
        parent?.next = node?.next
    }

}
