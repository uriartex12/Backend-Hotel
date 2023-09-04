package com.api.conca.IRepository

import com.api.conca.Entity.Businesssubjectrol
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IBusinesssubjectrolRepository:JpaRepository<Businesssubjectrol,Int>