package org.nav.learning.ds.sorting

class InsertionSort {

    fun sort(arr: FloatArray) {
        var len = arr.size
        var idx = 1
        while(idx < len) {
            var jdx = idx
            while(jdx > 0 && arr[jdx-1] > arr[jdx]) {
                var temp = arr[jdx]
                arr[jdx] = arr[jdx-1]
                arr[jdx-1] = temp
                jdx--
            }
            idx++
        }
    }

    fun sort(arr: IntArray) {
        var len = arr.size
        var idx = 1
        while(idx < len) {
            var jdx = idx
            while(jdx > 0 && arr[jdx-1] > arr[jdx]) {
                var temp = arr[jdx]
                arr[jdx] = arr[jdx-1]
                arr[jdx-1] = temp
                jdx--
            }
            idx++
        }
    }
}
