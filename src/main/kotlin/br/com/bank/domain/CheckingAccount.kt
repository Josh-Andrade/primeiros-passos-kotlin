package br.com.bank.domain

class CheckingAccount(
    accountNumber: String,
    specialCheckLimit: Double,
    client: Client
) :
    Account(
        accountNumber,
        specialCheckLimit,
        client
    ) {

    override fun withdraw(withdrawValue: Double) {
        when {
            this.balance >= withdrawValue + 0.1 -> this.balance -= withdrawValue + 0.1
            else -> super.withdrawWithSpecialCheckLimit(withdrawValue)
        }
    }

}