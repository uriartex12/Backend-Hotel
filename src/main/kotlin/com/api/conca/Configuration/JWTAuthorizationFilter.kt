package com.api.conca.Configuration

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import java.io.IOException
import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class JWTAuthorizationFilter: OncePerRequestFilter() {

    override fun doFilterInternal(request: HttpServletRequest, response: HttpServletResponse, filterChain: FilterChain) {
        val bearerToken = request.getHeader("Authorization")
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            val token = bearerToken.replace("Bearer ", "")
            val usernamePAT: UsernamePasswordAuthenticationToken = TokenUtils.getAuthentication(token)!!
            SecurityContextHolder.getContext().authentication = usernamePAT
        }
        filterChain.doFilter(request,response)
    }

}