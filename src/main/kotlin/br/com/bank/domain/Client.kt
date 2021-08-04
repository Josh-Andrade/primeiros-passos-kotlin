package br.com.bank.domain

class Client(
    val name: String,
    val document: String,
    private val password: String,
    var address: Address = Address()
) : Authentication {

    override fun authentication(credentials: String): Boolean {
        return this.password == credentials
    }

}