package com.api.conca.IRepository

import com.api.conca.Controller.SubjectDao
import com.api.conca.Entity.Businesssubject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface IBusinesssubjectRepository :JpaRepository<Businesssubject,Int>