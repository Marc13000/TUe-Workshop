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

fun sumOfDigits(n: Int): Int {
    val str = n.toString()
    
    var sum = 0
    
    for (char in str) {
        val digit = char - '0'
        sum += digit
    }
    return sum
}

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}

fun longestWord(sentence: String): String? {
    val words = sentence.split(" ")
    
    if (words.isEmpty()) {
        return null // Return null if no words are found
    }
    
    var longest = words[0] // Start with the first word
    for (word in words) {
        if (word.length > longest.length) {
            longest = word
        }
    }    
    return longest
}
