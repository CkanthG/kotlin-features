package practice

class Conditions {

    fun whenCondition(){
        val a = 5
        when(a) {
            1,2,3,4,5,6,7,8,9 -> println("a value is: $a")
            else -> println("a value in else: $a")
        }

        when {
            a < 5 -> println("a value is: $a")
            else -> println("a value is else: $a")
        }
    }
}

fun main() {
    Conditions().whenCondition()
}