package com.api.conca.Controller

import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Service.BusinesssubjectService
import org.slf4j.LoggerFactory
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class BusinesssubjectSaveResponse(val code: Int, val message: String, val businesssubjectId:Int)

@RestController
@RequestMapping("/api/subject")
class SubjectController(val businesssubjectService: BusinesssubjectService){
    companion object{
        private val logger = LoggerFactory.getLogger(SubjectController::class.java)
    }
    @PostMapping("/saveBusinesssubject")
    fun saveBusinesssubject(@Validated @RequestBody subject: BusinesssubjectDTO):BusinesssubjectSaveResponse{
        logger.info("saveBusinesssubject $subject")
        return businesssubjectService.saveBusinesssubject(subject)
    }

}