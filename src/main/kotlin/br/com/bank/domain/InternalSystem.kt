package br.com.bank.domain

class InternalSystem {

    fun authentication(admin: Authentication, credentials: String){
        if(admin.authentication(credentials)){
            println("${admin.javaClass.simpleName} success")
        }else{
            println("${admin.javaClass.simpleName} failed")
        }
    }

}