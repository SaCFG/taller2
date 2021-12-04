package logica;

import dominio.paralelo;

public class listaParalelos {
	private int max;
	private int cantidad = 0;
	private paralelo [] lista;
	
	public listaParalelos (int max) {
		this.max = max;
		lista = new paralelo[max];
	}
	
	public int getMax() {
		return max;
	}
	public int getCantPjs() {
		return cantidad;
	}
	
	public boolean agregarParalelo(paralelo paralelo) {
		if (cantidad<max){
			lista[cantidad] = paralelo;
			cantidad++;
			return true;
		}
		else return false;
	}
	
	public paralelo getParalelo(int indice) {
		return lista[indice];
	}
	
}
