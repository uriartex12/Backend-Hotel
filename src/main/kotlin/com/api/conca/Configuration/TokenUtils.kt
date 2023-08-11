package com.api.conca.Configuration

import io.jsonwebtoken.JwtException
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.stereotype.Component
import java.util.*


@Component
class TokenUtils {
    companion object{
        private val ACCESS_TOKEN_SECRET = "4qhq8LrBfycaRHXhd4sjkfsjdkko77890sd9s9s9sdnsj92237kitreuiotrewk4qhq8LrBfycaRHXhd4sjkfsjdkko77890sd9s9s9sdnsj92237kitreuiotrewk"
        private val ACCESS_TOKEN_VALIDITY_SECONDS = 2592000L
        val JWT_TOKEN_VALIDITY = (5 * 60 * 60).toLong()


        fun getAuthentication(token: String): UsernamePasswordAuthenticationToken? {
            return try {
                val claims = Jwts.parserBuilder()
                        .setSigningKey(ACCESS_TOKEN_SECRET.toByteArray())
                        .build()
                        .parseClaimsJws(token)
                        .body
                val username = claims.subject
                UsernamePasswordAuthenticationToken(username, null, emptyList())
            } catch (e: JwtException) {
                null
            }
        }
    }


    fun createToken(name: String?, username: String?): String {

        println("username $username - $name")

        val expirationTime = ACCESS_TOKEN_VALIDITY_SECONDS * 1000
        val expirationDate = Date(System.currentTimeMillis() + expirationTime)
        return Jwts.builder()
                .claim("name",name)
                .setSubject(username)
                .setExpiration(expirationDate)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.toByteArray()))
                .compact()
    }
}