package br.com.bank.list

fun main(){
    val book1 = Book(
        title = "Grande sertão: Veredas",
        author = "João Guimarães Rosa",
        releaseYear = 1956
    )
    val book2 = Book(
        title = "Minha vida de menina",
        author = "Helena Morley",
        releaseYear = 1942,
        publishingCompany = "Editora A"
    )
    val book3 = Book(
        title = "Memórias Póstumas de Brás Cubas",
        author = "Machado de Assis",
        releaseYear = 1881
    )
    val book4 = Book(
        title = "Iracema",
        author = "José de Alencar",
        releaseYear = 1865,
        publishingCompany = "Editora B"
    )

    val books : MutableList<Book> = mutableListOf(book1, book2, book3, book4)

    val book5 = Book(
        title = "Sagarana",
        author = "João Guimarães Rosa",
        releaseYear = 1946
    )

    books.add(book5)
    books.printWithMark()

    books.remove(book1)

    books.printWithMark()

    val sortedByReleaseYear = books.sorted()

    sortedByReleaseYear.printWithMark()

    val sortedByTitle = books.sortedBy { it.author }

    sortedByTitle.printWithMark()

    books.add(book1)

    val mapByTitle = books.filter { it.author.startsWith("J") }
        .sortedBy { it.releaseYear }
        .map { it.title }

    println(mapByTitle)

}

