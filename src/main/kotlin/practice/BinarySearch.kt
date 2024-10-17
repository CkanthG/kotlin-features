package practice

class BinarySearch {

    fun binarySearchMethod(selectedElement: Int, numbers: MutableList<Int>): Int {
        var counter = 0
        var low = 0
        var high = numbers.size - 1
        while (low <= high) {
            counter++
            println("counter : $counter")
            val mid = (low + high) / 2
            val cmp = numbers[mid].compareTo(selectedElement)
            if (cmp < 0) {
                low = mid + 1
            } else if (cmp > 0) {
                high = mid - 1
            } else {
                return numbers[mid]
            }
        }
        return -1
    }
}

fun main() {
    val binarySearch = BinarySearch()
    val mutableListOf = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    println(binarySearch.binarySearchMethod(
        27,
        mutableListOf
    )
    )
    val searchResult = mutableListOf.binarySearch(15)
    println("index: $searchResult value: ${mutableListOf[searchResult]}")
}