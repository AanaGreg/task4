fun main() {
    print("Please, enter a character: ")
    val charEntry = readln().first()
    val isVowel = when (charEntry) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
    println("The character you entered ($charEntry) ${if(isVowel) "is" else "isn't"} a vowel.")
}