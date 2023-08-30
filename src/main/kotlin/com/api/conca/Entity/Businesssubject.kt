package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import java.math.BigDecimal
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "businesssubject", schema = "public")
@Getter @Setter
class Businesssubject (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectid", referencedColumnName = "id")
    val subject:Subject,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identitydocumentid", referencedColumnName = "id")
    val identitydocument:Identitydocument,
    val identitynumber:String,
    val businessname:String,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectrolcategoryid", referencedColumnName = "id")
    val subjectrolcategory:Subjectrolcategory,
    val startdate:Date,
    val phone:String,
    val address:String,
    val districtid:Int?=null,
    val email:String,
    val code:String,
    val provinceid:String?=null,
    val city:String,
    val companyid:Int?=null,
    val state:Int,
    val otherreferences:String,
    val parentid:Int?=null,
    val paymodeid:Int?=null,
    val payrollentrydate:Date,
    val salary:BigDecimal,
    val browser_agent:String,
    val creditcard:String,
)