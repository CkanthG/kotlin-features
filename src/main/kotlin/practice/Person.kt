package practice

class PersonAccount(var name: String, private var accountBalance: Int, private var transactions: ArrayList<String>) {

    fun checkAccountBalance(): Int {
        return accountBalance
    }

    fun receiveAmount(amount: Int): Int {
        if (amount <= 0) {
            println("Amount should be greater than 0")
            return 0
        } else {
            transactions.add("Success Transaction : Received Amount : $amount to the Person : $name")
            accountBalance += amount
            return accountBalance
        }
    }

    fun sendAmount(amount: Int) {
        if (amount == 0 || amount < 0) {
            println("You should not send: $amount")
            transactions.add("Failed Transaction : Sent Amount : $amount from the Person : $name")
        }
        else if(accountBalance < amount) {
            println("You should not have enough account balance to send: $amount")
            transactions.add("Failed Transaction : Sent Amount : $amount from the Person : $name")
        } else {
            accountBalance -= amount
            transactions.add("Success Transaction : Sent Amount : $amount from the Person : $name")
        }
    }

    fun viewTransactions() {
        for (transaction in transactions) {
            println("Transaction : $transaction")
        }
    }
}

fun main() {
    val personAccount = PersonAccount("Sreekanth", 1000, arrayListOf(""))
    println("Initial Account Balance: ${personAccount.checkAccountBalance()}")
    personAccount.sendAmount(0)
    personAccount.sendAmount(10)
    println("Account Balance: ${personAccount.checkAccountBalance()}")
    personAccount.sendAmount(899)
    println("Account Balance: ${personAccount.checkAccountBalance()}")
    personAccount.sendAmount(10)
    println("Account Balance: ${personAccount.checkAccountBalance()}")
    personAccount.sendAmount(100)
    personAccount.receiveAmount(19)
    println("Account Balance: ${personAccount.checkAccountBalance()}")
    personAccount.sendAmount(100)
    println("Last Account Balance: ${personAccount.checkAccountBalance()}")
    personAccount.viewTransactions()
}