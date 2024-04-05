package interviewpreparation

fun main() {
    //Using filter and map functions:
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val squaredNumbers = numbers.map { it * it }

    println("Even numbers: $evenNumbers")
    println("Squared numbers: $squaredNumbers")

    // Filter even numbers and then map them to their squares
    val squaresOfEvenNumbers = numbers.filter { it % 2 == 0 }.map { it * it }

    println("Squares of even numbers: $squaresOfEvenNumbers")

    //Using let function
    val name: String? = "Sree"
    val message = name?.let {
        "Hello, $it!"
    } ?: "Hello, Guest!"

    println(message)

    //group by
    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 30),
        Person("Dave", 25)
    )

    val groupedByAge = people.groupBy { it.age }
    println("People grouped by age: $groupedByAge")

    val names = listOf("Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Alice", "Bob")

    // Group names by their first letter
    val groupedNames = names.groupBy { it.first().uppercase() }

    println("Grouped names: $groupedNames")

    // Sort people by their age in ascending order
    val sortedPeople = people.sortedBy { it.name }

    println("Sorted people by age: $sortedPeople")

    //Using joinToString function:
    val colors = listOf("red", "green", "blue")
    val concatenatedColors = colors.joinToString(separator = ", ", prefix = "Colors: ", postfix = ".")
    println(concatenatedColors)

    //Using withIndex function:
    for ((index, color) in colors.withIndex()) {
        println("Color at index $index is $color")
    }

    //Using mapOf to create a map
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)

    //Using sequenceOf to create a sequence:
    val sequence = sequenceOf(1, 2, 3, 4, 5)
    val doubled = sequence.map { it * 2 }
    println(doubled.toList())

    //Using run to execute a block of code:
    val result = run {
        val a = 10
        val b = 20
        a + b
    }
    println("Result: $result")

    //Using with to operate on an object's properties:
    val person = Person("Alice", 30)
    val description = with(person) {
        "Name: ${person.name}, Age: $age"
    }
    println(description)

    //Using lazy to create a lazy-initialized property
    val lazyProperty: String by lazy {
        println("Initializing lazy property")
        "Lazy Value"
    }
    println("Accessing lazy property...")
    println("Lazy property value: $lazyProperty")

    //using zip
    val letters = listOf('A', 'B', 'C', 'D', 'E')
    val numbers1 = listOf(1, 2, 3, 4, 5)

    // Combine corresponding elements from both lists into pairs
    val pairs = letters.zip(numbers1)

    println("Pairs: $pairs")
}