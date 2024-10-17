package coroutines

import kotlinx.coroutines.*;

class CoroutinesExample {
    fun main() {
        println("Main thread: ${Thread.currentThread().name}")

        // Launching a coroutine in the background
        GlobalScope.launch {
            println("Coroutine started in thread: ${Thread.currentThread().name}")

            // Simulating a long-running task
            delay(1000)

            println("Coroutine finished")
        }

        println("Main thread continues while coroutine is executing")

        // Block the main thread to keep the program running
        runBlocking {
            delay(2000)
            println("Main thread exiting")
        }
    }
}

fun main() {
    CoroutinesExample().main()
}
