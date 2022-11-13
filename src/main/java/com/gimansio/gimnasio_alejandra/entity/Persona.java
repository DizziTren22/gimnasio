package com.gimansio.gimnasio_alejandra.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Persona {

    private String nombres;

    private LocalDate fechaNacimiento;

    private String apellidos;

    private Long idIdentificacion;

    private String numeroIdentificacion;
}
