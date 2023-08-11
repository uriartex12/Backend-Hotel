package com.api.conca.Controller

import com.api.conca.Entity.Habitation
import com.api.conca.Service.IHabitationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
internal class HabitationController(val habitationService: IHabitationService) {

    @GetMapping("/habitation")
    fun listHabitation(): List<Habitation> {
        return habitationService.list()
    }
}
