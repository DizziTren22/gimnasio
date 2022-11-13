package com.gimansio.gimnasio_alejandra.repository;

import com.gimansio.gimnasio_alejandra.entity.Entrenador;

import java.util.List;

public interface IEntrenadorRepository {

    void agregarEntrenador(Entrenador entrenador);

    List<Entrenador> consultarEntrenadores();

    Entrenador consultarEntrenadorPorIdentificacion(String identificacion);

    Boolean eliminarEntrenador(String identificacion);
}
