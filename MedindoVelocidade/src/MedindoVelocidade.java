
import java.util.Scanner;

public class MedindoVelocidade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Veiculo carro = new Veiculo();
		
		  
		  
		   int velocidade =0;
		   do {
			   try {
				   System.out.print("Qual a sua velocidade no momento :..: ");
				   increme = in.nextInt();
				   velocidade = false;
			   }
			   catch(Exception e) {
				   System.out.println("Dado incorreto... Tente novamente");
				   erro = true;
				   in.nextLine();
			   }
		   } while (erro);
		   
		   System.out.print("Sua idade..: " +idade);
	   }
	
		
	}


