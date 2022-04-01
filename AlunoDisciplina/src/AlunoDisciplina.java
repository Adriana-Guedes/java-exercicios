
public class AlunoDisciplina {

	// ATRIBUTOS
	private int idAluno;
	private int idDisciplina;
	private double notaB1;
	private double notaB2;
	
	
	
	// CONSTRUTOR DE CLASSE VAZIO PARA TESTE
	public AlunoDisciplina() {
		
	}

	// CONSTRUTOR DE CLASSE COM ATRIBUTOS
	public AlunoDisciplina(int idAluno, int idDisciplina, double notaB1, double notaB2) {
		
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
		this.notaB1 = notaB1;
		this.notaB2 = notaB2;
	}

	
			//GET E SET IDALUNO
			public int getIdAluno() {
				return idAluno;
			}

			public void setIdAluno(int idAluno) {
				this.idAluno = idAluno;
			}
			
			
			//GET E SET idDisciplina
			public int getIdDisciplina() {
				return idDisciplina;
			}

			public void setIdDisciplina(int idDisciplina) {
				this.idDisciplina = idDisciplina;
			}
			
			
			
			//GET E SET notaB1
			public double getNotaB1() {
				return notaB1;
			}
		
			public void setNotaB1(double notaB1) {
				this.notaB1 = notaB1;
			}
			
			
			
			//GET E SET notaB2
			public double getNotaB2() {
				return notaB2;
			}
			
			public void setNotaB2(double notaB2) {
				this.notaB2 = notaB2;
			}
	
	
			
			//METODOS 
			
			public double getMediaAritmetica() {
				return (this.notaB1 + this.notaB2) / 2;
			}
			
			public double getMediaPonderada() {
				return (4 * this.notaB1  + 6 * this.notaB2) /10;
			}

}
