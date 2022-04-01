
public class PesquisaClass {
	
	static int sequencia;
	private int numPesquisa;
	private char sexo;
	private char resposta;
	
	
	public PesquisaClass() {
		
	}


			public PesquisaClass(int numPesquisa, char sexo, char resposta) {
				this.numPesquisa = numPesquisa;
				this.sexo = sexo;
				this.resposta = resposta;
			}

					
					// GETTERS E SETTERS  SEQUENCIA
					
					public static int getSequencia() {
						return sequencia;
					}
					
					
					public static void setSequencia(int sequencia) {
						PesquisaClass.sequencia = sequencia;
					}
					
					
					// GETTERS E SETTERS numPesquisa
					public int getNumPesquisa() {
						return numPesquisa;
					}
					
					
					public void setNumPesquisa(int numPesquisa) {
						this.numPesquisa = numPesquisa;
					}
					
					// GETTERS E SETTERS  SEXO
					
					public char getSexo() {
						return sexo;
					}
					
					
					public void setSexo(char sexo) {
						this.sexo = sexo;
					}
					
					
					public char getResposta() {
						return resposta;
					}
					
					
					public void setResposta(char resposta) {
						this.resposta = resposta;
					}
	
					
					
					
			//METODOS DA CLASSE
	
}
	




