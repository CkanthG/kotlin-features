package practice

class SingletonInstance private constructor() {
    companion object {
        private var instance: SingletonInstance? = null

        fun getInstance(): SingletonInstance? {
            if (instance == null) {
                println("Instance is created")
                instance = SingletonInstance()
            }
            return instance
        }
    }
}