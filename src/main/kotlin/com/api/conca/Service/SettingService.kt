package com.api.conca.Service

import com.api.conca.Entity.Subjectrol
import com.api.conca.Repository.SettingRepository
import org.springframework.stereotype.Service
import kotlin.jvm.Throws

@Service
class SettingService(val settingRepository: SettingRepository) {

    @Throws(Exception::class)
    fun listPosition(subjectrolid:Int): List<Subjectrol> {
        return  settingRepository.listPosition(subjectrolid)
    }
}