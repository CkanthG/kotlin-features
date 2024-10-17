package practice

class CustomGenericsExample {

    fun genericsMethod() {

        val cricketPlayer1 = CricketPlayer("Kohli")
        val cricketPlayer2 = CricketPlayer("Siraj")
        val cricketTeam = Team("CRICKET TEAM", mutableListOf(cricketPlayer1))
        cricketTeam.addPlayer(cricketPlayer2)
        cricketTeam.addPlayer(cricketPlayer1)

        val kabaddiPlayer1 = KabaddiPlayer("Sreekanth")
        val kabaddiPlayer2 = KabaddiPlayer("Sreekanth")
        val kabaddiTeam = Team("KABADDI TEAM", mutableListOf(kabaddiPlayer1))
        kabaddiTeam.addPlayer(kabaddiPlayer2)
        kabaddiTeam.addPlayer(kabaddiPlayer1)

    }
}

fun main() {
    val customGenericsExample = CustomGenericsExample()
    customGenericsExample.genericsMethod()
}

class Team<T: Player>(val name: String, val players: MutableList<T>) {
    fun addPlayer(player: T) {
        if (players.contains(player)) {
            println("Player ${player.name} already exist in a team: $name")
        } else {
            players.add(player)
            println("Player ${player.name} added to the team: $name")
        }
    }
}

open class Player(val name: String)

class CricketPlayer(name: String): Player(name)
class KabaddiPlayer(name: String): Player(name)