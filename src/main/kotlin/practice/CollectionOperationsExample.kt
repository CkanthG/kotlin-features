package practice

class CollectionOperationsExample {

    fun collectionOperationsMethod() {
        val numbers = listOf("one", "two", "three", "four", "five", "six")
        println("Filter Number Strings of : $numbers")
        val filteredNumbers = numbers.filter { it.length > 3 }
        println(filteredNumbers)
        val numbersMap = mapOf("key 1" to 1,"key 2" to 2,"key 3" to 3,"key 10" to 10)
        println("Filter Map of : $numbersMap")
        val filteredMap = numbersMap.filter { it.key.startsWith("key") && it.value > 2 }
        println(filteredMap)
        println("FilterIndexed Number Strings of : $numbers")
        val filterIndexed = numbers.filterIndexed { index, value -> (index !=0) && (value.length < 4) }
        println(filterIndexed)
        println("FilterNot Number Strings : $numbers")
        val filteredNot = numbers.filterNot { it.length < 4 }
        println(filteredNot)
        val mixedData = listOf(1,2,3,4,'A','B','C','D',"abc","def","ghi",true,false)
        println("Integer Values from MixedData of : $mixedData")
        mixedData.filterIsInstance<Int>().forEach {
            print("$it ")
        }
        println("\nChar Values from MixedData of : $mixedData")
        mixedData.filterIsInstance<Char>().forEach {
            print("$it ")
        }
        println("\nString Values from MixedData of : $mixedData")
        mixedData.filterIsInstance<String>().forEach {
            print("$it ")
        }
        println("\nBoolean Values from MixedData of : $mixedData")
        mixedData.filterIsInstance<Boolean>().forEach {
            print("$it ")
        }
        println("\nPredicate any, none, all of : $numbers")
        println(numbers.any { it.endsWith("o") })
        println(numbers.none { it.endsWith("a") })
        println(numbers.all { it.length > 2 })

        val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
        println("List of numbers Partition of : $numberList")
        val (matched, rest) = numberList.partition { it > 5 }
        println(matched)
        println(rest)

        val numsList = listOf("one", "two", "three", "four")
        println("Plus and Minus Operators of : $numsList")
        val plusList = numsList + "five" + "six" + mutableListOf("seven", "eight")
        println("Plus List : $plusList")
        val minusList = numsList - "two" - "four" - mutableListOf("three")
        println("Minus List : $minusList")

        println("Grouping By of : $numbers")
        println(numbers.groupBy { it.first().uppercase() })
        println(numbers.groupingBy { it.last().uppercase() }.eachCount())
        println(numbers.groupingBy { it.last().uppercase() }.aggregate { key, accumulator: Int?, element, first ->
            if (first) {
                if (key != "E") 1 else 0
            } else {
                if (key != "E") accumulator?.plus(1) else accumulator
            }
        })
        println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))

        println("Slice of : $numbers")
        println(numbers.slice(1..3))
        println(numbers.slice(0..4 step 2))
        println(numbers.slice(setOf(2,4,0)))

        println("Take and Drop of : $numbers")
        println(numbers.take(3))
        println(numbers.takeLast(3))
        println(numbers.drop(1))
        println(numbers.dropLast(3))

        println("Take While and Drop While of : $numberList")
        println(numberList.takeWhile { it < 5 })
        println(numberList.takeLastWhile { it > 5 })
        println(numberList.dropWhile { it < 3 })
        println(numberList.dropLastWhile { it > 3 })

        println("Chunk of Numbers of : $numberList")
        println(numberList.chunked(2))
        println(numberList.chunked(2){ it.sum() })
        println(numberList.chunked(4){ it.size })

        println("Windowed Numbers of : $numberList")
        println(numberList.windowed(2))
        println(numberList.windowed(2){ it.sum() })
        println(numberList.windowed(2, step = 2){ it.average() })
        println(numberList.windowed(2, step = 2))

        println("Element positions from Collection of : $numsList")
        println(numsList.first())
        println(numsList.first { it.length > 3})
        println(numsList.last())
        println(numsList.last { it.startsWith("f")})
        println(numsList.elementAt(2))
        println(numsList.random())

        println("Aggregare Operations of : $numberList")
        println("The sum of numbers : ${numberList.sum()}")
        println("The average of numbers : ${numberList.average()}")
        println("The max of numbers : ${numberList.max()}")
        println("The min of numbers : ${numberList.min()}")
        println("The count of numbers : ${numberList.count()}")
        println("The sumOf numbers : ${numberList.sumOf { it * 4 }}")

        val elements = listOf(2,3,1,7,5,6)
        println("Order of elements of : $elements")
        println(elements.sorted())
        println(elements.sortedBy { it })

        val laptops = mutableListOf(
            Laptop("Dell", 2022, 8, 2000),
            Laptop("Lenovo", 2023, 32, 4000),
            Laptop("Apple", 2024, 16, 3500)
        )
        laptops.sortedBy { it.brand }.forEach { println(it) }
        laptops.sortedWith( compareBy { it.price } ).forEach { println(it) }
        println(laptops)
        laptops.sortWith(compareBy { it.ram })
        println(laptops)
        laptops.sortedWith(compareBy<Laptop> {it.ram}.thenBy { it.brand }).forEach { println(it) }
    }
}

fun main() {
    val filter = CollectionOperationsExample()
    filter.collectionOperationsMethod()
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)