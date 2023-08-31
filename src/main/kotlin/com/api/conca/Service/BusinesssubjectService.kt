package com.api.conca.Service

import com.api.conca.Controller.BusinesssubjectSaveResponse
import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Entity.*
import com.api.conca.IRepository.IBusinesssubjectRepository
import com.api.conca.IRepository.ISubjectRepository
import com.api.conca.Repository.BusinesssubjectRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.text.SimpleDateFormat
import java.util.*


@Service
class BusinesssubjectService(val businesssubjectRepository: BusinesssubjectRepository) {

    @Throws(Exception::class)
    fun saveBusinesssubject(subject:BusinesssubjectDTO): BusinesssubjectSaveResponse {
        return businesssubjectRepository.saveBusinesssubject(subject)
    }
}