package com.api.conca.Controller

import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Entity.Identitydocument
import com.api.conca.Entity.Subject
import com.api.conca.Entity.Subjecttype
import com.api.conca.Service.BusinesssubjectService
import org.slf4j.LoggerFactory
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

data class BusinesssubjectSaveResponse(val code: Int, val message: String, val businesssubjectId:Int)
data class SubjectRequest(val page: Int?=1, val xpage: Int?=10, val name: String?="", val categoryId: Int?=0,var limit:Int?=0,var count:Boolean?=false)
data class SubjecResponse(val page: Int?, val xpage:Int, val total: Int, val list: List<Subject>)

data class SubjectDao(val id:Int,
                      val identitydocument: Identitydocument,
                      val identitynumber:String,
                      val firstname:String,
                      val secondname:String,
                      val birthday: Date,
                      val address: String,
                      val phone: String?,
                      val subjecttype: Subjecttype,
                      val districtid:Int?=null,
                      val maritalstatus: String,
                      val businesssubjectid:Int)


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

    @GetMapping
    fun listSubject(@ModelAttribute params:SubjectRequest):SubjecResponse{
        logger.info("SubjectRequest data $params")
        return businesssubjectService.listSubject(params)
    }

}