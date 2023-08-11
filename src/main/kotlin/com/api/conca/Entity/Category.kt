package com.api.conca.Entity

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "category", schema = "public")
@Getter @Setter
class Category (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val description: String
)