package classes

import compareWithExtension

class Introduction {
    private lateinit var msg: String
    fun printMessage(): String {
        msg = "This is Introduction Message"
        return msg
    }
}

fun  main() {
    val printMessage = Introduction().printMessage()
    println(printMessage)
    val inputMessage = "message to change as upper case letters"
    val compareWithExtension = Introduction().compareWithExtension(inputMessage)
    println("Uppercase Strings With Extension Function  \ninput is: $inputMessage \noutput: $compareWithExtension")
}