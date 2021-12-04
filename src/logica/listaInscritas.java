package logica;

import dominio.inscritas;

public class listaInscritas {
	private int max;
	private int cantidad = 0;
	private inscritas [] lista;
		
	public listaInscritas (int max) {
		this.max = max;
		lista = new inscritas[max];
	}
		
	public int getMax() {
		return max;
	}
	public int getCantInscritass() {
		return cantidad;
	}
	
	public boolean agregarInscritas(inscritas inscritas) {
		if (cantidad<max){
			lista[cantidad] = inscritas;
			cantidad++;
			return true;
		}
		else return false;
	}
}
