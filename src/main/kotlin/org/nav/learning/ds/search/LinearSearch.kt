package org.nav.learning.ds.search

class LinearSearch {

    fun iterationSearch(arr: IntArray, target: Int): Int {
        if(arr.size == 0){
            return -1
        }
        for(idx in arr.indices) {
            if(arr[idx] === target) {
                return idx
            }
        }
        return -1
    }

    fun  recursiveSearch(arr: IntArray, target: Int, idx: Int = 0): Int {
        if(idx < arr.size && arr[idx] === target) {
            return idx
        }else if(idx > arr.size) {
            return -1
        }
        return recursiveSearch(arr, target, idx+1)
    }
}
