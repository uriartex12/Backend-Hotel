package com.api.conca.Entity

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "subject", schema = "public")
class Subject (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identitydocumentid", referencedColumnName = "id")
    val identitydocument:Identitydocument,
    val identitynumber:String,
    val firstname:String,
    val secondname:String,
    val birthday:Date,
    val address:String,
    val phone:String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjecttypeid", referencedColumnName = "id")
    val subjecttype:Subjecttype,
    val districtid:Int?=null,
    val maritalstatus:String
)
