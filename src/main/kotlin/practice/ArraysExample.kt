package practice

class ArraysExample {

    fun stringArray() {
        val names = arrayOf("a", "b", "c", "d", "e")
        names.forEach { print("$it ") }
        println("\nFirst Value : ${names[0]}")
        names[4] = "abcd"
        println("Last Value : ${names.get(4)}")
        println("Size of names array : ${names.size}")
    }

    fun mixedArray() {
        val data = arrayOf(1,2,3,4,'a',"abc",10.0,false,null)
        for (d in data) {
            when {
                d is Int -> println("Integer Value: $d")
                d is String -> println("String Value: $d")
                d is Char -> println("Char Value: $d")
                d is Boolean -> println("Boolean Value: $d")
                d is Double -> println("Double Value: $d")
                else -> println("Not a valid value")
            }
        }
    }

    fun findMaxInGivenArray(numbers: Array<Int>): Int {
        var max = numbers[0]
        for (num in numbers) {
            if (num > max) {
                max = num
            }
        }
        return max
    }

    fun findMinInGivenArray(numbers: Array<Int>): Int {
        var min = numbers[0]
        for (num in numbers) {
            if (num < min) {
                min = num
            }
        }
        return min
    }
}

fun main() {
    val arraysExample = ArraysExample()
    arraysExample.stringArray()
    arraysExample.mixedArray()
    val max = arraysExample.findMaxInGivenArray(arrayOf(4,2,6,4,6,74,32,90,10))
    val min = arraysExample.findMinInGivenArray(arrayOf(4,2,6,4,6,74,32,90,10))
    println("max: $max and min: $min")
    val arr = arrayOf(4,2,6,4,6,74,32,90,10)
    println("default methods max: ${arr.max()} and min: ${arr.min()}")
}