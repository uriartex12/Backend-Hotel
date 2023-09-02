package com.api.conca.Controller

import com.api.conca.Entity.Businesssubject
import com.api.conca.Entity.Panelaction
import com.api.conca.Service.PanelactionService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PanelactionController(val panelactionService: PanelactionService) {

    @GetMapping("/panelaction")
    fun getPanelaction(@Validated @RequestParam businesssubjectid:Int)
    : ResponseEntity<Map<String, List<Panelaction>>> {
        return  ResponseEntity.status(HttpStatus.OK)
                .body(panelactionService.panelaction(businesssubjectid))
    }
}