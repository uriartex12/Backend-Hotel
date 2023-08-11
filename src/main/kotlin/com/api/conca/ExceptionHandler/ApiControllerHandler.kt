package com.api.conca.ExceptionHandler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ApiControllerHandler {

    @ExceptionHandler(value = [ErrorCodedException::class])
    fun handleErrorCodedException(ex: ErrorCodedException, request: WebRequest): ResponseEntity<ErrorMessage> {
        return ResponseEntity.status(ex.httpStatusCode).body(ErrorMessage(ex.httpStatusCode, ex.errorCode, ex.errorMessage))
    }

    @ExceptionHandler(value = [Exception::class])
    fun handleErrorCodedException(ex: Exception, request: WebRequest): ResponseEntity<ErrorMessage> {
        return ResponseEntity.status(500).body(ErrorMessage(HttpStatus.NOT_FOUND.value(), "BGGKOIIB52", ex.message ?: "Internal server error"))
    }
}