package org.nav.learning.ds.search

class BinarySearch {

    fun search(arr:IntArray, target: Int): Int {
        var longArray: LongArray = arr.map { it.toLong() }.toLongArray()
        return iterationSearch(longArray, target.toLong())
}

    fun search(arr: LongArray, target: Long): Int {
        return iterationSearch(arr, target);
    }

    fun search(arr: Array<String>, target: String): Int {
        return recursiveSearch(arr, target, 0, arr.size);
    }

    private fun iterationSearch(arr: LongArray, target: Long) : Int {
        var high = arr.size -1
        var low = 0

        while(low < high) {
            var mid = (low + high)/2
            if(arr[mid] == target) {
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

    fun recursiveSearch(arr: Array<String>, target: String,low: Int,high: Int): Int {
        var mid = high - (low + high)/2
        var compare = arr[mid].compareTo(target)
        if(compare == 0) {
            return mid
        }
        if(compare < 0) {
            recursiveSearch(arr, target, low, mid)
        } else {
            recursiveSearch(arr, target, mid+1, high)
        }
        return -1
    }
}
