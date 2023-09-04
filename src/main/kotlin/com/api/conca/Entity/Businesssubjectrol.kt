package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import java.util.Date
import javax.persistence.*
@Entity
@Table(name = "businesssubjectrol", schema = "public")
@Getter @Setter
class Businesssubjectrol(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val businesssubjectid: Int?,
    val subjectrolid: Int?,
    val startdate:Date,
    val enddate:Date?=null
){

    constructor(businesssubjectid: Int?, subjectrolid: Int?, startdate: Date)
                : this(id = null, businesssubjectid = businesssubjectid, subjectrolid = subjectrolid, startdate = startdate)
}
