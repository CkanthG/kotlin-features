package loops

object ForLoopExample {
    fun forLoop() {
        for (i in 1..5) {
            if (i % 2 == 0)
                println("Even $i")
            else
                println("Odd $i")
        }
    }
}