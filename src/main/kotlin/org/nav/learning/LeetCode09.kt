package org.nav.learning

/**
 * <h2>Palindrome Number</h2>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
fun isPalindrome(x: Int): Boolean {
    return x.toString().reversed().equals(x.toString())
}
