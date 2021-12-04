package logica;

import dominio.estudiante;

public class listaEstudiantes {
	private int max;
	private int cantidad = 0;
	private estudiante [] lista;
	
	public listaEstudiantes (int max) {
		this.max = max;
		lista = new estudiante[max];
	}
	
	public int getMax() {
		return max;
	}
	public int getCantPjs() {
		return cantidad;
	}
	
	public boolean agregarEstudiante(estudiante estudiante) {
		if (cantidad<max){
			lista[cantidad] = estudiante;
			cantidad++;
			return true;
		}
		else return false;
	}
	
	public estudiante getEstudiante(int indice) {
		return lista[indice];
	}
	
}
