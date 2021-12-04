package dominio;

public class profesor {
	private String rut;
	private String correo;
	private String contra;
	private int salario;
	
	public profesor(String rut, String correo, String contra, int salario) {
		this.rut = rut;
		this.correo = correo;
		this.contra = contra;
		this.salario = salario;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
