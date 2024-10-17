package practice

class Loops {

    fun differentForLoops() {
        println("i in range 1 to 10 :")
        for (i in 1..10) {
            print("$i ")
        }
        println("\ni in 1 until 10 :")
        for (i in 1 until 10) {
            print("$i ")
        }
        println("\ni in 10 downTo 1 :")
        for (i in 10 downTo 1) {
            print("$i ")
        }
        println("\ni in 1 until 10 with step 2:")
        for (i in 1..10 step 2) {
            print("$i ")
        }
    }

    fun whileAndDoWhileLoop() {
        println("\nWhile loop : ")
        var number = 1
        while (number < 5) print("${number++} ")
        number = 0
        println()
        do {
            print("do while loop : ${++number} ")
        }
        while (number < 1)
    }

    fun breakAndContinue() {
        println("\nContinue Example")
        for (i in 1..10) {
            if (i in 3..7) {
                continue
            }
            print("$i ")
        }
        println("\nBreak Example")
        var i = 0
        while (i < 10) {
            i++
            if (i >= 6) {
                break
            }
            print("$i ")
        }
    }

    fun outerLoopBreakOrContinue() {
        println()
        var number = 0
        outer@ while (number < 5) {
            number++
            println("Outer Number: $number")
            if (number == 2) {
                continue@outer
            }
            var i = 0
            outer1@ while (i < 5) {
                i++
                if (i == 4) continue@outer
                println("Inner1 Number: $i")

                var k = 0
                while (k < 5) {
                    k++
                    if (k == 3) break@outer1
                    println("Inner2 Number: $k")
                }
            }
        }
    }
}

fun main() {
    val loop = Loops()
    loop.differentForLoops()
    loop.whileAndDoWhileLoop()
    loop.breakAndContinue()
    loop.outerLoopBreakOrContinue()
}