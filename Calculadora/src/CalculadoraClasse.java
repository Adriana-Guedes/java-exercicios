
public class CalculadoraClasse {
	//ATRIBUTOS
	private double memoria;

	
	//CONSTRUTOR VAZIO PARA TESTE
	public CalculadoraClasse() {
		
	}
	
	//CONSTRUTOR COM ATRIBUTOS
	public CalculadoraClasse(double memoria  ) {
		
		this.memoria = memoria;
	}

	
	//GET E SET DA MEMOORIA
			public double getMemoria() {
				return memoria;
			}

			public void setMemoria(double memoria) {
				this.memoria = memoria;
			}

				
			
	//METODOS
			
			public  double soma(double valor ) {
				
				return memoria = memoria + valor; 
				
				
			}
			
			public double subtrair( double valor) {
				
				return memoria = memoria - valor; 
				
			}
			
			public double multiplicar( double valor) {
				
				return memoria = memoria * valor; 
				
			}
			
			public double dividir( double valor) {
				
				return memoria = memoria  /  valor; 
				
			}
			public double exibirMemoria( double memoria) {
				
				return memoria ;
				
			}
			
			
			
			
			
			
			
}

