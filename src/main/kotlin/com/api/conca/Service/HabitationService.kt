package com.api.conca.Service

import com.api.conca.Controller.HabitationRequest
import com.api.conca.Controller.HabitationResponse
import com.api.conca.Controller.RegisterHabitationResquest
import com.api.conca.Repository.HabitationRepository
import org.springframework.stereotype.Service
import kotlin.jvm.Throws

@Service
class HabitationService(val habitationRepository: HabitationRepository){

    @Throws(Exception::class)
    fun list(params: HabitationRequest): HabitationResponse {
      with(params){
          val habitations=habitationRepository.list(params)
          return HabitationResponse(page!!,xpage!!,habitations.second,habitations.first)
      }
    }
    fun save(habitationResquest: RegisterHabitationResquest) {
        TODO("Not yet implemented")
    }
}