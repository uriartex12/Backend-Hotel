package com.api.conca.Repository

import com.api.conca.Entity.Habitation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface IHabitationRepository:JpaRepository<Habitation,Long>{

    @Query( value = "select h.*, c.name ,c.description  from habitation h inner join category c on c.id =h.categoryid ", nativeQuery = true )
    fun findAllHabitation(): List<Habitation>

}
