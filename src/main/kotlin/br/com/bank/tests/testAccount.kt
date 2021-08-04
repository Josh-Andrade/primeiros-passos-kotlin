package br.com.bank.tests

import br.com.bank.domain.Address
import br.com.bank.domain.CheckingAccount
import br.com.bank.domain.Client
import br.com.bank.domain.SavingsAccount
import br.com.bank.exceptions.AccountBalanceInsufficientException
import br.com.bank.exceptions.TransferValueNegativeException
import kotlin.random.Random

fun testAccount() {
    val account = CheckingAccount(
        Random.nextInt(0, Int.MAX_VALUE).toString(),
        specialCheckLimit = 100.0,
        client = Client(
            "Joshua Andrade",
            "111.111.111.11", "123",
            address = Address(
                street = "Rua dos alfeneiros"
        ))
    )

    val account2 = SavingsAccount(
        Random.nextInt().toString(),
        specialCheckLimit = 0.0,
        client = Client("Esther Leão","222.222.222.22", "123")
    )

    account.showAccountData()
    account.deposit(depositValue = 5000.0)
    account.accountBalanceAfterWithdraw()
    account.withdraw(withdrawValue = 100.0)
    account.accountBalanceBeforeDeposit()
    account.withdrawOnWhile()
    account.depositOrWithdrawOnConditions()
    account.verifyAccountBalanceStatus()
    account.depositOnFor()
    account.withdrawOnFor()
    account.accountBalance()
    try {
        account.transferTo(account2, transferValue = 2650.0)
    } catch (e: TransferValueNegativeException) {
        println(e.message)
    } catch (e: AccountBalanceInsufficientException) {
        println(e.message)
    }



    account2.showAccountData()
    account.showAccountData()
}