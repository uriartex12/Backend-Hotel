package com.api.conca.Entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Panelaction(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val submenu: String,
        val state: Int,
        val menu: String,
        val page: String,
        val mask: String,
        val icon: String
)