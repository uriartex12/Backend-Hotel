package com.api.conca.Entity

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "subject", schema = "public")
class Subject @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int?,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identitydocumentid", referencedColumnName = "id")
    val identitydocument:Identitydocument,
    val identitynumber:String,
    val firstname:String,
    val secondname:String,
    val birthday: Date?,
    val address: String?,
    val phone: String?,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjecttypeid", referencedColumnName = "id")
    val subjecttype:Subjecttype,
    val districtid:Int?=null,
    val maritalstatus: String?
){
    constructor(identitydocument:Identitydocument, identitynumber:String, firstname:String, secondname:String, birthday: Date?, address: String?, phone: String?, subjecttype:Subjecttype, districtid: Int?, maritalstatus: String?)
               : this(  id =null, identitydocument =identitydocument, identitynumber =identitynumber, firstname =firstname, secondname =secondname, birthday =birthday, address =address,
                        phone =phone, subjecttype =subjecttype, districtid =districtid, maritalstatus =maritalstatus)
}
