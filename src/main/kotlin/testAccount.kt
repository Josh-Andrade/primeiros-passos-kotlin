import kotlin.random.Random

fun testAccount() {
    val account = CheckingAccount(
        Random.nextInt(0, Int.MAX_VALUE).toString(),
        specialCheckLimit = 100.0,
        owner = Owner("Joshua Andrade")
    )

    val account2 = SavingsAccount(
        Random.nextInt().toString(),
        specialCheckLimit = 0.0,
        owner = Owner("Esther Leão")
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
    account.transferTo(account2, transferValue = 2650.0)

    account2.showAccountData()
    account.showAccountData()
}