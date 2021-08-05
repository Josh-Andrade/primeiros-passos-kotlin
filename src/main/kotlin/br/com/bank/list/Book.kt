package br.com.bank.list

data class Book(val title : String,
                val author : String,
                val releaseYear: Long,
                val publishingCompany : String? = null) : Comparable<Book> {

    override fun compareTo(other: Book): Int {
        return releaseYear.compareTo(other.releaseYear)
    }
}
