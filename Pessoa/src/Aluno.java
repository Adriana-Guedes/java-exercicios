
public class Aluno extends Pessoa {
	//ATRIBUTO
	String matricula;
	
	
	//CONSTRUTOR HERANÇA
	public Aluno(String nome, String cpf, String dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

	public  void  tirarCopias(int qtd ) {
		double valor= 0.07 * qtd;
		 System.out.printf("O valor total a pagar é R$ %.2f %n",valor);
		
	}
	

}
