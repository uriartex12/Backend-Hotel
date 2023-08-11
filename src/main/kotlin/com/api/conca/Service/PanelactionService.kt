package com.api.conca.Service

import com.api.conca.Entity.Panelaction
import com.api.conca.Repository.IPanelactionRepository
import org.springframework.stereotype.Service

@Service
class PanelactionService (val panelactionRepositoryI: IPanelactionRepository) {

    fun panelaction(): List<Panelaction> {
       val planelaction=panelactionRepositoryI.findAll()
        return planelaction
    }
}