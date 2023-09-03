package com.api.conca.Service

import com.api.conca.Controller.HabitationRequest
import com.api.conca.Controller.HabitationResponse
import com.api.conca.Controller.RegisterHabitationResquest
import com.api.conca.Repository.HabitationRepository
import com.api.conca.Dto.HabitationDTO.ListAllHabitationDTO
import com.api.conca.Entity.Habitation
import org.springframework.stereotype.Service
import kotlin.jvm.Throws

@Service
class HabitationService(val habitationRepository: HabitationRepository){

    @Throws(Exception::class)
    fun list(params: HabitationRequest): HabitationResponse {
      with(params){
          val habitations=habitationRepository.list(params)
          val listHabitationsDTO = MappingHabitationDTO(habitations.first)
          return HabitationResponse(page!!,xpage!!,habitations.second,listHabitationsDTO)
      }
    }
    fun save(habitationResquest: RegisterHabitationResquest) {
        TODO("Not yet implemented")
    }

    fun MappingHabitationDTO(habitations: List<Habitation>): List<ListAllHabitationDTO> {
        return habitations.map { habitation ->
            ListAllHabitationDTO(habitation.name, habitation.category.name,habitation.nbets,habitation.description,habitation.state.id)
        }
    }
}