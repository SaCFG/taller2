package dominio;

public class paralelo {
	private int para;
	private int codigo;
	private String rut;
	
	public paralelo(int para, int codigo, String rut) {
		this.para = para;
		this.codigo = codigo;
		this.rut = rut;
	}

	public int getPara() {
		return para;
	}

	public void setPara(int para) {
		this.para = para;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


}
