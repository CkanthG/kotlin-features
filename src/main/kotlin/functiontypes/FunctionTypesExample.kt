package functiontypes

object FunctionTypesExample {
    val sum: (Int, Int) -> Int = {a, b -> a+b}

    fun higherOrderFunction(a: Int, b: Int, calc: (Int, Int) -> Int): Int {
        return calc(a, b)
    }
}