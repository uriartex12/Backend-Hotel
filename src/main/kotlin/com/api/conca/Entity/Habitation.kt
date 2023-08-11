package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name="habitation", schema = "public")
@Getter @Setter
class Habitation (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name:String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryid")
    val category:Category,
    val description:String? = "",
    val status:Int?=0
)
