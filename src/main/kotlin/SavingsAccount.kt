class SavingsAccount(accountNumber: String,
                     specialCheckLimit: Double = 0.0,
                     owner: Owner
) :
    Account(accountNumber,
        specialCheckLimit,
        owner) {
    override fun withdraw(withdrawValue: Double) {
        when {
            this.balance >= withdrawValue -> this.balance -= withdrawValue
            else -> super.withdrawWithSpecialCheckLimit(withdrawValue)
        }
    }

}