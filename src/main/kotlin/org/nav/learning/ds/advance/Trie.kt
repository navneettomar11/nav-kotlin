package org.nav.learning.ds.advance

import java.lang.StringBuilder


class Trie {

    var root: TrieNode = TrieNode(false);

    fun insert(s: String) {
        var current = root;
        for(c in s) {
            if (!current.children.containsKey(c)) {
               current.children[c]= TrieNode(false)
            }
            current = current.children[c]!!;
        }
        current.endWord = true;
    }

    fun search(s: String) : Boolean {
        var current = root
        for(c in s) {
            var node = current.children[c]
            if(node === null) {
                return false
            }
            current = node
        }
        return current.endWord
    }

    fun delete(s: String)  {
        deleteRecursively(root, s, 0)
    }

    fun startsWith(prefix: String): Boolean {
        var current = root
        for(c in prefix) {
            var node = current.children[c]
            if(node == null) {
                return false
            }
            current = node
        }
        return true
    }

    private fun deleteRecursively(current: TrieNode, word: String, index: Int): Boolean{
        if(index == word.length) {
            if(!current.endWord) {
                return  false
            }
            current.endWord = false
            return current.children.isEmpty()
        }
        var ch = word[index]
        var node  = current.children[ch]
        if(node === null) {
            return false
        }
        var shouldDeleteCurretNode = deleteRecursively(node, word, index + 1) && !node.endWord
        if(shouldDeleteCurretNode) {
            current.children.remove(ch)
            return current.children.isEmpty()
        }
        return false
    }

    fun content(): List<String> {
        var stringList = mutableListOf<String>()
        if(root.children.isNotEmpty()) {
            for((k,v) in root.children) {
                var builder = StringBuilder()
                builder.append(k)
                if(v.endWord) {
                 stringList.add(builder.toString())
                }
                recursiveContent(v, builder, stringList)
            }
        }
        return stringList
    }
    private fun recursiveContent(node: TrieNode, builder: StringBuilder, stringList: MutableList<String>) {
        if(node.children.isNotEmpty()) {
            for((k,v) in node.children) {
                builder.append(k)
                if(v.endWord) {
                    stringList.add(builder.toString())
                }
                recursiveContent(v, builder, stringList)
            }
        }
    }
}


