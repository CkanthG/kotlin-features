package practice

class ObjectExpressionExample(var name: String, var email: String, canWork: CanWork) {
}

interface CanWork {
    fun doWork()
}