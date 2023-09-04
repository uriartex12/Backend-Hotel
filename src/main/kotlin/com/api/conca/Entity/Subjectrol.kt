package com.api.conca.Entity

import javax.persistence.*

@Entity
@Table(name = "subjectrol", schema = "public")
class Subjectrol  @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val name:String,
    val description:String?=null,
    val subjectrolcategoryid: Int?,
    val isdefault:Int?=0
 ){
    constructor(id: Int?, subjectrolcategoryid: Int?) : this( id = id, name = "", subjectrolcategoryid = subjectrolcategoryid)
}