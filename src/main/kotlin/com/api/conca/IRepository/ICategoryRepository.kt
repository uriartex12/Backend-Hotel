package com.api.conca.IRepository

import com.api.conca.Entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface ICategoryRepository:JpaRepository<Category,Int>