package com.api.conca.Repository

import com.api.conca.Controller.HabitationRequest
import com.api.conca.Entity.Habitation
import com.api.conca.Util.Util
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


@Repository
class HabitationRepository(val util: Util) {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    @Throws(Exception::class)
    fun list(params:HabitationRequest): Pair<List<Habitation>, Int> {
        with(params){
            val query = "SELECT h.* FROM habitation h INNER JOIN category c on c.id = h.categoryid"
            val habitation = entityManager
                .createNativeQuery(query, Habitation::class.java)
                .setFirstResult(util.resolveLimit(page!!,xpage!!))
                .setMaxResults(xpage!!)
                .resultList as List<Habitation>

            val total = entityManager.createQuery("SELECT COUNT(h) FROM Habitation h",java.lang.Long::class.java).singleResult.toInt()
            return habitation to total
        }
    }
}