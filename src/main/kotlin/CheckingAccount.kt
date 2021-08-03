class CheckingAccount(
    accountNumber: String,
    specialCheckLimit: Double,
    owner: Owner
) :
    Account(
        accountNumber,
        specialCheckLimit,
        owner
    ) {

    override fun withdraw(withdrawValue: Double) {
        when {
            this.balance >= withdrawValue + 0.1 -> this.balance -= withdrawValue + 0.1
            else -> super.withdrawWithSpecialCheckLimit(withdrawValue)
        }
    }

}