package com.api.conca.Dto.HabitationDTO

data class ListAllHabitationDTO (
        val name: String,
        val typehabitation:String,
        val nbeats:Int,
        val description:String?,
        val state:Long
)