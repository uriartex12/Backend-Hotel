package com.api.conca.Repository

import com.api.conca.Entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface ICategoryRepository:JpaRepository<Category,Long>