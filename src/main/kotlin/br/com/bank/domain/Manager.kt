package br.com.bank.domain

open class Manager(
    name: String,
    document: String,
    salary: Double,
    private val password: String

) : Functionary(name, document, salary), Authentication {

    override fun bonus(): Double {
        return this.salary * 0.1 + this.salary
    }

    override fun authentication(credentials: String): Boolean {
        return this.password == credentials
    }
}