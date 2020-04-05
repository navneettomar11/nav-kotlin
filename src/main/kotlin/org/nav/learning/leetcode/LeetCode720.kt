package org.nav.learning.leetcode

import org.nav.learning.ds.advance.Trie

class LeetCode720 {


    fun longestWord(words: Array<String>): String {
        var trie = buildTrie(words)
        var idx = words.size -1
        var prefixSet = mutableSetOf<String>()
        var result = mutableListOf<String>()
        var maxLength = Int.MIN_VALUE
        while(idx >= 0) {
           if(!prefixSet.contains(words[idx])) {
               if(checkPrefixs(words[idx].substring(0, words[idx].length), trie, prefixSet)){
                   if(maxLength <= words[idx].length) {
                       maxLength = words[idx].length
                       result.add(words[idx])
                   }
             }
           }
           idx--
        }
        var filtered = result.asSequence().filter { it.length == maxLength }.sortedBy { it }.toList()
        //println("Result --> ${filtered} MaxLength = ${maxLength}")
        return filtered.first()
    }

    private fun checkPrefixs(word: String, trie: Trie, prefixList: MutableSet<String>): Boolean {
        if(word.length == 0) {
            return true;
        }
        if(!trie.search(word)) {
            return false
        }
        prefixList.add(word)
        return checkPrefixs(word.substring(0, word.length - 1), trie, prefixList)
    }


    private fun  buildTrie(words: Array<String>): Trie {
        var trie = Trie()
        for(word in words) {
            trie.insert(word)
        }
        return trie
    }
}
