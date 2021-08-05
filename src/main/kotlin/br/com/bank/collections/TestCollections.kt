package br.com.bank.collections

fun testCollectionCopy() {
    val names = Names()
    val savedNames = names.names

    names.save("Josh")

    println(Names().names)
    println(savedNames)
}

fun testCollections() {
    val names: List<String> = listOf("Josh", "Esther")

    for (name in names) {
        println(name)
    }

    println(names)

    println("Josh is present ? ${names.contains("Josh")}")
}

fun testCollectionsSet() {
    val watchAndroidCourse: Set<String> = setOf("Josh", "Esther")
    val watchKotlinCourse: Set<String> = setOf("Josh", "Tangamandapio")
    val watchBothCourses = mutableSetOf<String>()

    //watchBothCourses.addAll(watchAndroidCourse)
    //watchBothCourses.addAll(watchKotlinCourse)

    watchBothCourses.addAll(watchAndroidCourse union watchKotlinCourse)

    println(watchAndroidCourse - watchKotlinCourse)
    println(watchAndroidCourse subtract watchKotlinCourse)

    println(watchAndroidCourse intersect watchKotlinCourse)

    val watchList = watchBothCourses.toMutableList()
    watchList.add("João")

    println(watchList)
    println(watchList.toSet())
}


fun testCollectionsMap() {

    val orders = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 30.0),
        3 to 50.0
    )


    println(orders)

    val order = orders[1]
    order?.let {
        println("Order: $it")
    }

    orders.forEach { o ->
        println(o.value)
    }

    orders.put(4, 990.0)
    println(orders)

    orders.put(4, 400.0)
    println(orders)

    orders.putIfAbsent(4, 90.0)
    println(orders)

    orders.remove(4)
    println(orders)
}

fun testMap() {
    val orders: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 30.0),
        3 to 50.0,
        4 to 300.0,
        5 to 100.0,
        6 to 55.0
    )

    //val order = orders.getValue(5)
    //println(order)

    println(orders.getOrElse(0) {
        "order missing"
    })

    println(orders.getOrDefault(1, -1.0))
    println(orders.getOrDefault(0, -1.0))

    println(orders.keys)

    for (number in orders.keys) {
        println("$number")
    }

    for (value in orders.values) {
        println("$value")
    }


    val filterOrders = orders.filter { (number, value) ->
        number % 2 == 0 && value > 50
    }

    println(filterOrders)

    val filterValues = orders.filterValues { value -> value > 70 }

    val filterKeys = orders.filterKeys { keys -> keys % 2 == 0 }

    println(filterValues)

    println(filterKeys)
    println(orders + mapOf(7 to 60.0, 8 to 10.0))

    println(orders)
    println(orders - listOf(1, 2, 3))

    orders.putAll(listOf(10 to 90.0, 20 to 20.0, 33 to 9.0))
    println(orders)

    orders += listOf(11 to 90.0, 21 to 20.0, 30 to 9.0)
    println(orders)
}


fun testAssociateMap() {
    val orders = listOf(
        Order(1, 20.0),
        Order(2, 60.0),
        Order(3, 30.0),
        Order(4, 70.0)
    )

    println(orders)

    val associateBy = orders.associateBy { order ->
        order.number
    }

    println(associateBy)

    val associateWith = orders.associateWith { order -> order.value > 50.0 }

    println(associateWith)
}