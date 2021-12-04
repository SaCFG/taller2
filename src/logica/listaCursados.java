package logica;

import dominio.cursados;

public class listaCursados {
	private int max;
	private int cantidad = 0;
	private cursados [] lista;
		
	public listaCursados (int max) {
		this.max = max;
		lista = new cursados[max];
	}
		
	public int getMax() {
		return max;
	}
	public int getCantCursadoss() {
		return cantidad;
	}
	
	public boolean agregarCursados(cursados cursados) {
		if (cantidad<max){
			lista[cantidad] = cursados;
			cantidad++;
			return true;
		}
		else return false;
	}
}
