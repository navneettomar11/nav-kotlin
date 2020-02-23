package org.nav.learning.ds.graph

fun main(args: Array<String>) {

    var costMatrix = arrayOf(
        intArrayOf(0,4,0,0,0,2),
        intArrayOf(4,0,6,0,0,3),
        intArrayOf(0,6,0,3,0,1),
        intArrayOf(0,0,3,0,2,0),
        intArrayOf(0,0,0,2,0,4),
        intArrayOf(2,3,1,0,4,0)
    );

    var minimumSpanningTree = MinimumSpanningTree()
    println("Minimum Spanning Tree Cost = ${minimumSpanningTree.minCost(costMatrix)}")
}
