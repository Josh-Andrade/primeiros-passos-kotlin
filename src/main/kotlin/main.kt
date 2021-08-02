import kotlin.random.Random

fun main() {
    println("First steps with kotlin, Bank account simulator")
    val account = Account(
        Random.nextInt(0, Int.MAX_VALUE).toString(),
        specialCheckLimit = 100.0,
        titular = Titular("Joshua Andrade")
    )

    val account2 = Account(
        Random.nextInt().toString(),
        specialCheckLimit =0.0,
        titular = Titular("Esther Leão")
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