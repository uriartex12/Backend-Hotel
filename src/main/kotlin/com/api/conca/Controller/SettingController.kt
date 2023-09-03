package com.api.conca.Controller

import com.api.conca.Entity.Subjectrol
import com.api.conca.Service.SettingService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class ListPositionRequet(val subjectrolid:Int)
@RestController
@RequestMapping("/api/setting")
class SettingController(val settingService: SettingService) {

    @PostMapping("/listPosition")
    fun listPosition(@RequestBody listPositionRequet:ListPositionRequet): List<Subjectrol> {
        return settingService.listPosition(listPositionRequet.subjectrolid)
    }


}