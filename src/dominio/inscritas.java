package dominio;

public class inscritas {
	public class personaje {
		private int codigo;
		private int paralelo;
			
		public inscritas(int codigo, int paralelo) {
			this.codigo = codigo;
			this.paralelo = paralelo;
		}

		public int getParalelo() {
			return paralelo;
		}

		public void setParalelo(int paralelo) {
			this.paralelo = paralelo;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
	}
}
