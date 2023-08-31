package com.api.conca.Service

import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Entity.Identitydocument
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import kotlin.jvm.Throws

@Service
class BusinesssubjectService {

    @Throws(Exception::class)
    @Transactional
    fun saveBusinesssubject(subject:BusinesssubjectDTO):String{
        with(subject){

               // Identitydocument()


            //val identitydocument= Identitydocument("","","","".)


        }

        return ""
    }



}