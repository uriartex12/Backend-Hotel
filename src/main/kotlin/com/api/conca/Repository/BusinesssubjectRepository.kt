package com.api.conca.Repository

import com.api.conca.Controller.EmployedResponse
import com.api.conca.Controller.EmployedSaveResponse
import com.api.conca.Controller.SubjectRequest
import com.api.conca.Dto.BusinesssubjectDTO
import com.api.conca.Entity.*
import com.api.conca.IRepository.IBusinesssubjectRepository
import com.api.conca.IRepository.IBusinesssubjectrolRepository
import com.api.conca.IRepository.IEmployedRepository
import com.api.conca.IRepository.ISubjectRepository
import com.api.conca.Util.Util
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.text.SimpleDateFormat
import java.util.*
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class BusinesssubjectRepository(val subjectRepository: ISubjectRepository, val businesssubjectRepository: IBusinesssubjectRepository,
                                val util: Util,val employedRepository: IEmployedRepository,val businesssubjectrolRepository: IBusinesssubjectrolRepository
) {

    @PersistenceContext
    private lateinit var entityManager: EntityManager
    @Throws(Exception::class)
    @Transactional
    fun saveBusinesssubject(subject: BusinesssubjectDTO): EmployedSaveResponse {
        with(subject){
            val identitydocument= Identitydocument(identitydocumentid)
            val subjecttype= Subjecttype(subjecttypeid)
            val subjectrolcategory= Subjectrolcategory(subjectrolcategoryid)
            val subjectrol=Subjectrol(subjectrolid,subjectrolcategory.id)

            val subject=subjectRepository.save(
                        Subject(identitydocument,identitynumber,firstname,secondname,SimpleDateFormat("dd/MM/yyyy").parse(birthday),address,phone,subjecttype,districtid,maritalstatus)
            )
            val startdate: Date = SimpleDateFormat("dd/MM/yyyy").parse(startdate)
            val currentBusinesssubject= Businesssubject(subject,identitydocument,identitynumber,"$firstname  $secondname",subjectrolcategory,startdate,phone,address,districtid,email,city)
            val businesssubject =businesssubjectRepository.save(currentBusinesssubject)
            val businesssubjectrol=Businesssubjectrol(businesssubject.id,subjectrol.id,Date())
            businesssubjectrolRepository.save(businesssubjectrol)
            val employed=Employed(businesssubject,1,subjectrol)
            val employedDb= employedRepository.save(employed)
            return EmployedSaveResponse(HttpStatus.OK.value(),"OK.OO",
                EmployedResponse(employedDb.id,businesssubject.id,subjectrol.id)
            )
        }
    }

    fun listSubject(params: SubjectRequest): Pair<List<Subject>, Int> {
        with(params){
            val query = " SELECT * , b.id as businessid FROM public.businesssubject b " +
                        " INNER JOIN subject s ON s.id =b.subjectid  " +
                        " WHERE b.subjectrolcategoryid = 2 "

            val subject = entityManager
                .createNativeQuery(query, Subject::class.java)
                .setFirstResult(util.resolveLimit(page!!,xpage!!))
                .setMaxResults(xpage!!)
                .resultList as List<Subject>

            val total = entityManager.createQuery("SELECT COUNT(b) FROM Businesssubject b",java.lang.Long::class.java).singleResult.toInt()
            return subject to total
        }
    }
}