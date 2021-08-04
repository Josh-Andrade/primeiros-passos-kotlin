package br.com.bank.tests

import br.com.bank.domain.Client
import br.com.bank.domain.InternalSystem

fun testClient() {
    val josh = Client(
        name = "Josh",
        document = "111.111.111.11",
        password = "1234"
    )

    val internalSystem = InternalSystem()
    internalSystem.authentication(josh, "1234")
}