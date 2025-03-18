// tests.kt - Unit tests for the functions
import kotlin.test.assertEquals

fun main() {
    // Test countVowels
    assertEquals(3, countVowels("Hello World"))
    assertEquals(4, countVowels("Kotlin is fun!"))
    assertEquals(5, countVowels("Education is key"))

    // Test sumOfDigits
    assertEquals(10, sumOfDigits(1234))
    assertEquals(30, sumOfDigits(9876))
    assertEquals(6, sumOfDigits(123))
    
    println("All tests passed!")
}
