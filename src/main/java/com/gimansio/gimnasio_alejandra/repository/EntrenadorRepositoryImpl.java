package com.gimansio.gimnasio_alejandra.repository;

import com.gimansio.gimnasio_alejandra.entity.Entrenador;

import java.util.ArrayList;
import java.util.List;

public class EntrenadorRepositoryImpl implements IEntrenadorRepository {

    private List<Entrenador> entrenadores = new ArrayList<>();

    @Override
    public void agregarEntrenador(Entrenador entrenador) {
        this.entrenadores.add(entrenador);
    }

    @Override
    public List<Entrenador> consultarEntrenadores() {
        return entrenadores;
    }

    @Override
    public Entrenador consultarEntrenadorPorIdentificacion(String identificacion) {
        return entrenadores.stream().filter(x -> x.getNumeroIdentificacion().equals(identificacion)).findAny().orElse(null);
    }

    @Override
    public Boolean eliminarEntrenador(String identificacion) {
        return this.entrenadores.removeIf(x -> x.getNumeroIdentificacion().equals(identificacion));
    }
}
