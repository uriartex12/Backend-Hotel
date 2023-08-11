package com.api.conca.Service

import com.api.conca.Entity.Habitation
import com.api.conca.Repository.HabitationRepository
import com.api.conca.Repository.IHabitationRepository
import org.springframework.stereotype.Service

@Service
class HabitationService(val iHabitationRepository: IHabitationRepository,val habitationRepository: HabitationRepository):IHabitationService {

    override fun list(): List<Habitation> {
       return habitationRepository.list()
    }
}