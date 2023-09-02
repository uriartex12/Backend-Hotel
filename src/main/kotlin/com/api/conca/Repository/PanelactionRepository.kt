package com.api.conca.Repository

import com.api.conca.Configuration.HibernateSessionManager
import com.api.conca.Entity.Panelaction
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


@Suppress("DEPRECATION")
@Repository
class PanelactionRepository {


    @PersistenceContext
    private lateinit var entityManager: EntityManager
    fun listBusinesssubjectpanelaction(businesssubjectid:Int): List<Panelaction> {
        val sql = StringBuilder()
         sql.append(" SELECT p.id , p.submenu , p.state , p.menu , p.page , p.mask , p.icon ")
            .append(" FROM businesssubjectpanelaction bsp ")
            .append(" INNER JOIN panelaction p ON p.id=bsp.panelactionid")
            .append(" WHERE bsp.businesssubjectid=$businesssubjectid ")

        return entityManager.createNativeQuery(sql.toString(),Panelaction::class.java).resultList as List<Panelaction>
    }
}