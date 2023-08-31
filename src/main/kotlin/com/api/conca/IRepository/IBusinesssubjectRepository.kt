package com.api.conca.IRepository

import com.api.conca.Entity.Businesssubject
import org.springframework.data.jpa.repository.JpaRepository

interface IBusinesssubjectRepository :JpaRepository<Businesssubject,Int>