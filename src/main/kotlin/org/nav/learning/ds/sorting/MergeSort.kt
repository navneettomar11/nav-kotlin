package org.nav.learning.ds.sorting

class MergeSort {

    fun sort(arr: IntArray) {
        mergeSort(arr, 0, arr.size-1)
    }

    fun mergeSort(arr:IntArray, low: Int, high: Int) {
        println("Low ${low} high ${high}")
        if(low < high) {
            var mid = (low + high)/2
            mergeSort(arr, low, mid)
            mergeSort(arr, mid+1, high)
            merge(arr, low, mid, high)
        }
    }

    fun merge(arr:IntArray, low: Int, mid: Int, high: Int) {
        //println("Merge Method --> Low ${low} mid ${mid} high ${high}")
        var numList = IntArray(arr.size)
        var idx = low
        var jdx = mid + 1
        var k = 0
        while(idx <= mid && jdx <= high) {
            if(arr[idx] < arr[jdx]) {
                numList[k++] = arr[idx++]
            }else {
                numList[k++] = arr[jdx++]
            }
        }
        while(idx <= mid) {
            numList[k++]= arr[idx++]
        }
        while(jdx <= high) {
            numList[k++] = arr[jdx++]
        }
        //println("Number List ${numList.toList()} arr ${arr.toList()}")
        idx = high
        while (idx >= low) {
            arr[idx] = numList[--k]
            idx--
        }
    }
}
