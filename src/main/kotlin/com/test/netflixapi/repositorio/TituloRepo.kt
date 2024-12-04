package com.test.netflixapi.repositorio

import com.test.netflixapi.modelo.Titulo
import org.springframework.data.jpa.repository.JpaRepository

interface TituloRepo : JpaRepository<Titulo, String> {
}