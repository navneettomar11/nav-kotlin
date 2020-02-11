package org.nav.learning

/**
 *  Zero and negative numbers are not considered powers of two.
 */
fun isPowerOfTwo(n: Int): Boolean {
    if(n <= 0) return false
    return (n and n - 1) === 0
}


