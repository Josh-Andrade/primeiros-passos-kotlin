fun testFunctionary() {
    val manager = Manager(
        name = "Manager",
        document = "111.111.111-11",
        salary = 3000.0,
        password = "1234"
    )

    val developer = Developer(
        name = "Developer",
        document = "222.222.222-22",
        salary = 1500.0
    )

    val ceo = CEO(
        name = "CEO",
        document = "333.333.333-33",
        salary = 15000.0,
        plr = 1.45,
        password = "12345"
    )

    val analyst = Analyst(
        name = "Analyst",
        document = "444.444.444-44",
        salary = 2000.0
    )

    println("Developer name: ${developer.name}")
    println("Developer document: ${developer.document}")
    println("Developer salary: ${developer.salary}")
    println("Developer bonus: ${developer.bonus()}")

    println("----------------------------------------------------------------------------")

    println("Manager name: ${manager.name}")
    println("Manager document: ${manager.document}")
    println("Manager salary: ${manager.salary}")
    println("Manager bonus: ${manager.bonus()}")

    println("----------------------------------------------------------------------------")

    println("CEO name: ${ceo.name}")
    println("CEO document: ${ceo.document}")
    println("CEO salary: ${ceo.salary}")
    println("CEO bonus: ${ceo.bonus()}")
    println("CEO PRL: ${ceo.bonusPlr()}")

    println("----------------------------------------------------------------------------")

    println("Analyst name: ${analyst.name}")
    println("Analyst document: ${analyst.document}")
    println("Analyst salary: ${analyst.salary}")
    println("Analyst bonus: ${analyst.bonus()}")

    println("----------------------------------------------------------------------------")

    val internalSystem = InternalSystem()
    internalSystem.authentication(ceo, "12345")
    internalSystem.authentication(manager, "1234")

    println("----------------------------------------------------------------------------")
    val calculator = BonusCalculator()

    calculator.register(ceo)
    calculator.register(manager)
    calculator.register(analyst)
    calculator.register(developer)

    println("Total bonus: ${calculator.total}")
}