package com.api.conca.Service

import com.api.conca.Controller.*
import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Entity.*
import com.api.conca.ExceptionHandler.ErrorCodedException
import com.api.conca.IRepository.IBusinesssubjectRepository
import com.api.conca.IRepository.ISubjectRepository
import com.api.conca.Repository.BusinesssubjectRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.text.SimpleDateFormat
import java.util.*

@Service
class BusinesssubjectService(val businesssubjectRepository: BusinesssubjectRepository) {

    @Throws(Exception::class)
    fun saveBusinesssubject(subject:BusinesssubjectDTO): EmployedSaveResponse {
        with(subject){
            if(firstname.isNullOrEmpty() || secondname.isNullOrEmpty()) throw ErrorCodedException("ERROR_NOT_FOUND"," Firstname or Secondname is invalid",HttpStatus.NOT_FOUND.value())
            return businesssubjectRepository.saveBusinesssubject(subject)
        }
    }

    fun listSubject(params:SubjectRequest): SubjecResponse {
        with(params){
            val subject=businesssubjectRepository.listSubject(params)
            return SubjecResponse(page!!,xpage!!,subject.second,subject.first)
        }
    }
}