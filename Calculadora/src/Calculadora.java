
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		CalculadoraClasse C =  new CalculadoraClasse( );
	
		int operador = 0;
		int num1, num2;
			
		
		
		
		
		System.out.printf(" CALCULADORA\n\n");	
		
		
		System.out.printf(" "
		+ "Vamos calcular? : \n\n" 
		+ "1 - Soma\n" 
		+ "2 - Subtra��o\n"
		+ "3 - Multiplica��o\n" 
		+ "4 - Divis�o\n\n" 
		+ "Qual das opera��es acima voc� deseja:");
		operador = in.nextInt();		
		
		while(operador <= 0 || operador > 5 )
		{
			System.out.printf("\n\nOperador n�o � valido:\n\n");
			System.out.printf(" "
					+ "Escolha um operador ? : \n\n" 
					+ "1 - Soma\n" 
					+ "2 - Subtra��o\n"
					+ "3 - Multiplica��o\n" 
					+ "4 - Divis�o\n\n" 
					+ "Qual das opera��es acima voc� deseja:");
					operador = in.nextInt();
		}
								
		System.out.printf("Digite um valor:");
		num1 = in.nextInt();
		C.setMemoria(num1);
		
		System.out.printf("\nDigite o valor do operador ");
		num2 =in.nextInt();
				
		
		switch (operador) {
			case 1:	
				
				System.out.printf("A soma de " + num1 +  " + " +  num2 + " = " + C.soma(num2) );
				break;
			case 2:		
				System.out.printf("A subtra��o de " + num1 +  " - " +  num2 + " = " + C.subtrair(num2));
				break;
			case 3:		
				System.out.printf("A multiplica��o de " + num1 +  " - " +  num2 + " = " + C.multiplicar(num2));
				break;
			case 4:		
				System.out.printf("A multiplica��o de " + num1 +  " - " +  num2 + " = " + C.dividir(num2) );
					
				
						
			}	
		
		}
		
	}
		



