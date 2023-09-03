package com.api.conca.Controller

import com.api.conca.Dto.HabitationDTO.ListAllHabitationDTO
import com.api.conca.Entity.Habitation
import com.api.conca.Service.HabitationService
import org.springframework.web.bind.annotation.*


data class HabitationResponse(val page: Int?, val xpage:Int, val total: Int, val list: List<ListAllHabitationDTO>)
data class HabitationRequest(val page: Int?=1, val xpage: Int?=10, val name: String?="", val categoryId: Int?=0,var limit:Int?=0,var count:Boolean?=false)

data class RegisterHabitationResquest(val name:String)

@RestController
@RequestMapping("/api/habitation")
internal class HabitationController(val habitationService: HabitationService) {

    @GetMapping
    fun listHabitation(@ModelAttribute params:HabitationRequest): HabitationResponse {
        return habitationService.list(params)
    }
    @PostMapping
    fun save(@RequestBody habitationResquest:RegisterHabitationResquest){
        habitationService.save(habitationResquest)
    }
}
