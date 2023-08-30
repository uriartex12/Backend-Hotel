package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "users", schema = "public")
@Getter @Setter
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val username: String,
    val password: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stateid", referencedColumnName = "id")
    val state:State,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "businesssubjectid", referencedColumnName = "id")
    val businesssubject:Businesssubject
)