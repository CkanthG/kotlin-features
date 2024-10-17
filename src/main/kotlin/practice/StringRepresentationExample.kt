package practice

class StringRepresentationExample {

    fun stringRepresentation() {
        val listOfStrings = listOf("abc", "def", "ghi", "jkl")
        println(listOfStrings.joinToString(""))
        val stringBuffer = StringBuffer("The alphabets are : ")
        println(listOfStrings.joinTo(stringBuffer))
        println(listOfStrings.joinToString { "Alphabets : ${it.replaceFirstChar { it.uppercase() }}" })

        println(listOfStrings.joinToString("", prefix = "English Alphabets : ", postfix = "."))
        val numbers = (1..100).toList()
        println(numbers.joinToString(limit = 20, truncated = "<...>"))
    }
}

fun main() {
    val stringRepresentationExample = StringRepresentationExample()
    stringRepresentationExample.stringRepresentation()
}