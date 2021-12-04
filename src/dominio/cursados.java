package dominio;


public class cursados {
	public class personaje {
		private int codigo;
		private int nota;
			
		public cursados(int codigo, int nota) {
			this.codigo = codigo;
			this.nota = nota;
		}

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota = nota;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
	}
}