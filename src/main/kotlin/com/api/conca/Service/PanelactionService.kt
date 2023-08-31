package com.api.conca.Service

import com.api.conca.Entity.Panelaction
import com.api.conca.IRepository.IPanelactionRepository
import org.springframework.stereotype.Service

@Service
class PanelactionService (val panelactionRepositoryI: IPanelactionRepository) {

    fun panelaction(): Map<String, List<Panelaction>> {
         return panelactionRepositoryI.findAll().groupBy { it.menu }
    }
}