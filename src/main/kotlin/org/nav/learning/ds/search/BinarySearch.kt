package org.nav.learning.ds.search

class BinarySearch {

    fun iterationSearch(arr: IntArray, target: Int) : Int {
        var high = arr.size -1
        var low = 0


        while(low < high) {
            var mid = (low + high)/2
            if(arr[mid] === target) {
                return mid
            }
            if(arr[mid] > target) {
                high = mid - 1
            }else if(arr[mid] < target) {
                low = mid + 1
            }
        }
        return -1
    }

    fun recursiveSearch(arr: IntArray, target: Int): Int {
        return -1
    }
}
