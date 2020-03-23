package org.nav.learning.leetcode

class Node(var endWord: Boolean) {
    val nodes = Array<Node?>(26) {
        null
    }

    override fun toString(): String {
        return "Node(endWord=$endWord, chars=${nodes.contentToString()})"
    }

}

class Trie() {

    val rootNode = Node(false)

    /** Inserts a word into the trie. */
    fun insert(word: String) {
        var length = word.length
        var currentNode = rootNode
        for(level in 0 until length) {
            var index = word[level].toInt() - 'a'.toInt()
            if(currentNode.nodes[index] == null) {
                currentNode.nodes[index] = Node(false)
            }
            currentNode = currentNode.nodes[index]!!
        }
        currentNode.endWord = true
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        var length = word.length
        var currentNode = rootNode

        for(level in 0 until length) {
            var index = word[level].toInt() - 'a'.toInt()

            if(currentNode.nodes[index]==null) {
                return false
            }
            currentNode = currentNode.nodes[index]!!
        }
        return currentNode.endWord
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    fun startsWith(prefix: String): Boolean {
            var length = prefix.length
            var currentNode = rootNode

            for(level in 0 until length) {
                var index = prefix[level].toInt() - 'a'.toInt()

                if(currentNode.nodes[index]==null) {
                    return false
                }
                currentNode = currentNode.nodes[index]!!
            }
            return true
    }

}
