package practice

enum class DirectionsEnum(var direction: String, var distance: Int) {
    EAST("east", 10),
    WEST("west", 20),
    NORTH("north", 30),
    SOUTH("south", 40);

    fun printEnumValues() {
        println("Direction = $direction and Distance = $distance")
    }
}