package com.salesianostriana.primerodam.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {
    private long id;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    //private int edad;
    private String email;

    public Alumno() {
    }

    public Alumno(long id, String nombre, String apellidos, LocalDate fechaNacimiento, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public void setEdad(int edad) {
        this.edad = edad;
    }*/

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return id == alumno.id &&
                nombre.equals(alumno.nombre) &&
                apellidos.equals(alumno.apellidos) &&
                fechaNacimiento.equals(alumno.fechaNacimiento) &&
                email.equals(alumno.email);
    }

    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, fechaNacimiento, email);
    }

    public String toString() {
        return "ID: "+this.id+"\nNombre: "+this.nombre+"\nApellidos: "+this.apellidos+"\nEmail: "+this.email+"\nFecha de Nacimiento: "+this.fechaNacimiento+"\n";
    }

    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        //this.edad = hoy.getYear() - this.fechaNacimiento.getYear();
        return hoy.getYear() - this.fechaNacimiento.getYear();

    }
}
