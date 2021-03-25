package com.salesianostriana.primerodam.dao;

import com.salesianostriana.primerodam.modelo.Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CrudAlumnoEnMemoria implements CrudAlumno{
    private List<Alumno> listadoAlumnos;

    public CrudAlumnoEnMemoria(List<Alumno> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    public List<Alumno> findAll() {
        Iterator<Alumno> it = listadoAlumnos.iterator();
        while (it.hasNext()){
            Alumno alumno = it.next();
            System.out.println(alumno);
        }
        return listadoAlumnos;
    }


    public Alumno findOne(long id) {
        Alumno a = new Alumno();
        Iterator<Alumno> it = listadoAlumnos.iterator();
        while (it.hasNext()){
            Alumno alumno = it.next();
            if(alumno.getId() == id){
                a = alumno;
            }
        }
        return a;
    }

    public void insert(Alumno alumno) {
        listadoAlumnos.add(alumno);
    }

    public void edit(Alumno alumno) {
        Iterator<Alumno> it = listadoAlumnos.iterator();
        while (it.hasNext()){
            Alumno al = it.next();
            if(al.getId() == alumno.getId()){
                al.setNombre(alumno.getNombre());
                al.setApellidos(alumno.getApellidos());
                al.setEmail(alumno.getEmail());
                al.setFechaNacimiento(alumno.getFechaNacimiento());
                System.out.println("Alumno modificado correctamente");
            } else{
                System.out.println("No existe ningún alumno con ese ID");
            }
        }
    }

    public void delete(Alumno alumno) {
        Iterator<Alumno> it = listadoAlumnos.iterator();
        while (it.hasNext()) {
            Alumno al = it.next();
            if (al.getId() == alumno.getId()) {
                it.remove();
                System.out.println("Alumno eliminado correctamente");
            }
        }
    }
}
