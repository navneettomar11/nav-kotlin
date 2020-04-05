package org.nav.learning.ds.advance

import com.sun.xml.internal.fastinfoset.util.StringArray
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class TrieTest {

    @Test
    fun `insert trie`() {
        var trie = Trie()
        trie.insert("abc")
        trie.insert("ab")
        trie.insert("a")
        assertArrayEquals( trie.content().toTypedArray(), arrayOf("a", "ab", "abc"))
        trie.insert("xyz")
        assertArrayEquals( trie.content().toTypedArray(), arrayOf("a", "ab", "abc", "xyz"))
    }

    @Test
    fun `search string in trie`() {
        var trie = Trie()
        trie.insert("abc")
        trie.insert("ab")
        assertTrue(trie.search("ab"))
        assertFalse(trie.search("abx"))

    }

    @Test
    fun `delete trie`() {
        var trie = Trie()
        trie.insert("abc")
        trie.insert("ab")
        trie.delete("ab")
        assertFalse(trie.search("ab"))
    }

    @Test
    fun `startswith from prefix`() {

    }
}
