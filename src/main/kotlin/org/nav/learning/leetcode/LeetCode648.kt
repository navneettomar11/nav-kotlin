package org.nav.learning.leetcode

import org.nav.learning.ds.advance.Trie
import java.lang.StringBuilder

class LeetCode648 {

    fun replaceWords(dict: List<String>, sentence: String): String {
        var words = sentence.split(" ")


        var replaceSentence = Array<String>(words.size){""}
        var idx = 0
        for(word in words) {
            replaceSentence[idx++] = getReplaceWord(word, dict)
        }
        return replaceSentence.joinToString(" ");
    }

    fun getReplaceWord(word: String, dict: List<String>): String {
        var trie = Trie()
        trie.insert(word)
        var replaceWord = word
        for(root in dict) {
            if(trie.startsWith(root)) {
                replaceWord = root
                break
            }
        }
        return replaceWord
     }
}
