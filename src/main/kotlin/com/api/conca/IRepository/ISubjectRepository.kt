package com.api.conca.IRepository

import com.api.conca.Entity.Subject
import com.api.conca.Entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface ISubjectRepository : JpaRepository<Subject, Int>