package br.com.bank.list

fun main(){
    val shelf = Shelf(gender = "Literatura", books = bookList)

    val organizeByAuthor = shelf.organizeByAuthor()
    val organizeByReleaseYear = shelf.organizeByReleaseYear()

    organizeByAuthor.printWithMark()
    organizeByReleaseYear.printWithMark()
}