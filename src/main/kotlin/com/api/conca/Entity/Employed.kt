package com.api.conca.Entity

import javax.persistence.*

@Entity
@Table(name = "employed", schema = "public")
class Employed @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "businesssubjectid", referencedColumnName = "id")
    val businesssubject:Businesssubject,
    val subsidiaryid:Int,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectrolid", referencedColumnName = "id")
    val subjectrol:Subjectrol,
    val warehouseid:Int?=null
){
    constructor(businesssubject: Businesssubject, subsidiaryid: Int, subjectrol: Subjectrol)
                                        : this( id = null, businesssubject = businesssubject, subsidiaryid = subsidiaryid, subjectrol = subjectrol)
}
