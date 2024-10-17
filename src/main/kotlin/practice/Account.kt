package practice

class Account(var accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("Amount : $amount deposited to account : $accountName, Now Account Balance is : $balance")
        } else {
            println("Amount : $amount cannot be deposited")
        }
    }

    fun withdraw(withdraw: Int) {
        if (-withdraw < 0 && balance - withdraw >= 0) {
            transactions.add(-withdraw)
            balance -= withdraw
            println("Amount : $withdraw withdraw from account : $accountName, Now Account Balance is : $balance")
        } else {
            println("Amount : $withdraw cannot be withdraw")
        }
    }

    fun transactions() {
        println("Total Transactions : ")
        for (transaction in transactions) {
            println("Transaction : $transaction")
        }
    }

    fun calculateBalance(): Int {
        return balance
    }
}

fun main() {
    val sreeAccount = Account("Sreekanth")
    sreeAccount.deposit(0)
    sreeAccount.deposit(10000)
    sreeAccount.deposit(-10000)
    sreeAccount.withdraw(0)
    sreeAccount.withdraw(2000)
    sreeAccount.transactions()
    println("Your Final Account Balance : ${sreeAccount.calculateBalance()}")
}