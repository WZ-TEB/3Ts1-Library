package org.example

interface Library {
    fun addBook(title: String, author: String): String
    fun removeBook(bookId: String)
    fun addUser(firstName: String, lastName: String, email: String): String
    fun deleteUser(userId: String)
    fun rentBookToUser(bookId: String, userId: String)
    fun returnBookFromUser(bookId: String)
}