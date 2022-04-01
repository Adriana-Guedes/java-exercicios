
public class Triangulo {
	
	//ATRIBUTOS
	
	private double base;
	private double altura;
	
	
	
	//CONSTRUTOR VAZIO(CLICAR COM O  BOTÃO DIREITO  - SOURCE -> GENERATION CONTRUTOR FIELD)
	public Triangulo() {
		
	}

	////CONSTRUTOR COM ATRIBUTOS (CLICAR COM O  BOTÃO DIREITO  - SOURCE -> GENERATION CONTRUTOR FIELD) 
	public Triangulo(double base, double altura) {
				this.base = base;
		this.altura = altura;
	}

	
		//(CLICAR COM O  BOTÃO DIREITO  - SOURCE -> GENERATION  GETTERS E SETTERS) 
	
		// GETS
	
		public double getBase() {
			return base;
		}

		public void setBase(double base) {
			this.base = base;
		}

		
		//SET
		public double getAltura() {
		return altura;
		}

		public void setAltura(double altura) {
		this.altura = altura;
		}
	
	
		//METODOS
		
			//METODO1
		
		public double getArea() {
			
			return (this.altura * this.base) / 2;
			
		}
		
				
		//METODO1
		public double getPerimetro() {
			
						//	RAIZ QUADRADA( RAIZ QUADRADA DA BASE + RAIZ QUADRADA DA ALTURA)
			return this.base + this.altura + Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
		}

		
}
