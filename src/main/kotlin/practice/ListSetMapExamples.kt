package practice

class ListSetMapExamples {

    fun listMethods() {
        // immutable list
        val numbers = listOf(1,2,3,4,5,6)
        println(numbers.map { it * 10 })
        // mutable list
        val nums = mutableListOf(1,2,3,4)
        println(nums.map { it * 20 })
        nums.add(4, 5)
        nums.add(5, 6)
        nums.removeAt(0)
        nums.remove(3)
        println(nums.map { it * 20 })
    }

    fun setMethods() {
        // immutable set
        val numbers = setOf(1,2,3,4,5,6)
        println(numbers.map { it * 15 })
        // mutable set
        val nums = mutableSetOf(1,2,3,4)
        println(nums.map { it * 15 })
        nums.add(5)
        nums.add(6)
        nums.remove(3)
        println(nums.map { it * 15 })
    }

    fun mapMethods() {
        // immutable map
        val mapData = mapOf(1 to "abc", 2 to "def", 3 to "ghi")
        println(mapData.keys.map { it * 30 })
        println(mapData.values.map { it.replaceFirstChar { it.uppercase() } })
        // mutable map
        val mutableMap = mutableMapOf("jkl" to 1, "mno" to 2, "pqr" to 3)
        println(mutableMap.values.map { it * 30 })
        println(mutableMap.keys.map { it.replaceFirstChar { it.uppercase() } })
        mutableMap.put("stu", 4)
        mutableMap.put("vwx", 5)
        println(mutableMap.values.map { it * 30 })
        println(mutableMap.keys.map { it.replaceFirstChar { it.uppercase() } })
    }
}

fun main() {
    val listSetMapExamples = ListSetMapExamples()
    listSetMapExamples.listMethods()
    listSetMapExamples.setMethods()
    listSetMapExamples.mapMethods()
}