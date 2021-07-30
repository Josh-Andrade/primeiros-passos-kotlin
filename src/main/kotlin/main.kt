fun main() {
    println("First steps with kotlin")
    val account = Account("1057-1", 100.0, 200.0,
        Titular("Joshua Andrade"))

    account.showAccountData()
    account.deposit(2000.0)
    account.accountBalanceAfterWithdraw()
    account.withdraw(100.0)
    account.accountBalanceBeforeDeposit()
    account.withdrawOnWhile()
    account.depositOrWithdrawOnConditions()
    account.verifyAccountBalanceStatus()
    account.depositOnFor()
    account.withdrawOnFor()
    account.accountBalance()

}