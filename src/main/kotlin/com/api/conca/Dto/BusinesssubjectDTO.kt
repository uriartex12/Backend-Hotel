package com.api.conca.Dto


import java.math.BigDecimal
import java.util.*
data class BusinesssubjectDTO (
    val id:Long?=null,
    val identitydocumentid:Int,
    val identitynumber:String,
    val businessname:String?="",
    val subjectrolcategoryid: Int?=null,
    val phone:String?="",
    val address:String?="",
    val startdate: String?="",
    val districtid:Int?=null,
    val email:String?="",
    val code:String?="",
    val provinceid:String?=null,
    val city:String?="",
    val companyid:Int?=null,
    val otherreferences:String?="",
    val parentid:Int?=null,
    val paymodeid:Int?=null,
    val salary: BigDecimal?=null,
    val browser_agent:String?="",
    val creditcard:String?="",
    val firstname:String,
    val secondname:String,
    val birthday:String?="",
    val subjecttypeid: Int,
    val maritalstatus:String?=""
)