package logica;

import dominio.estudiante;
import dominio.paralelo;
import dominio.profesor;

public class sistemaUniversidadImlp implements sistemaUniversidad{
	
	private listaProfesores lProfesores;
	private listaEstudiantes lEstudiantes;
	private listaParalelos lParalelos;
	private listaAsignatura lAsignatura;

	
	 public sistemaUniversidadImlp() {
		lProfesores = new listaProfesores(9999);
		lEstudiantes = new listaEstudiantes(9999);
		lParalelos = new listaParalelos(9999);
		lAsignatura = new listaAsignatura(9999);
	}	  
	
	@Override	
	public boolean agregarEstudiante(estudiante estudiante) {
		return lEstudiantes.agregarEstudiante(estudiante);
	}
	
	@Override
	public boolean agregarParalelo(paralelo paralelo) {
		return lParalelos.agregarParalelo(paralelo);
	}

	@Override
	public boolean agregarProfesor(profesor profesor) {
		return lProfesores.agregarProfesor(profesor);
	}
	@Override
	public boolean agregarAsignatura(asignatura asignatura) {
		return lAsignatura.agregarAsignatura(asignatura);
	}

	@Override
	public int iniciarSesion(String usuario, String password) {
		
		if (lProfesores.buscarProfesor(usuario) != -1 && password.equals(lProfesores.getProfesor(lProfesores.buscarProfesor(usuario)).getPassword())){
			return 1;
		}
		
		else if (usuario.equals("ADMIN") && password.equals("ADMIN")) {
			return 2;
		}
		else return 0;
		

		
	}

	@Override
	public boolean añadirSaldo(profesor Profesor) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean infoCliente() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean infoAsignaturas() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cierreSistema() {
		// TODO Auto-generated method stub
		return false;
	}


		

	

}
