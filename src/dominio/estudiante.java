package dominio;

import logica.listaCursados;
import logica.listaInscritas;

public class estudiante {
	private String rut;
	private String cuenta;
	private int nivel;
	private String contra;
	private listaCursados cursados;
	private listaInscritas inscritas;
		
	public estudiante(String rut, String cuenta, int nivel, String contra) {
		this.rut = rut;
		this.cuenta = cuenta;
		this.nivel = nivel;
		cursados = new listaCursados(10);
		inscritas = new listaInscritas(10);
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public listaCursados getCursados() {
		return cursados;
	}

	public void setCursados(listaCursados cursados) {
		this.cursados = cursados;
	}

	public listaInscritas getInscritas() {
		return inscritas;
	}

	public void setInscritas(listaInscritas inscritas) {
		this.inscritas = inscritas;
	} 
		
		

}
