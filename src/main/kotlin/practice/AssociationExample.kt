package practice

import kotlin.random.Random

class AssociationExample {

    fun associatedWithAndByMethods() {
        val data = listOf("one", "two", "three", "four", "five")
        println(data.associateWith { it.length })
        println(data.associateBy { it.first().uppercase() + Random.nextInt(20) })
        println(data.associateBy(keySelector = {it.uppercase()}, valueTransform = {it.length}))
    }
}

fun main() {
    val associationExample = AssociationExample()
    associationExample.associatedWithAndByMethods()
}