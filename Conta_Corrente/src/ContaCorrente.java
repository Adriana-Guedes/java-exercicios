

//MODELO DE CLASSE
public class ContaCorrente {
	
	private int  numCC;
	private double saldoCC;
	
	
	//CONTRUTOR  DA CLASSE VAZIO (NÃO É OBRIGATORIO, CRIAR VAZIO, SOMENTE PARA TESTE)
		
		public ContaCorrente() {
		
	}

	//CONTRUTOR DA CLASSE  COM ATRIBUTOS
			public ContaCorrente(int numCC, double saldoCC) {
				this.numCC = numCC;
				this.saldoCC = saldoCC;
	}
	
			
			
		//GET E SET DO NunCC

				public int getNumCC() {
				return numCC;
				}

				public void setNumCC(int numCC) {
				this.numCC = numCC;
				}

	  //GET E SET DO SaldoCC
		
				public double getSaldoCC() {
					return saldoCC;
	}
			
				public void setSaldoCC(double saldoCC) {
					this.saldoCC = saldoCC;
				}
				
			
				
				
	
		//METODOS 
				
				public void  setDepositar(double valor) {
					
					//saldoCC += valor OU
					
					saldoCC = saldoCC + valor;
					
				}
				
				
				public void setSacar(double valor) {
					//saldoCC -= valor;
					saldoCC = saldoCC - valor;
					
					
				}
}


