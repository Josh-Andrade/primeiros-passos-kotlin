package br.com.bank.list

data class Shelf(
    val gender: String,
    val books: List<Book>
){
    fun organizeByAuthor() : List<Book> {
        return books.sortedBy { it.author }
    }

    fun organizeByReleaseYear() : List<Book> {
        return books.sortedBy { it.releaseYear }
    }


}
