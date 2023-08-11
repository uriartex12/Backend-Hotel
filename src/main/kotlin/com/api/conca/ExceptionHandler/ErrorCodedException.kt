package com.api.conca.ExceptionHandler

data class ErrorCodedException(val errorCode: String, val errorMessage: String, val httpStatusCode: Int) : RuntimeException(errorMessage)
