package com.api.conca.Controller

import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Entity.Businesssubject
import com.api.conca.Service.BusinesssubjectService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/subject")
class SubjectController(val businesssubjectService: BusinesssubjectService){

    @PostMapping("/saveBusinesssubject")
    fun saveBusinesssubject(@RequestBody subject: BusinesssubjectDTO):Int{
        return businesssubjectService.saveBusinesssubject(subject)
    }

}