package maps

object MapExample {
    fun mapIterate() {
        val familyMembers = mapOf(
            "Sreekanth"  to 33,
            "Sowmya"  to 27,
            "Devansh" to 1
        )
        for ((name, age) in familyMembers) {
            println("Name : $name and Age : $age")
        }
    }
}