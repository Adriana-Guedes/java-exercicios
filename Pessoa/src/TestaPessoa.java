
import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		Aluno a = new Aluno("Alice", "45729", "12/12/20", "95457" );
		Professor p = new Professor("Alice", "45729", "12/12/20", 200.00, "Matematica" );
		Funcionario f = new Funcionario("Alice", "45729", "12/12/20", 200.00, "20/05/1989", "Faxineiro");
		
		int pessoa;
		int num1;
		
		System.out.println("COPIADORA:\n");
		
		
		System.out.println(" "
				+ "Voc? ? :\n" 
				+ "1 - Aluno\n" 
				+ "2 - Professor\n"
				+ "3 - Funcionario\n\n");
				pessoa = in.nextInt();	
								
				while(pessoa <= 0 || pessoa > 4 )
				{
					System.out.println(" "
							+"Escolha uma op??o:\n" 
							+"Voc? ? :\n" 
							+ "1 - Aluno\n" 
							+ "2 - Professor\n"
							+ "3 - Funcionario\n\n");
							pessoa = in.nextInt();	
							

				}
				System.out.printf("Quantas copias deseja?");
							num1 = in.nextInt();
													
							
							switch (pessoa) {
								case 1:	
									a.tirarCopias(num1);
									break;
								case 2:		
									p.tirarCopias(num1 );
									break;
								case 3:		
									f.tirarCopias(num1 );
									break;
							}
																
									
		
				}

		}
				
	
