package com.api.conca.Util

import org.springframework.stereotype.Service
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

@Service
class Util {
    companion object{
        const val SUBJECTROLE_CASHIER = 3
        const val SUBJECTROLE_SSA = 5
        const val SUBJECTROLE_ADMIN = 4
        const val SUBJECTROLE_RECEPTION = 6
        const val EMPLOYEE_BY_LOCATION=2
    }

    fun resolveLimit(page: Int, xpage: Int): Int {
        return (page - 1) * xpage
    }
    fun hashPassword(password: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val encodedHash = digest.digest(password.toByteArray(StandardCharsets.UTF_8))
        return encodedHash.joinToString("") { "%02x".format(it) }
    }


}