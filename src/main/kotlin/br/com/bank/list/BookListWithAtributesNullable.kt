package br.com.bank.list

fun main(){
    bookList.groupBy { it.publishingCompany ?: "Publishing company unknown" }
        .forEach{ (publishingCompany, books)->
            println("$publishingCompany: ${books.joinToString{ it.title}}")
        }


}