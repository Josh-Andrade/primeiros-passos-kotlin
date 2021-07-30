class Account(private val accountNumber: String, private var balance: Double, private val specialCheck: Double, nomeTitular: String) {

    private val titular = Titular(nomeTitular)

    fun deposit(depositValue: Double) {
        when {
            depositValue < 0.0 -> println("You can't deposit negative value")
            else -> this.balance += depositValue
        }
    }

    fun withdraw(withdrawValue: Double) {
        when {
            this.balance >= withdrawValue -> this.balance -= withdrawValue
            else -> withdrawWithSpecialCheck(withdrawValue)
        }
    }

    private fun withdrawWithSpecialCheck(withdrawValue: Double) {
        var newBalance = this.balance
        newBalance -= withdrawValue
        if (verifyAccountBalanceWithSpecialCheck(newBalance)) {
            println("You don't have balance or special check to withdraw this value")
            return
        }
        this.balance = newBalance
    }


    fun verifyAccountBalanceStatus() {
        when {
            this.balance > 0.0 -> println("Positive balance")
            this.balance == 0.0 -> println("Neutral balance")
            else -> println("Special Check used")
        }
    }

    fun depositOrWithdrawOnConditions() {
        if (this.balance <= 100) {
            this.deposit(1.0)
        } else if (this.balance > 100 && this.balance < 2000) {
            this.deposit(2300.0)
        } else {
            this.withdraw(2200.0)
        }

        println("Account balance after conditions: ${this.balance}")
    }

    fun withdrawOnWhile() {
        while (this.balance > 2000) {
            this.withdraw(100.0)
            println("Balance after withdraw ${this.balance}")
            Thread.sleep(5000)
        }
    }

    fun depositOnFor() {
        for (iterator in 6 downTo 0 step 3) {
            this.deposit(1000.0)
        }
        println("Account balance After for: ${this.balance}")
    }

    fun withdrawOnFor() {
        for (iterator in 0..6) {
            this.withdraw(50.0)
        }
        println("Account balance After for: ${this.balance}")
    }

    fun accountBalance(){
        println("Account balance: ${this.balance}")
    }

    fun accountBalanceBeforeDeposit(){
        println("balance after deposit: ${this.balance}")
    }

    fun accountBalanceAfterWithdraw(){
        println("Balance after withdraw ${this.balance}")
    }

    private fun verifyAccountBalanceWithSpecialCheck(newBalance: Double) : Boolean{
        return newBalance < 0.0 - this.specialCheck
    }

    fun showAccountData(){
        println("Titular: ${this.titular.getName()}")
        println("account Number: ${this.accountNumber}")
        println("Balance: ${this.balance}")
    }
}
