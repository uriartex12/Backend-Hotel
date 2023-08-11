package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "users", schema = "public")
@Getter
@Setter
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    val name: String? = null
    val lastname: String? = null
    val identitynumber: String? = null
    val username: String? = null
    val password: String? = null
}