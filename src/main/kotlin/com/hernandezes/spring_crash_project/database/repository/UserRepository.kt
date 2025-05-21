package com.hernandezes.spring_crash_project.database.repository

import com.hernandezes.spring_crash_project.database.model.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, ObjectId> {
    fun findByEmail(email: String): User?
}