package com.api.conca.Repository

import com.api.conca.Entity.Panelaction
import com.api.conca.Entity.Subjectrol
import com.api.conca.Util.Util
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


@Repository
class SettingRepository {

    @PersistenceContext
    private lateinit var entityManager: EntityManager
    fun listPosition(subjectrolid:Int): List<Subjectrol> {

        val sql = StringBuilder()
             sql.append(" SELECT sr.id, sr.name, sr.description, sr.subjectrolcategoryid, sr.isdefault FROM subjectrol sr")
                .append(" WHERE (CASE WHEN  ${Util.SUBJECTROLE_SSA}  = $subjectrolid THEN  sr.id in(${Util.SUBJECTROLE_CASHIER},${Util.SUBJECTROLE_ADMIN},${Util.SUBJECTROLE_SSA},${Util.SUBJECTROLE_RECEPTION},${Util.EMPLOYEE_BY_LOCATION}) ELSE ")
                .append(" ( CASE WHEN   ${Util.SUBJECTROLE_ADMIN} = $subjectrolid THEN  sr.id in(${Util.SUBJECTROLE_CASHIER},${Util.SUBJECTROLE_ADMIN},${Util.SUBJECTROLE_RECEPTION},${Util.EMPLOYEE_BY_LOCATION}) END) END)")

        return entityManager.createNativeQuery(sql.toString(),Subjectrol::class.java).resultList as List<Subjectrol>

    }
}