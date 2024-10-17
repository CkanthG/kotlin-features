package practice

class Variables {

    fun variablesAssignments() {
        val longValue: Long = 2000000000000000000
        val integerValue: Int = 1000000000
        val shortValue: Short = 9000
        val byteValue: Byte = 120
        println("Byte: $byteValue, Short: $shortValue, Int: $integerValue, Long: $longValue")
        println("Long, Int, Short and Byte Ranges:")
        println("Long Max Value: ${Long.MAX_VALUE}")
        println("Long Min Value: ${Long.MIN_VALUE}")
        println("Integer Max Value: ${Int.MAX_VALUE}")
        println("Integer Min Value: ${Int.MIN_VALUE}")
        println("Short Max Value: ${Short.MAX_VALUE}")
        println("Short Min Value: ${Short.MIN_VALUE}")
        println("Byte Max Value: ${Byte.MAX_VALUE}")
        println("Byte Min Value: ${Byte.MIN_VALUE}")
        println("Float and Double Ranges:")
        println("Float Max Value: ${Float.MAX_VALUE}")
        println("Float Min Value: ${Float.MIN_VALUE}")
        println("Double Max Value: ${Double.MAX_VALUE}")
        println("Double Min Value: ${Double.MIN_VALUE}")
        val charValue: Char = 'C'
        println("Char: $charValue")
        val booleanValue: Boolean = true
        println("Boolean: $booleanValue and Negation: ${!booleanValue}")
        var text: String? = null
        text = "Sreekanth"
        println(text?.length)
        text = null
        println(text ?: "null value")
    }

    fun varArgAssignment(vararg integerValues: Int) {
        integerValues.forEach { println("values : $it") }
        println("Sum of Integer Values: ${integerValues.sum()}")
    }
}

fun main() {
    val variables = Variables()
    variables.variablesAssignments()
    variables.varArgAssignment(1,2,3,4,5,6,7,8,9)
}