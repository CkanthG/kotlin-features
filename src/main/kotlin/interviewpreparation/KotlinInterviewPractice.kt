package interviewpreparation

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //without class declaration we can run the main method in kotlin.
    val message = "Hello Kotlin Developer!"
    println(message)

    //null safety
    val nullableString: String? = null
    val length = nullableString?.length ?: 0
    println("Length of nullable String $length")

    //immutable example
    val immutbaleString: String = "immutable"
    var mutableString: String = "mutable"
    mutableString = "changed mutable"
    println("Immutable String : $immutbaleString & mutable String : $mutableString")

    val str = "Welcome to Kotlin World!"
    println("remove white spaces in given sentence using extension function \n before : $str \n after : ${str.removeWhiteSpaces()}")

    // smart cast
    smartCastExample("Hello Kotlin User")

    // data class
    val person = Person("sreekanth", 32)
    println("Data Class Properties : Name -> ${person.name} & Age -> ${person.age}")

    //Higher order function
    val result = { a : Int, b : Int -> a + b }
    println("Higher Order Function Result : ${calculate(result)}")

    //Coroutines Example
    coroutinesExample()

    //sum of list values
    val list = listOf(1,2,3)
    println("list of integers sum : ${list.sum()}")

    //companion method call
    KotlinInterviewPractice.staticMethod()

    //interoperability
    val strList = mutableListOf<String>()
    strList.add("Hello ")
    strList.add("Kotlin")
    println("Interoperability String List : $strList")

    //calling sealed class
    val success = Success(100)
    val failure = Failure("Someting went wrong")
    handleSealedClass(success)
    handleSealedClass(failure)

    //Type inference
    val number = 32
    val decimal = 50.01
    val string = "Hello Kotlin"
    println("$number - $decimal - $string")

    //extension properties example
    val str1 = "radar"
    val str2 = "hello"
    println("$str1 is palindrome? ${str1.isPalindrome}")
    println("$str2 is palindrome? ${str2.isPalindrome}")

    //DSL example
    val msg = buildString {
        append("Hello ")
        append("Kotlin ")
        append("Programmer")
    }
    println(msg)
}

//Extension function
fun String.removeWhiteSpaces(): String {
    return this.replace("\\s".toRegex(), "")
}

//smart cast
fun smartCastExample(str: Any) {
    if (str is String) {
        println("length of given string : ${str.length}")
    }
}

//data class
data class Person(val name: String, val age: Int)

//Higher order function
fun calculate(operation: (Int, Int) -> Int): Int {
    return operation(10, 5);
}

//coroutines example
fun coroutinesExample() {
    runBlocking {
        val job = launch {
            delay(1000)
            println("Kotlin World!")
        }
        print("Hello ")
        job.join()
    }
}

//companion object
class KotlinInterviewPractice {
    companion object {
        fun staticMethod() {
            println("Static method in kotlin")
        }
    }
}

//sealed class implementation
fun handleSealedClass(result: Result) {
    when(result) {
        is Success -> println("Success : ${result.value}")
        is Failure -> println("Error : ${result.message}")
    }
}

//extension properties
val String.isPalindrome : Boolean
    get() = this == this.reversed()

//Kotlin DSL example
fun buildString(buildStringAction: StringBuilder.() -> Unit):String {
    val stringBuilder = StringBuilder()
    stringBuilder.buildStringAction()
    return stringBuilder.toString()
}
