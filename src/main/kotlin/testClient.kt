
fun testClient() {
    val josh = Client(
        name = "Josh",
        document = "111.111.111.11",
        password = "1234"
    )

    val internalSystem = InternalSystem()
    internalSystem.authentication(josh, "1234")
}