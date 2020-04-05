package org.nav.learning.ds.advance

class TrieNode(var endWord: Boolean) {
    var children: MutableMap<Char, TrieNode> = mutableMapOf()
}
