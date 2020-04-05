package org.nav.learning.leetcode

import org.nav.learning.ds.advance.Trie
import java.lang.StringBuilder

class LeetCode1023 {

    fun camelMatch(queries: Array<String>, pattern: String): BooleanArray {
        var result = BooleanArray(queries.size){false}
        var n = queries.size

        //build trie
        var trie = Trie()
        queries.forEach { trie.insert(it) }

        for(i in 0 until n) {
            result[i] = isPatternMatch(queries[i], pattern, trie)
        }
        return result
    }

    private fun isPatternMatch(word: String, pattern: String, trie: Trie) :Boolean{
        var n = word.length
        var m = pattern.length
        var pidx = 0
        var i = 0
        var builder = StringBuilder()
        while(i < n ) {
            if(pidx < m && word[i] == pattern[pidx]) {
                pidx+=1
                builder.append(word[i])
            }else if(word[i].isLowerCase()) {
                builder.append(word[i])
            }
            i++
        }
        if(pidx != m) {
           return false
        }
        return trie.search(builder.toString())
    }
}
