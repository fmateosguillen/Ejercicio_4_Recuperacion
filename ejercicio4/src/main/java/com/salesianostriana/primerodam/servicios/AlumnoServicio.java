package com.salesianostriana.primerodam.servicios;

import com.salesianostriana.primerodam.dao.CrudAlumno;
import com.salesianostriana.primerodam.dao.CrudAlumnoEnMemoria;
import com.salesianostriana.primerodam.modelo.Alumno;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.*;

public class AlumnoServicio implements CrudAlumno{
    private List<Alumno> listadoAlumnos;

    CrudAlumnoEnMemoria crudAlumnoEnMemoria = new CrudAlumnoEnMemoria(listadoAlumnos);

    public AlumnoServicio(List<Alumno> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    public List<Alumno> getByOrdenAlfabetico(){
        List<Alumno> listaOrdenada;
        listadoAlumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getApellidos().compareTo(o2.getApellidos());
            }
        });
        return listadoAlumnos;
    }

    /*public List<Alumno> getByEdad(){
        List<> listaOrdenada;
        listaOrdenada = Collections.sort(listadoAlumnos);
    }*/

    public List<Alumno> findAll() {
        return crudAlumnoEnMemoria.findAll();
    }

    public Alumno findOne(long id) {
        return crudAlumnoEnMemoria.findOne(id);
    }

    public void insert(Alumno alumno) {
        crudAlumnoEnMemoria.insert(alumno);
    }

    public void edit(Alumno alumno) {
        crudAlumnoEnMemoria.edit(alumno);
    }

    public void delete(Alumno alumno) {
        crudAlumnoEnMemoria.delete(alumno);
    }

}
