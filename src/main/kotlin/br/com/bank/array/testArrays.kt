package br.com.bank.array

import java.math.BigDecimal
import java.math.RoundingMode


fun testArrays() {
    val ages = intArrayOf(25, 19, 33, 20, 55)

    var maxAge = 0

    for (age in ages) {
        if (age > maxAge) {
            maxAge = age
        }
    }

    var minorAge = Int.MAX_VALUE

    ages.forEach { age ->
        if (age < minorAge) {
            minorAge = age
        }
    }

    println(maxAge)
    println(minorAge)


    val salary = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val increase = 1.1

    for (i in salary.indices) {
        salary[i] = salary[i] * increase
    }

    salary.forEachIndexed { i, currentSalary ->
        salary[i] = currentSalary * increase
    }

    println(salary.contentToString())

    val range: IntRange = 1.rangeTo(10)
    for (s in range) {
        println(s)
    }

    val numbers = 2.until(100) step 2
    for (number in numbers) {
        println(number)
    }

    val inverseNumbers = 100 downTo 0 step 2

    inverseNumbers.forEach {
        println(it)
    }

    val interval = 1500.0..5000.0
    val salary1 = 1000.0

    if (salary1 in interval) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alphabet = 'a'..'z'
    val letter = 'k'
    println(letter in alphabet)

    val ages1 = intArrayOf(10, 12, 18, 33, 40, 67)

    val maxAge1 = ages1.maxOrNull()
    val minorAge1 = ages1.minOrNull()
    val averageAges = ages1.average()
    val greatherThan18 = ages1.all {
        it >= 18
    }
    val atLeastOneGreatherThan18 = ages1.any {
        it >= 18
    }

    val filter = ages1.filter { it >= 18 }

    val find = ages1.find { it == 18 }

    println(maxAge1)
    println(minorAge1)
    println(averageAges)
    println(greatherThan18)
    println(atLeastOneGreatherThan18)
    println(filter)
    println(find)

    val olderSalary = bigDecimalArrayOf("1500.55", "2000.0", "5000", "10000")

    println(olderSalary.contentToString())

    val increaseSalary = "1.1".toBigDecimal()
    val newSalary = olderSalary
        .map { salary -> calculateNewSalary(salary, increaseSalary) }
        .toTypedArray()

    println(newSalary.contentToString())
    val initialExpenses = newSalary.sum()
    println(initialExpenses)

    val months = 6.toBigDecimal()
    val totalExpenses = newSalary.fold(initialExpenses) { accumulator, salary ->
        accumulator + (salary * months).setScale(2, RoundingMode.UP)
    }

    println(totalExpenses)

    val threeLastSalaryAverage = newSalary.sorted().takeLast(3).toTypedArray().average()

    println(threeLastSalaryAverage)

    val threeFirstSalaryAverage = newSalary.sorted().take(3).toTypedArray().average()

    println(threeFirstSalaryAverage)


}


private fun calculateNewSalary(salary: BigDecimal, increase: BigDecimal) = when {
    salary < "5000.0".toBigDecimal()
    -> salary + "500.0".toBigDecimal()
    else -> salary * increase
}

fun bigDecimalArrayOf(vararg numbers: String): Array<BigDecimal> {
    return Array(numbers.size) { i ->
        numbers[i].toBigDecimal()
    }
}
