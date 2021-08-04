package br.com.bank.domain

class Address(
    var street: String = "",
    var houseNumber: String = "",
    var state: String = "",
    var city: String = ""
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (street != other.street) return false
        if (houseNumber != other.houseNumber) return false
        if (state != other.state) return false
        if (city != other.city) return false

        return true
    }

    override fun hashCode(): Int {
        var result = street.hashCode()
        result = 31 * result + houseNumber.hashCode()
        result = 31 * result + state.hashCode()
        result = 31 * result + city.hashCode()
        return result
    }
}