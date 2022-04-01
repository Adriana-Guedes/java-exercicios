


public class Circulo {
	//ATRIBUTO

	private double raio;
	

	
	
	//CONTRUTOR VAZIO
		public Circulo() {
		
	}

		//CONTRUTOR COM O ATRIBUTO
		public Circulo(double raio) {
			
			this.raio = raio;
		}

		
		
		//GET E SET
				public double getRaio() {
					return raio;
				}

				public void setRaio(double raio) {
					this.raio = raio;
				}
		
		
		
		
		//METODOS DA PROPRIA CLASSE 
		
				public double getArea() {
			
					return  Math.PI * this.raio  * this.raio;
				}
		
				
				public double getPerimetro() {
			
					return  Math.PI * this.raio;
				}
}
