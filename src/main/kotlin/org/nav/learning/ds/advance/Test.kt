package org.nav.learning.ds.advance

fun main(args: Array<String>) {
    var trie = Trie();
    trie.buildTrie(arrayOf("abc ","abcd"))
    trie.printTrie();
}
