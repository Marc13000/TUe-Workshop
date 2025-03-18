// long_versions.kt - Extremely detailed, well-commented versions of the functions

fun countVowels(s: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    
    var count = 0
    
    for (char in s) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
