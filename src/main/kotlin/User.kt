package org.example

import java.util.UUID

class User(val firstName: String, val lastName: String, val email: String) {
    val userId: String = UUID.randomUUID().toString()

    fun getUserId(): String {
        return userId
    }
}