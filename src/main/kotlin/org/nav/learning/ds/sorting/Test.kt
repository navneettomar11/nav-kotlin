package org.nav.learning.ds.sorting

fun main(args: Array<String>) {
    var arr = intArrayOf(5, 1, 6, 2, 4, 3)
    /*var bubbleSort = BubbleSort();
    bubbleSort.sort(arr)
    println("Bubble Sorting : ${arr.toList()}")

    arr = intArrayOf(5, 1, 6, 2, 4, 3)
    var selectionSort = SelectionSort()
    selectionSort.sort(arr);
    println("Selection Sorting : ${arr.toList()}")

    arr = intArrayOf(5, 1, 6, 2, 4, 3)
    var insertionSort = InsertionSort()
    insertionSort.sort(arr)
    println("Insertion Sorting : ${arr.toList()}")*/

    /*arr = intArrayOf(32, 45,67, 2 ,7)
    var mergeSort = MergeSort()
    mergeSort.sort(arr)
    println("Merge Sort : ${arr.toList()}")*/

/*    arr = intArrayOf(9, 7, 5,11,12,2,14,3,10,6)
    var quickSort = QuickSort()
    quickSort.sort(arr)
    println("Quick Sort : ${arr.toList()}")*/

  /*  arr = intArrayOf(121, 10, 130, 57, 36, 17)
    var heapSort = HeapSort()
    heapSort.sort(arr)
    println("Heap Sort : ${arr.toList()}")*/

    /*arr = intArrayOf(5,4,3,2,1)
    var countingSort = CountingSort()
    countingSort.sort(arr);
    println("Counting Sort : ${arr.toList()}")*/

   /* arr = intArrayOf(10,21,17,34,44,11,654,123)
    var radixSort = RadixSort()
    radixSort.sort(arr)
    println("Radix Sort : ${arr.toList()}")*/

    var floatArr = floatArrayOf(0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f)
    var bucketSort = BucketSort()
    bucketSort.sort(floatArr);
    println("Bucket Sort: ${floatArr.toList()}")
}
