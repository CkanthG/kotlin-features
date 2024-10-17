import classes.Introduction
import dataclasses.Person
import functiontypes.FunctionTypesExample.sum
import loops.ForLoopExample
import maps.MapExample
import practice.*

fun main(args: Array<String>) {
    println("Welcome to the Kotlin World!")
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
    println("Print Even and Odd from 1 to 5")
    ForLoopExample.forLoop()
    println("Map Iterating")
    MapExample.mapIterate()
    println("main function with arguments executed: ${args.joinToString()}")
    val instance1 = SingletonInstance.getInstance()
    val instance2 = SingletonInstance.getInstance()
    println(instance1)
    println(instance2)
    for (direction in DirectionsEnum.entries) {
        println("Direction : $direction")
    }
    println(DirectionsEnum.EAST.name)
    println(DirectionsEnum.EAST.direction)
    println(DirectionsEnum.EAST.distance)
    DirectionsEnum.EAST.printEnumValues()
//    val directions = DirectionsEnum.WEST
    val directions = DirectionsEnum.valueOf("north".uppercase())
    when(directions) {
        DirectionsEnum.WEST -> directions.printEnumValues()
        DirectionsEnum.SOUTH -> directions.printEnumValues()
        DirectionsEnum.NORTH -> directions.printEnumValues()
        DirectionsEnum.EAST -> directions.printEnumValues()
    }
    val innerClassExample = InnerClassExample(arrayOf("abc", "def", "ghi", "jkl", "mnp"))
    innerClassExample.InnerClass().displayArrayItem(0)
    val success = SealedClassesExample.Success("SUCCESS.")
    val error = SealedClassesExample.Error("FAILED!")
    loadSealedClasses(success)
    loadSealedClasses(error)
    println("== and === difference")
    val name1 = "abc"
    val name2 = "abc"
    val name3 = String("abc".toCharArray())
    println("name1: $name1 == name3: $name3 -> ${(name1 == name3)}")
    println(name2 === name3)
    println("name2: $name2 == name3: $name3 -> ${(name2 === name3)}")
    val objectExpressionExample = ObjectExpressionExample("Sreekanth", "s@gmail.com", object : CanWork{
        override fun doWork() {
            println("$name can do IT related work")
        }
    })
    println(objectExpressionExample.name)
    println(objectExpressionExample.email)
}

fun Introduction.compareWithExtension(str: String): String {
    return str.uppercase()
}
