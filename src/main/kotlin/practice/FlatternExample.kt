package practice

class FlatternExample {

    fun flatternMethod() {
        val numberArrays = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
        println(numberArrays[2][2])
        println(numberArrays.flatten())
        println(numberArrays.flatten().sortedDescending())

        val numberSets = listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))
        for (numbers in numberSets) {
            for (num in numbers) {
                print("$num ")
            }
            println()
        }
        val flatMap = numberSets.flatMap { it }
        println(flatMap)
    }
}

fun main() {
    val flatternExample = FlatternExample()
    flatternExample.flatternMethod()
}