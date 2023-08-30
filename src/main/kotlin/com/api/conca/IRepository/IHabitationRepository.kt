package com.api.conca.IRepository

import com.api.conca.Entity.Habitation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface IHabitationRepository:JpaRepository<Habitation,Int>
