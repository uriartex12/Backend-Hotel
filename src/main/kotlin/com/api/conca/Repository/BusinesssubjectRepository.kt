package com.api.conca.Repository

import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Entity.*
import com.api.conca.IRepository.IBusinesssubjectRepository
import com.api.conca.IRepository.ISubjectRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.text.SimpleDateFormat
import java.util.*

@Repository
class BusinesssubjectRepository(val subjectRepository: ISubjectRepository, val businesssubjectRepository: IBusinesssubjectRepository) {

    @Throws(Exception::class)
    @Transactional
    fun saveBusinesssubject(subject: BusinesssubjectDTO):Int{
        with(subject){
            val identitydocument= Identitydocument(identitydocumentid)
            val subjecttype= Subjecttype(subjecttypeid)
            val subjectrolcategory= Subjectrolcategory(subjectrolcategoryid)
            val subject=subjectRepository.save(
                Subject(identitydocument,identitynumber,firstname,secondname,
                    SimpleDateFormat("dd/MM/yyyy").parse(birthday),address,phone,subjecttype,districtid,maritalstatus)
            )
            val startdate: Date = SimpleDateFormat("dd/MM/yyyy").parse(startdate)
            val  currentBusinesssubject= Businesssubject(subject,identitydocument,identitynumber,businessname,subjectrolcategory,startdate,phone,address,districtid,email,city)
            val currentBusinesssubjectId =businesssubjectRepository.save(currentBusinesssubject).id
            return currentBusinesssubjectId!!
        }
    }
}