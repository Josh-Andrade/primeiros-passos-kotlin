package br.com.bank.collections

class Names {

    val names: Collection<String> get() = data.toList()

    fun save(nome : String){
        data.add(nome)
    }

    companion object {
        private val data = mutableListOf<String>()
    }


}