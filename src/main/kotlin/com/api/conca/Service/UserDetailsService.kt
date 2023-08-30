package com.api.conca.Service

import com.api.conca.Entity.User
import com.api.conca.ExceptionHandler.ErrorCodedException
import com.api.conca.IRepository.IUserRepository
import com.api.conca.Util.Util
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class UserService(val userRepositoryI: IUserRepository, val util: Util) {

    fun loadUserByUsernameAndPassword(username: String, password: String): User{
         if (username.isNullOrBlank())throw ErrorCodedException("USER_001","User not found or null",HttpStatus.NOT_FOUND.value())
         return userRepositoryI.loadUserByUsernameAndPassword(username,util.hashPassword(password))?:throw ErrorCodedException("USER_NOT_FOUND","username or password not valid",HttpStatus.NOT_FOUND.value())
    }
}