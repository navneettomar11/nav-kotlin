package org.nav.learning.ds.sorting

class HeapSort {

    fun sort(arr:IntArray) {
        this.heapsort(arr);
    }

    private fun heapify(arr: IntArray, n: Int, i: Int) {
        var largest = i
        var l = 2*i+1
        var r = 2*i+2
        //println("L: ${l} r ${r}")
        if(l < n && arr[l] > arr[largest]) {
            largest = l
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if(largest != i) {
            var temp = arr[i]
            arr[i] = arr[largest]
            arr[largest] = temp

            heapify(arr, n , largest)
        }
    }

    private fun heapsort(arr: IntArray) {
        //build heapify  (rearrange array)
        var n = arr.size
        var idx = n/2 -1
        while(idx >= 0) {
            heapify(arr, n, idx)
            idx--
        }

        //one by one extract an element from heap
        idx = n - 1
        while(idx >= 0) {
            var temp = arr[0]
            arr[0] = arr[idx]
            arr[idx] = temp
            // call max heapify on the reduced heap
            heapify(arr, idx, 0);
            idx--
        }
    }
}
