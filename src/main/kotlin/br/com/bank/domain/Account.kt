package br.com.bank.domain

import br.com.bank.exceptions.AccountBalanceInsufficientException
import br.com.bank.exceptions.TransferValueNegativeException

abstract class Account(
    private val accountNumber: String,
    private val specialCheckLimit: Double,
    private val client: Client
) {
    protected var balance = 0.0

    companion object {
        var total = 0
            private set
    }
    init {
        total++
    }

    fun deposit(depositValue: Double) {
        when {
            depositValue < 0.0 -> println("You can't deposit negative value")
            else -> this.balance += depositValue
        }
    }

    abstract fun withdraw(withdrawValue: Double)

    fun withdrawWithSpecialCheckLimit(withdrawValue: Double) {
        var newBalance = this.balance
        newBalance -= withdrawValue
        when {
            verifyAccountBalanceWithSpecialCheckLimit(newBalance) -> println("You don't have balance or special check to withdraw this value")
            else -> this.balance = newBalance
        }
    }

    fun verifyAccountBalanceStatus() {
        when {
            this.balance > 0.0 -> println("Positive balance")
            this.balance == 0.0 -> println("Neutral balance")
            else -> println("Special Check Limit used")
        }
    }

    fun depositOrWithdrawOnConditions() {
        when {
            this.balance <= 100 -> this.deposit(1.0)
            this.balance > 100 && this.balance < 2000 -> this.deposit(2300.0)
            else -> this.withdraw(2200.0)
        }
        println("Account balance after conditions: ${this.balance}")
    }

    fun withdrawOnWhile() {
        while (this.balance > 2000) {
            this.withdraw(100.0)
            println("Balance after withdraw ${this.balance}")
            Thread.sleep(1000)
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

    fun accountBalance() {
        println("${this.client.name} Account balance: ${this.balance}")
    }

    fun accountBalanceBeforeDeposit() {
        println("balance after deposit: ${this.balance}")
    }

    fun accountBalanceAfterWithdraw() {
        println("Balance after withdraw ${this.balance}")
    }

    private fun verifyAccountBalanceWithSpecialCheckLimit(newBalance: Double): Boolean {
        return newBalance < -this.specialCheckLimit
    }

    fun showAccountData() {
        println("Client: ${this.client.name}")
        println("Client address: ${this.client.address.street}")
        println("account Number: ${this.accountNumber}")
        println("Balance: ${this.balance}")
    }

    fun transferTo(account: Account, transferValue: Double) {
        when {
            this.balance + specialCheckLimit < transferValue -> throw AccountBalanceInsufficientException("You dont't have balance in your account to transfer")
            transferValue < 0 -> throw TransferValueNegativeException("Transfer Value must be greather than 0")
            else -> account.deposit(withdrawFromBalanceToTransfer(transferValue))
        }
    }

    private fun withdrawFromBalanceToTransfer(transferValue: Double): Double {
        withdraw(transferValue)
        return transferValue
    }
}
