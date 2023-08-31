package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name="subjecttype", schema = "public")
@Getter @Setter
class Subjecttype @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int,
    val name:String,
    val firstnamedenomination:String,
    val secondnamedenomination:String,
    val classdenomination:String
){
    constructor(id: Int):this(id = id, name = "", firstnamedenomination = "", secondnamedenomination = "", classdenomination = "")
}
