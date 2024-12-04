package com.test.netflixapi.modelo

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "netflix_titulos")
data class Titulo(
    //aca establezco vinculo con la db y el objeto Titulo
    @Id
    val showId: String,
    val type: String,
    val title: String,
    val director: String?,
    val cast: String?,
    val country: String?,
    val dateAdded: String?,
    val releaseYear: Int?,
    val rating: String?,
    val listedIn: String?,
    val description: String?
)
