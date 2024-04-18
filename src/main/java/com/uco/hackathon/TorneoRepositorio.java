package com.uco.hackathon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


//TODO clase repositorio que contiene todos los métodos de persistencia de datos
@Repository
public interface TorneoRepositorio extends CrudRepository<Torneo, Integer> {
}
