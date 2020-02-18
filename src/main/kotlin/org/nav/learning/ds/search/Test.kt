package org.nav.learning.ds.search

fun main(args: Array<String>) {
    val linearSearch  = LinearSearch()
    println("Linear Search via iteration : ${linearSearch.iterationSearch(intArrayOf(1,3,5,6), 5)}")
    println("Linear Search via recursion : ${linearSearch.recursiveSearch(intArrayOf(1,3,5,6), 6)}")

    var binarySearch = BinarySearch()
    println("Binary Search via iteration : ${binarySearch.iterationSearch(intArrayOf(1,3,5,6), 5)}")
}
