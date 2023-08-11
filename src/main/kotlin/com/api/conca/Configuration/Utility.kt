package com.api.conca.Configuration

import javax.servlet.http.HttpServletRequest

class Utility {
    fun getSiteURL(request: HttpServletRequest): String? {
        val siteURL = request.requestURL.toString()
        return siteURL.replace(request.servletPath, "")
    }
}