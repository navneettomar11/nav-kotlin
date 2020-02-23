package org.nav.learning.ds.basic

class BinaryTree {
    var rootNode: TreeNode<Int>? = null

    private fun insertNodeRec(`val`: Int, node: TreeNode<Int>?): TreeNode<Int>? {
        if(node == null){
            return TreeNode<Int>(`val`)
        }
        //println("Node ${node} value : ${`val`}")
        if(`val` < node.value) {
            node?.left = insertNodeRec(`val`, node?.left)
        }else if(`val` > node.value) {
            node?.right = insertNodeRec(`val`, node?.right)
        }
        return node
    }

    fun insertNode(`val`: Int){
        rootNode =insertNodeRec(`val`, rootNode)
    }

    /**
     * InOrder --> LRR
     *
     */
    fun inOrder(node: TreeNode<Int>? = rootNode)  {
       if(node != null) {
            inOrder(node?.left)
            print("${node?.value}\t\t")
            inOrder(node?.right)
        }
    }

    /**
     * Preorder traverse
     * RtLR
     */
    fun preOrder(node: TreeNode<Int>? = rootNode) {
        if(node != null) {
            print("${node?.value}\t")
            preOrder(node?.left)
            preOrder(node?.right)
        }
    }

    fun postOrder(node: TreeNode<Int>? = rootNode) {
        if(node != null) {
            postOrder(node?.left)
            postOrder(node?.right)
            print("${node?.value}\t")
        }
    }

    fun search(`val`: Int, node: TreeNode<Int>?= rootNode): TreeNode<Int>? {
        if(node?.value === `val`) {
            return node
        }
        if(`val` < node?.value!!) {
            return search(`val`, node?.left)
        }else if(`val` > node?.value!!) {
            return search(`val`, node?.right)
        }
        return null
    }

    fun height() {

    }


}
