package com.salesianostriana.primerodam;

import com.salesianostriana.primerodam.modelo.Alumno;
import com.salesianostriana.primerodam.servicios.AlumnoServicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		Alumno a1 = new Alumno(1l, "María", "Martínez", LocalDate.of(1999, 12, 31), "mariamartinez@gmail.com");
		Alumno a2 = new Alumno(2l, "Javi", "Mateos", LocalDate.of(1999, 1, 28), "javimateos@gmail.com");
		Alumno a3 = new Alumno(3l, "Pepe", "Pérez", LocalDate.of(1998, 8, 10), "pepeperez@gmail.com");

		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		listaAlumnos.add(a3);
		System.out.println("Se han añadido alumnos al listado\n");

		AlumnoServicio alumnoServicio = new AlumnoServicio(listaAlumnos);
		System.out.println("Se ha creado la instancia de AlumnoServicio\n");

		System.out.println("Listado de alumnos ordenado alfabéticamente");
		System.out.println(alumnoServicio.getByOrdenAlfabetico());
		System.out.println("\nMétodo para obtener la edad de un Alumno el 31/12 del año actual:");
		System.out.println("El alumno con ID: "+a1.getId()+" tendrá "+a1.getEdad()+" años para el 31/12 de este año");
	}

}
