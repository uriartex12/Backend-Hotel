package com.api.conca.IRepository

import com.api.conca.Entity.Panelaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IPanelactionRepository : JpaRepository<Panelaction, Long>