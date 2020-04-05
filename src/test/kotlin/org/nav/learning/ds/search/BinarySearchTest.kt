package org.nav.learning.ds.search

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinarySearchTest {

    val binarySearch = BinarySearch()

    @Test
    fun `binary search in array of integer` () {
        assertEquals(2, binarySearch.search(intArrayOf(1,2,3,4,5), 3))
    }

    @Test
    fun `binary search in array of long` () {
        assertEquals(2, binarySearch.search(longArrayOf(1L,2L,3L,4L,5L), 3L))
    }

    @Test
    fun `binary search in array of string`() {
        assertEquals(3, binarySearch.search(arrayOf("Jade", "Jane", "John","Joe","Jolly"), "Joe"))
    }
}
