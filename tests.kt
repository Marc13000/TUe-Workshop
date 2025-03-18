// tests.kt - Unit tests for the functions
import kotlin.test.assertEquals

fun main() {
    // Test countVowels
    assertEquals(3, countVowels("Hello World"))
    assertEquals(4, countVowels("Kotlin is fun!"))
    assertEquals(5, countVowels("Education is key"))
    
    println("All tests passed!")
}
