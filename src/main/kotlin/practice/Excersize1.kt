package practice

class Excersize1 {

    fun findEvenNumbersUsingVarArg(vararg data: Any) {
        var counter = 0
        data.forEach {
            when (it) {
                it as Int -> {
                    if (it % 2 == 0) {
                        println("Even Number: $it")
                        counter++
                    }
                }
                else -> println("Given Data $it")
            }
        }
        println("Total number of even numbers in 1 to 10 : $counter")
    }
}

fun main() {
    Excersize1().findEvenNumbersUsingVarArg(1,2,3,4,5,6,7,8,9,10)
}