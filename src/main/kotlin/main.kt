fun main() {
    println("First steps with kotlin, Bank account simulator")
    val account = Account(
        "1057-1", 100.0, 200.0,
        Titular("Joshua Andrade")
    )

    val account2 = Account(
        "1057-2", 0.0, 200.0,
        Titular("Esther Leão")
    )

    account.showAccountData()
    account.deposit(20000.0)
    account.accountBalanceAfterWithdraw()
    account.withdraw(100.0)
    account.accountBalanceBeforeDeposit()
    account.withdrawOnWhile()
    account.depositOrWithdrawOnConditions()
    account.verifyAccountBalanceStatus()
    account.depositOnFor()
    account.withdrawOnFor()
    account.accountBalance()
    account.transferTo(account2, 2650.0)

    account2.showAccountData()
    account.showAccountData()
}