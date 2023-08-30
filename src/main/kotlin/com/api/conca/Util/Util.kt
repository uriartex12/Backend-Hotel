package com.api.conca.Util

import org.springframework.stereotype.Service
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

@Service
class Util {
    fun resolveLimit(page: Int, xpage: Int): Int {
        return (page - 1) * xpage
    }
    fun hashPassword(password: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val encodedHash = digest.digest(password.toByteArray(StandardCharsets.UTF_8))
        return encodedHash.joinToString("") { "%02x".format(it) }
    }
}