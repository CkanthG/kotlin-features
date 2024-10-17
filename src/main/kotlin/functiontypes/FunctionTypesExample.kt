package functiontypes

import functiontypes.FunctionTypesExample.higherOrderFunction

object FunctionTypesExample {
    val sum: (Int, Int) -> Int = {a, b -> a+b}

    fun higherOrderFunction(a: Int, b: Int, calc: (Int, Int) -> Int): Int {
        return calc(a, b)
    }
}

fun main() {
    val multiplication = higherOrderFunction(5, 6) {a, b -> a * b}
    println("multiplication of 5 and 6 with higher order function : $multiplication")
}
