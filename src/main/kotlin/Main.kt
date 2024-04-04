import classes.Introduction
import coroutines.CoroutinesExample
import dataclasses.Person
import functiontypes.FunctionTypesExample.sum
import functiontypes.FunctionTypesExample.higherOrderFunction
import loops.ForLoopExample
import maps.MapExample

fun main(args: Array<String>) {
    println("Welcome to the Kotlin World!")
    val printMessage = Introduction().printMessage()
    println(printMessage)
    val inputMessage = "message to change as upper case letters"
    val compareWithExtension = Introduction().compareWithExtension(inputMessage)
    println("Uppercase Strings With Extension Function  \ninput is: $inputMessage \noutput: $compareWithExtension")
    val person = Person("Sreekanth Gaddoju", 10, "Kotlin and Java")
    println("Data Class Example \nName : ${person.name}, Proficiency in : ${person.proficiency}, Experience : ${person.experience} Years")

    val result = sum(8, 9)
    println("Sum with Function Types : $result")
    val (name, experience, proficiency) = Person("Sowmya Gaddoju", 2, "Java")
    println("Destructuring of Data Class \nName : $name, Proficiency in : $proficiency, Experience : $experience years")
    println("Lambda Expressions")
    val list = listOf(10, 20, 30)
    val double = list.map { it * 2 }
    println("list: $list -> double list: $double")
    val multiplication = higherOrderFunction(15, 16) {a, b -> a * b}
    println("multiplication of 15 and 16 with higher order function : $multiplication")
    println("Print Even and Odd from 1 to 5")
    ForLoopExample.forLoop()
    println("Map Iterating")
    MapExample.mapIterate()
    CoroutinesExample().main()
}

fun Introduction.compareWithExtension(str: String): String {
    return str.uppercase()
}

