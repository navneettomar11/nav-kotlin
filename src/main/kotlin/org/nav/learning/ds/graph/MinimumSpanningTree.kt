package org.nav.learning.ds.graph

class MinimumSpanningTree {

    private fun minKey(key: IntArray, visited: BooleanArray, size: Int) : Int {
        var minValue = Int.MAX_VALUE
        var minIdx = -1
        for(idx in 0..size-1) {
             if(!visited[idx] && key[idx] < minValue) {
                 minValue = key[idx]
                 minIdx = idx
             }
        }
        return minIdx
    }



    fun minCost(costMatrix: Array<IntArray>): Int {
        var minCost = 0
        var SIZE = 6
        var key = IntArray(SIZE) {
            Int.MAX_VALUE
        }
        var visited = BooleanArray(SIZE) {
            false
        }
        var parent = IntArray(SIZE){
            -1
        }

        key[0] = 0
        parent[0] =  -1

        for(i in 0..SIZE-1) {
            var j = minKey(key, visited, SIZE)
            visited[j] = true
            for (k in 0..SIZE-1) {
                if(costMatrix[j][k] !== 0 && !visited[k] && costMatrix[j][k] < key[k] ) {
                    parent[k] = j
                    key[k] = costMatrix[j][k]
                }
            }
        }
        for(i in 0..SIZE-1) {
            //println("Cost ${costMatrix[i].toList()} parent --> ${parent[i]}")
            minCost+=costMatrix[i][parent[i]]
        }
        return minCost
    }
}
