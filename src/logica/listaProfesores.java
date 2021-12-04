package logica;

import dominio.profesor;

public class listaProfesores {
	private int max;
	private int cantidad = 0;
	private profesor [] lista;
	
	public listaProfesores (int max) {
		this.max = max;
		lista = new profesor[max];
	}
	
	public int getMax() {
		return max;
	}
	public int getCantPjs() {
		return cantidad;
	}
	
	public boolean agregarProfesor(profesor profesor) {
		if (cantidad<max){
			lista[cantidad] = profesor;
			cantidad++;
			return true;
		}
		else return false;
	}
	
	public profesor getProfesor(int indice) {
		return lista[indice];
	}
	
}
