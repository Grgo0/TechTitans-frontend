package com.example.ttpay.model

import java.util.Date

data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val dateOfBirth: Date,
    val address: String,
    val phone: String,
    val email: String,
    val username: String,
    val password: String,
    val role: UserRole,
    val userStatus: UserStatus,
    val dateCreated: Date,
    val dateModified: Date
)