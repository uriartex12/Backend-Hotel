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
    val id: Int,
    val name:String,
    val nbets:Int,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryid", referencedColumnName = "id")
    val category:Category,
    val description:String? = "",
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stateid", referencedColumnName = "id")
    val state:State
)
