package practice

import com.sun.org.apache.xpath.internal.operations.Bool

class HigherOrderFunction {
    fun printFilteredString(list: List<String>, predicate: (String) -> Boolean) {
        list.forEach {
            if (predicate(it)) {
                println(it)
            }
        }
    }
}

fun main() {
    val higherOrderFunction = HigherOrderFunction()
    higherOrderFunction.printFilteredString(listOf("Kotlin", "Java", "JavaScript", "Scala")) {
        it.startsWith("J")
    }
}