package br.com.bank.list

fun List<Book?>.printWithMark(){
    val formattedText = this.filterNotNull().joinToString(separator = "\n") {
        " - ${it.title} de ${it.author}, editora ${it.publishingCompany}"
    }
    println("----------- Lista de Livros ----------")
    println(formattedText)
}