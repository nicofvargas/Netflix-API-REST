package com.test.netflixapi.controladores

import com.test.netflixapi.modelo.Titulo
import com.test.netflixapi.service.TituloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/netflixapi/")
class Controller {
    @Autowired
    lateinit var tituloService: TituloService //aca creamos el objeto desde el service

    @GetMapping("titulo")
    //acepta peticion tipo id?nroid
    fun getPorId(@RequestParam id: String): ResponseEntity<Titulo> {
        val titulo = tituloService.obtenerPorId(id)
        return if(titulo!=null) {
            ResponseEntity.ok(titulo)
        }
        else {
            ResponseEntity.notFound().build()
        }
    }

}