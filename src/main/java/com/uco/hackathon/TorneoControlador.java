package com.uco.hackathon;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TorneoControlador {

    private TorneoRepositorio repositorio;

    public TorneoControlador(TorneoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    //TODO en este metodo entran las peticiones por servicio REST y se puede ejecturar el código
    @PostMapping( path = "/test")
    public Torneo save(@RequestBody Torneo torneo) {
        return torneo;
    }

}
