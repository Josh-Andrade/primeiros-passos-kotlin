class InternalSystem {

    fun authentication(admin: Authentication, credentials: String){
        if(admin.authentication(credentials)){
            println("${admin.javaClass.simpleName} Authentication success")
        }else{
            println("${admin.javaClass.simpleName} Authentication failed")
        }
    }

}