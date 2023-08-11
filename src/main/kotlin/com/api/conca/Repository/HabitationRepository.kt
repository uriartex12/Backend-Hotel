package com.api.conca.Repository

import com.api.conca.Entity.Habitation
import com.api.conca.Entity.Panelaction
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager


@Repository
class HabitationRepository(val entityManager: EntityManager) {

    @Throws(Exception::class)
    fun list(): List<Habitation> {
        val query = StringBuilder()
        var data: List<Habitation>
        try {
            query.append("select h.* from habitation h inner join category c on c.id =h.categoryid")
            data = entityManager.createNativeQuery(query.toString()).resultList as List<Habitation>
        } catch (e: Exception) {
            throw Exception("R_ERROR:" + e.message)
        }
        return data
    }
}