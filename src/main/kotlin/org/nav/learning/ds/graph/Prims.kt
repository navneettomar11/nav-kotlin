package org.nav.learning.ds.graph

import java.util.*

class Prims(val edges: Array<Edge>, val vertices: Int) {
    var priorityQueue = PriorityQueue<Int>()
    var marked = IntArray(vertices)
    init {
        prism()
    }

    private fun prism() {
        var count = 0

        while(count < vertices) {

        }
    }

}
