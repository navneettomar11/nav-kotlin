package org.nav.learning.ds.advance


class Trie {

    var rootTrieNode: TrieNode = TrieNode(false);

    private fun buildTrieForStr(s: String, currentNode: TrieNode?, idx: Int) {

        if(idx>= s.length) {
            return;
        }
        var ch = s[idx]
        var endWord = idx + 1 == s.length
        var trieNode: TrieNode? = currentNode
        println("Ch ${ch} TrieNode ${trieNode}");
        if(!trieNode!!.chars.containsKey(ch)) {
            var tempTrieNode = TrieNode(endWord)
            trieNode!!.chars.put(ch, tempTrieNode)
            trieNode = tempTrieNode
        } else {
            trieNode = trieNode!!.chars.get(ch)
        }
        buildTrieForStr(s, trieNode, idx+1)
    }

    fun buildTrie(strArr: Array<String>) {
        for(s in strArr) {
            buildTrieForStr(s, rootTrieNode, 0)
        }
    }

    fun printTrie() {
        println(rootTrieNode)
    }
    fun check(s: String): Boolean {

        return false;
    }
}


