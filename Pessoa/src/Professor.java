
public class Professor extends Pessoa {

	private double salario; 
	private String disciplina;
	
	
	public Professor(String nome, String cpf, String dataNascimento, double salario, String disciplina) {
		super(nome, cpf, dataNascimento);
		this.salario = salario;
		this.disciplina = disciplina;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
}