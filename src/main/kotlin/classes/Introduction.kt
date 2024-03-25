package classes

class Introduction {
    private lateinit var msg: String
    fun printMessage(): String {
        msg = "This is Introduction Message"
        return msg
    }
}