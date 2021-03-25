package com.salesianostriana.primerodam.dao;

import com.salesianostriana.primerodam.modelo.Alumno;

import java.util.List;

public interface CrudAlumno {
    List<Alumno> findAll();

    Alumno findOne(long id);

    void insert(Alumno alumno);

    void edit(Alumno alumno);

    void delete(Alumno alumno);
}
