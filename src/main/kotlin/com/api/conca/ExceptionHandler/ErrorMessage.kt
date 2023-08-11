package com.api.conca.ExceptionHandler

import org.springframework.http.HttpStatus

data class ErrorMessage(val httpStatusCode: Int, val errorCode: String, val message: String)
