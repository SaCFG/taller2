package logica;

import dominio.estudiante;
import dominio.paralelo;
import dominio.profesor;

public interface sistemaUniversidad{
	boolean agregarEstudiante(estudiante estudiante);
	boolean agregarParalelo(paralelo paralelo);
	boolean agregarProfesor(profesor profesor);
	boolean agregarAsignatura(asignatura asignatura);
	int iniciarSesion (String usuario, String password); 
	
	boolean añadirSaldo (profesor Cuenta);
	
	boolean infoProfesores (); 
	boolean infoAsignaturas();
	boolean cierreSistema ();

	
}
