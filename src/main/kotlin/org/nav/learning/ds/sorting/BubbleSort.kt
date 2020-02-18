package org.nav.learning.ds.sorting

class BubbleSort {

    fun sort(arr: IntArray) {
        var len = arr.size
        var idx = 0
        while(idx < len ) {
            var jdx = idx + 1
            while (jdx < len) {
                if(arr[idx] > arr[jdx]) {
                    var temp = arr[idx]
                    arr[idx] = arr[jdx]
                    arr[jdx] = temp
                }
                jdx++
            }
            idx++
        }
    }
}
