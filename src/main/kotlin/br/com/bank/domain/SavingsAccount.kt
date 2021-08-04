package br.com.bank.domain

class SavingsAccount(accountNumber: String,
                     specialCheckLimit: Double = 0.0,
                     client: Client
) :
    Account(accountNumber,
        specialCheckLimit,
        client) {
    override fun withdraw(withdrawValue: Double) {
        when {
            this.balance >= withdrawValue -> this.balance -= withdrawValue
            else -> super.withdrawWithSpecialCheckLimit(withdrawValue)
        }
    }

}