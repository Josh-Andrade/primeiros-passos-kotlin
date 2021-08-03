class Client(
    val name: String,
    val document: String,
    private val password: String
) : Authentication {

    override fun authentication(credentials: String): Boolean {
        return this.password == credentials
    }


}