package practice

sealed class SealedClassesExample(val message: String) {
    class Success(message: String): SealedClassesExample(message)
    class Error(message: String): SealedClassesExample(message)
    fun showMessage() {
        println("Message : $message")
    }
}

fun loadSealedClasses(result: SealedClassesExample) {
    when(result) {
        is SealedClassesExample.Success -> result.showMessage()
        is SealedClassesExample.Error -> result.showMessage()
    }
}