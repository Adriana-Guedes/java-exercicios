
public class Funcionario extends Pessoa {
	
	private double salario;
	private String dataAdmissao; 
	private  String cargo;
	
	
	public Funcionario(String nome, String cpf, String dataNascimento, double salario, String dataAdmissao,
			String cargo) {
		super(nome, cpf, dataNascimento);
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.cargo = cargo;
	}
	
	
		
	
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
