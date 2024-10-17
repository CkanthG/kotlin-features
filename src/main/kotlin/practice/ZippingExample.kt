package practice

class ZippingExample {

    fun zipping() {
        val colors = listOf("red", "blue", "green")
        val vehicles = listOf("tesla", "bmw", "audi")
        println(colors.zip(vehicles))
        println(colors zip vehicles)
        println(colors.zip(vehicles){ color, vehicle -> "The ${vehicle.replaceFirstChar { it.uppercase() }} is $color"})
    }

    fun unZipping() {
        val pairs = listOf(1 to "abc", 2 to "def", 3 to "ghi")
        println(pairs)
        println(pairs.unzip())
    }
}

fun main() {
    val zippingExample = ZippingExample()
    zippingExample.zipping()
    zippingExample.unZipping()
}