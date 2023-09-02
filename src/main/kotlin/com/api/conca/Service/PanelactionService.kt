package com.api.conca.Service

import com.api.conca.Configuration.HibernateSessionManager
import com.api.conca.Entity.Panelaction
import com.api.conca.IRepository.IPanelactionRepository
import com.api.conca.Repository.PanelactionRepository
import org.springframework.stereotype.Service
import org.hibernate.Session
import org.hibernate.SessionFactory

@Service
class PanelactionService (val panelactionRepositoryI: IPanelactionRepository,val panelactionRepository: PanelactionRepository){

    fun panelaction2(): Map<String, List<Panelaction>> {
         return panelactionRepositoryI.findAll().groupBy { it.menu }
    }


    fun panelaction(businesssubjectid:Int): Map<String, List<Panelaction>> {
        return panelactionRepository.listBusinesssubjectpanelaction(businesssubjectid).groupBy { it.menu }
    }
}