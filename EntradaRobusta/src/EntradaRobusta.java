

import java.util.Scanner; 


public class EntradaRobusta {
   public static void main (String [] args) {
	   Scanner in = new Scanner (System.in);
	   boolean erro = true;
	  
	   int idade=0;
	   do {
		   try {
			   System.out.print("Digite um número inteiro..: ");
			   idade = in.nextInt();
			   erro = false;
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