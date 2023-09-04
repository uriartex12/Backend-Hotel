package com.api.conca.IRepository

import com.api.conca.Entity.Employed
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IEmployedRepository: JpaRepository<Employed,Int>