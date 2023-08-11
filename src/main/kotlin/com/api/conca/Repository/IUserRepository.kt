package com.api.conca.Repository

import com.api.conca.Entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IUserRepository : JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password = ?2")
    fun loadUserByUsernameAndPassword(username: String, password: String): User?
}