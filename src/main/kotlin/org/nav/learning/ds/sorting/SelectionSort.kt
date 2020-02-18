package org.nav.learning.ds.sorting

class SelectionSort {

    fun sort(arr: IntArray) {
        var len = arr.size
        var idx = 0
        while(idx < len) {
            var minValue = arr[idx]
            var minIdx = idx
            var jdx = minIdx + 1
            while(jdx < len) {
                if(minValue > arr[jdx]) {
                    minIdx = jdx
                    minValue = arr[jdx]
                }
                jdx++
            }
            if(minIdx !== idx) {
                var temp = arr[idx]
                arr[idx] = minValue
                arr[minIdx] = temp
            }
            idx++
        }
    }
}
