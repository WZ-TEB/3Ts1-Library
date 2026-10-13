package org.example

import java.util.UUID

class Book(val title: String, val author: String) {
    private val bookId: String = UUID.randomUUID().toString()

    fun getBookId(): String {
        return bookId
    }
}