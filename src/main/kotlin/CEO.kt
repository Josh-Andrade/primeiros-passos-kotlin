class CEO(
    name: String,
    document: String,
    salary: Double,
    val plr: Double,
    private val password: String

) : Functionary(name, document, salary),
    Authentication {

    override fun bonus(): Double {
        return this.salary * 0.1 + this.salary + this.salary + bonusPlr()
    }

    override fun authentication(credentials: String): Boolean {
        return this.password == credentials
    }

    fun bonusPlr(): Double {
        return this.salary * this.plr
    }
}