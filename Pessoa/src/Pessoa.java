


 public class Pessoa {
	// ATRIBUTOS
	protected String nome;
	protected String cpf;
	protected String dataNascimento;
	
	
	
	public Pessoa() {}
	
	
		
	public Pessoa(String nome, String cpf, String dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}




	//GETTERS  E SETTERS 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	public  void  tirarCopias(int qtd ) {
		 double valor= 0.10 * qtd;
		 System.out.printf("O valor total a pagar ? R$ %.2f %n",valor);
		
	}
	
}



