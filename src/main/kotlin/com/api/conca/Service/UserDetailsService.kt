package com.api.conca.Service

import com.api.conca.Entity.User
import com.api.conca.ExceptionHandler.ErrorCodedException
import com.api.conca.Repository.IUserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

@Service
class UserService(val userRepositoryI: IUserRepository) {

    fun loadUserByUsernameAndPassword(username: String, password: String): User{
         if (username.isNullOrBlank())throw ErrorCodedException("USER_001","User not found or null",HttpStatus.NOT_FOUND.value())
        return userRepositoryI.loadUserByUsernameAndPassword(username,hashPassword(password))?:throw ErrorCodedException("USER_NOT_FOUND","username or password not valid",HttpStatus.NOT_FOUND.value())
    }

    fun hashPassword(password: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val encodedHash = digest.digest(password.toByteArray(StandardCharsets.UTF_8))
        return encodedHash.joinToString("") { "%02x".format(it) }
    }
}