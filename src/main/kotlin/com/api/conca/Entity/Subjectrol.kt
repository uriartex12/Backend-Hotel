package com.api.conca.Entity

import javax.persistence.*

@Entity
@Table(name = "subjectrol", schema = "public")
class Subjectrol  @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int,
    val name:String,
    val description:String,
    val subjectrolcategoryid:Int,
    val isdefault:Int
 )