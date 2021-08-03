import kotlin.random.Random

fun testDifferentAccounts() {
    val checkingAccount = CheckingAccount(
        Random.nextInt(0, Int.MAX_VALUE).toString(),
        specialCheckLimit = 100.0,
        owner = Owner("Joshua Andrade checking account")
    )

    val savingsAccount = SavingsAccount(
        Random.nextInt(0, Int.MAX_VALUE).toString(),
        owner = Owner("Joshua Andrade savings account")
    )

    checkingAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    checkingAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    checkingAccount.accountBalance()
    savingsAccount.accountBalance()

    checkingAccount.transferTo(savingsAccount, 898.0)

    checkingAccount.accountBalance()
    savingsAccount.accountBalance()
}