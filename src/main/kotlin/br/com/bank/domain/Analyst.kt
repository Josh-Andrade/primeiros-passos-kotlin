package br.com.bank.domain

class Analyst(
    name: String,
    document: String,
    salary: Double

) : Functionary(name, document, salary) {

    override fun bonus(): Double {
        return this.salary * 0.1 + this.salary + salary * 0.1
    }
}