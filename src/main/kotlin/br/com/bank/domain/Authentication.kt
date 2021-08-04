package br.com.bank.domain

interface Authentication {

    fun authentication(credentials: String) : Boolean

}