package org.nav.learning.ds.advance

data class TrieNode(val endWord: Boolean) {

    val chars = mutableMapOf<Char, TrieNode>()

    override fun toString(): String {
        return "TrieNode(endWord=$endWord, chars=$chars)"
    }

}
