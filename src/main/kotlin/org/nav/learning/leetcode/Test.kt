package org.nav.learning.leetcode

fun createListNode(nums: IntArray): ListNode {
    var rootNode: ListNode =
        ListNode(nums[0])
    var listNode = rootNode
    for (idx in nums.indices) {
        if (idx === 0) continue
        listNode.next = ListNode(nums[idx])
        listNode = listNode.next!!
    }
    return rootNode
}

fun main(args: Array<String>) {

    //LeetCode -01
    //println("Leetcode - 01")
    //println("P1 --> ${Arrays.toString(twoSum(intArrayOf(2, 7, 11, 15), 9))}")

    //LeetCode - 02
    /*println("LeetCode - 02")
    var list01 = createListNode(intArrayOf(2,4,3));
    var list02 = createListNode(intArrayOf(5,6,4));
    println("P1 --> ${addTwoNumbers(list01, list02)}")
    var list03 = createListNode(intArrayOf(0))
    println("P2 --> ${addTwoNumbers(list03, null)}")
    var list04 = createListNode(intArrayOf(9))
    var list05 = createListNode(intArrayOf(1,9,9,9,9,9,9,9,9,9))
    println("P3 --> ${addTwoNumbers(list04, list05)}")
    var list06 = createListNode(intArrayOf(9,9,9,9,9,9,9,9,9,9))
    var list07 = createListNode(intArrayOf(9,9,9,9,9,9,9,9,9,9))
    println("P4 ---> ${addTwoNumbers(list06, list07)}")
    var list08 = createListNode(intArrayOf(2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9))
    var list09 = createListNode(intArrayOf(5,6,4,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9,9,9,9))
    println("P5 ---> ${addTwoNumbers(list08, list09)}")*/

    //Leetcode - 07
    /*println("Leetcode - 07")
    println("P1 --> ${reverseInt(123)}") //output = 321
    println("P2 --> ${reverseInt(-123)}") //output = -321
    println("P3 --> ${reverseInt(120)}") //output = 21
    println("P4 --> ${reverseInt(1534236469)}") //output = 0*/

    //Leetcode - 08
    /* println("Leetcode - 08")
     println("P1 --> ${myAtoi("42")}") //output = 42
     println("P2 --> ${myAtoi("    -42")}") //output = -42
     println("P3 --> ${myAtoi("4193 with words")}") //output = 4193
     println("P4 --> ${myAtoi("words and 987")}") //output = 0
     println("P5 --> ${myAtoi("-91283472332")}") //output = -2147483648
     println("P6 --> ${myAtoi("+1")}") //output = 1
     println("P7 --> ${myAtoi("+-2")}") //output = 0*/

    //Leetcode - 09
    //println("Leetcode - 08")
    //println("P1 --> ${isPalindrome(121)}") //output = true
    //println("P2 --> ${isPalindrome(-121)}") //output = false

    //Leetcode - 11
    //println("Leetcode - 11")
    // println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))

    //Leetcode - 12
    /*println("Leetcode - 12")
    println("P1 --> ${intToRoman(3)}")
    println("P2 --> ${intToRoman(4)}")
    println("P3 --> ${intToRoman(9)}")
    println("P4 --> ${intToRoman(58)}")*/

    //Leetcode - 13
    /*println("Leetcode - 13")
    println("P1 --> ${romanToInt("III")}")
    println("P2 --> ${romanToInt("IV")}")
    println("P3 --> ${romanToInt("IX")}")
    println("P4 --> ${romanToInt("LVIII")}")
    println("P5 --> ${romanToInt("MCMXCIV")}")*/

    //Leetcode - 16
    //println("Leetcode - 16")
    //println("P1 --> ${threeSumClosest(intArrayOf(-1, 2, 1, -4), 1)}") //output = 2
    //println("P2 --> ${threeSumClosest(intArrayOf(1,1,-1,-1,3), 3)}") //output = 3
    //println("P3 --> ${threeSumClosest(intArrayOf(1,1,1,0),100)}") //output = 3
    //println("P4 --> ${threeSumClosest(intArrayOf(1,1,-1,-1,3), -1)}") //output = -1
    //println("P5 --> ${threeSumClosest(intArrayOf(0,2,1,-3),1)}") //output = 0

    //Leetcode - 18
    //println("Leetcode - 18")
    //println("P1 --> ${fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)}") //output = [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
    //println("P2 --> ${fourSum(intArrayOf(0,0,0,0), 1)}") // output = []
    //println("P3---> ${fourSum(intArrayOf(-3,-1,0,2,4,5), 0)}") //output = [[-3,-1,0,4]]
    //println("P4 --->${fourSum(intArrayOf(-3,-2,-1,0,1,2,3), 0)}") //output = [[-3,-2,2,3],[-3,-1,1,3],[-3,0,0,3],[-3,0,1,2],[-2,-1,0,3],[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

    //Leetcode - 29
    //println("Leetcode 29")
    //println("P1 --> ${divideTwoInt(10,3)}") //output = 3
    //println("P2 --> ${divideTwoInt(7,-3)}") //output = 2
    //println("P3 --> ${divideTwoInt(1,1)}") //output = 1
    //println("P4 --> ${divideTwoInt(-1,-1)}") //output = 1
    //println("P5 ---> ${divideTwoInt(-2147483648, 1)}") //output= -2147483648
    //println("P6 --> ${divideTwoInt(-2147483648, -1)}") //output= 2147483647
    //println("P7 --> ${divideTwoInt(2147483647, 2)}") //output = 1073741823
    //println("P8 --> ${divideTwoInt(1038925803 ,-2147483648)}")


    //Leetcode - 33
    /*println("Leetcode 33")
    println("P1 --> ${searchInRotatedArray(intArrayOf(4,5,6,7,0,1,2), 0)}") //output = 4
    println("P2 --> ${searchInRotatedArray(intArrayOf(4,5,6,7,0,1,2), 3)}") //output = -1
    println("P3 --> ${searchInRotatedArray(intArrayOf(4,5,6,7,0,1,2), 6)}") //output = 2
*/
    //Leetcode - 35
/*    println("Leetcode 35")
    println("P1 --> ${searchInsert(intArrayOf(1,3,5,6), 5)}") //output = 2
    println("P2 --> ${searchInsert(intArrayOf(1,3,5,6), 2)}") //output = 1
    println("P3 --> ${searchInsert(intArrayOf(1,3,5,6), 7 )}") //output = 4
    println("P4 --> ${searchInsert(intArrayOf(1,3,5,6), 0 )}") //output = 0
    println("P5 --> ${searchInsert(intArrayOf(1,3,5,6, 9, 11, 15), 10 )}") //output = 4
    println("P6 --> ${searchInsert(intArrayOf(1,3,5,6, 9, 11, 15), -2 )}") //output = 0
    println("P6 --> ${searchInsert(intArrayOf(1,3,5,6, 9, 11, 15), 11 )}") //output = 5
    println("P7 --> ${searchInsert(intArrayOf(1), 0 )}") //output = 0
    println("P8 --> ${searchInsert(intArrayOf(1), 2 )}") //output = 1*/


    //Leetcode - 43
   /* println("Leetcode 43")
    println("P1 --> ${multiply("2", "3")}") //output = 6
    println("P2 --> ${multiply("123", "456")}") //output = 56088
    println("P3 --> ${multiply("12377777777777534343242343242342342342342342342342342342342342342342342342342342342342342342342342342342", "4566666666666666666666666")}")
    println("P4 --> ${multiply("123456789","987654321")}") //output = "121932631112635269"
    println("P5 --> ${multiply("498828660196","840477629533")}") //output = "419254329864656431168468"*/
    //output = ???

    //Leetcode - 50
    //println("Leetcode 50")
    //println("P1 --> ${myPow(2.0, 10)}") //output = 1024.00000

    //Leetcode - 65
    /*println("Leetcode - 65")
    println("P1 1--> ${isNumber("3")}")
    println("P1 2--> ${isNumber("-1   ")}")*/

    //Leetcode - 67
    /*println("Leetcode - 67")
    println("P1 --> ${addBinary("11", "1")}")
    println("P2 --> ${addBinary("1010", "1011")}")
    println("P3 --> ${addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
        ,"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011")}")*/

    //Leetcode - 69
    /*println("Leetcode - 69")
    println("P1 --> ${mySqrt(4)}")
    println("P2 --> ${mySqrt(8)}")
    println("P3 --> ${mySqrt(2147395600)}") //46340*/

    //Leetcode - 88
    //println("Leetcode - 88")
    //mergeSortedArray(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3) //[1,2,2,3,5,6]

    //Leetcode - 166
    //println("Leetcode 166")
    /*println("P1 --> ${fractionToDecimal(1,2)}")
    println("P2 --> ${fractionToDecimal(2,1)}")
    println("P3 --> ${fractionToDecimal(4, 333)}") //
    println("P4 --> ${fractionToDecimal(2, 3)}")
    println("P5 --> ${fractionToDecimal(-10, 3)}")
    println("P6 --> ${fractionToDecimal(1, 6)}") //"0.1(6)"
    println("P6 --> ${fractionToDecimal(1, 333)}") //"0.(003)"
    println("P7 --> ${fractionToDecimal(-1 ,-2147483648)}") //"0.0000000004656612873077392578125"*/

    //Leetcode - 168
    /*println("Leetcode 168")
    println("P1 --> ${convertToExcelTitle(1)}")
    println("P2 --> ${convertToExcelTitle(28)}")
    println("P2 --> ${convertToExcelTitle(701)}") //ZY
    println("P3 --> ${convertToExcelTitle(52)}") //AZ*/

    //Leetcode - 171
   /* println("Leetcode 171")
    println("P1 --> ${excelTitleToNumber("A")}")
    println("P2 --> ${excelTitleToNumber("AB")}")
    println("P3 --> ${excelTitleToNumber("AZ")}")
    println("P3 --> ${excelTitleToNumber("ZY")}")*/

    //Leetcode - 236
    //println("Leetcode 236")
    //println("P1 ---> ${isPowerOfTwo(1)}") //output = true
    //println("P2 ---> ${isPowerOfTwo(16)}") //output = true
    //println("P3 ---> ${isPowerOfTwo(218)}") //output = false
    //println("P4 ---> ${isPowerOfTwo(-2147483648)}") //output = false
    //println("P5 ---> ${isPowerOfTwo(0)}") //output = false
    //println("P6 ---> ${isPowerOfTwo(-9)}") //output = false

    //Leetcode - 912
    //println("Leetcode 912")
    //println("P1 --> ${sortArray(intArrayOf(5,1,1,2,0,0))}")
}

