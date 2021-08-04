package br.com.bank.domain

class BonusCalculator {

    var total: Double = 0.0
        private set

    fun register(functionary: Functionary){
        this.total += functionary.bonus()
    }
}