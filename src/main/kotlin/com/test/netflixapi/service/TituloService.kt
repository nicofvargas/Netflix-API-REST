package com.test.netflixapi.service

import com.test.netflixapi.modelo.Titulo
import com.test.netflixapi.repositorio.TituloRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TituloService(@Autowired val tituloRepo : TituloRepo) {

    fun obtenerPorId(id:String): Titulo? {
        return tituloRepo.findById(id).orElse(null)
    }
}