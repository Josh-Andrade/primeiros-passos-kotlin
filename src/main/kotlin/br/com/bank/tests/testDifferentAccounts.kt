package br.com.bank.tests

import br.com.bank.domain.CheckingAccount
import br.com.bank.domain.Client
import br.com.bank.domain.SavingsAccount
import br.com.bank.exceptions.AccountBalanceInsufficientException
import br.com.bank.exceptions.TransferValueNegativeException
import kotlin.random.Random

fun testDifferentAccounts() {
    val checkingAccount = CheckingAccount(
        Random.nextInt(0, Int.MAX_VALUE).toString(),
        specialCheckLimit = 100.0,
        client = Client("Joshua Andrade checking account","111.111.111.11", "123")
    )

    val savingsAccount = SavingsAccount(
        Random.nextInt(0, Int.MAX_VALUE).toString(),
        client = Client("Joshua Andrade savings account","111.111.111.11", "123")
    )

    checkingAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    checkingAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    checkingAccount.accountBalance()
    savingsAccount.accountBalance()

    try {
        checkingAccount.transferTo(savingsAccount, 898.0)
    } catch (e: TransferValueNegativeException) {
        println(e.message)
    } catch (e: AccountBalanceInsufficientException) {
        println(e.message)
    }


    checkingAccount.accountBalance()
    savingsAccount.accountBalance()
}