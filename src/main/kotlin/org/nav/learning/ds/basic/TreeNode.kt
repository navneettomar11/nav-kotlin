package org.nav.learning.ds.basic

data class TreeNode<T>(val value: T) {
    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null


    override fun toString(): String {
        return "TreeNode(value=$value, left=$left, right=$right)"
    }


}
