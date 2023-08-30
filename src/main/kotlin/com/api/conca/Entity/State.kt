package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "state", schema = "public")
@Getter @Setter
class State (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id:Long,
        val name:String,
        val description:String,
        val entityname:String,
        val ordernumber:Int
)