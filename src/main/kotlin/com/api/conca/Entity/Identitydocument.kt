package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name="identitydocument", schema = "public")
@Getter @Setter
class Identitydocument (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val shortname:String,
    val fullname:String,
    val length:Int,
    val mask:String,
    val legacydetail:String,
    val isprimary:Int,
    val isforbusiness:Int
)
