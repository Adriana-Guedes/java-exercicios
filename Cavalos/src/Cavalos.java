
import java.util.Scanner;
import java.lang.Math;


public class Cavalos {

		public static void main(String[] args) {
			
			
						
			System.out.println("Digite o valor da massa : ");
			Scanner in = new Scanner(System.in);
			double a = in.nextDouble();
			
			System.out.println("Digite a altura: ");
			double b = in.nextDouble();
			
			
			System.out.println("Digite o tempo: ");
			double c = in.nextDouble();
							
			double  massa  = a;
			double  altura = b; 
			double  tempo  = c;
			double  cavalos = massa * altura / tempo / 745.6999;
		
		
		 String  frase  = "Para levantar " + massa +
		              "kg a uma altura de " + altura + 
					  "m em " + tempo +
					  "s serão necessários " + Math.round((cavalos*100.0)/100.01) +
					  " cavalos.";
			
					 
		 			System.out.println(frase);
			
				} 
				
			}

	
