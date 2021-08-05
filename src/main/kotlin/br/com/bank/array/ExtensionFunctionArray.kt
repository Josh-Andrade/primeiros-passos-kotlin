package br.com.bank.array

import java.math.BigDecimal


fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { accumulator, value ->
        accumulator + value
    }
}

fun Array<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sum() / this.size.toBigDecimal()
    }
}