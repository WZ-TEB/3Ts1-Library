package org.example

class LibraryImpl : Library {

    val books: MutableMap<String, Book> = mutableMapOf()
    val users: MutableMap<String, User> = mutableMapOf()
    val rentals: MutableMap<String, String> = mutableMapOf()

    override fun addBook(title: String, author: String): String {
        val book = Book(title, author)
        books[book.getBookId()] = book //konieczność użycia gettera, ponieważ zprywatyzowałem bookId
        return book.getBookId() //znów konieczność
    }

    override fun removeBook(bookId: String) {
        books.remove(bookId)
    }

    override fun addUser(firstName: String, lastName: String, email: String): String {
        val user = User(firstName, lastName, email)
        users[user.userId] = user //brak konieczności użycia gettera, bo userId jest publiczne
        return user.userId //znów brak konieczności
    }

    override fun deleteUser(userId: String) {
        users.remove(userId)
    }

    override fun rentBookToUser(bookId: String, userId: String) {
        rentals[bookId] = userId
    }

    override fun returnBookFromUser(bookId: String) {
        rentals.remove(bookId)
    }
}