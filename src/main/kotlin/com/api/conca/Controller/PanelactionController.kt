package com.api.conca.Controller

import com.api.conca.Entity.Panelaction
import com.api.conca.Service.PanelactionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PanelactionController(val panelactionService: PanelactionService) {

    @GetMapping("/panelaction")
    fun getPanelaction(): List<Panelaction>{
        return panelactionService.panelaction()
    }
}