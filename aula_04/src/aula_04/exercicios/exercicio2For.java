package aula_04.exercicios;

import java.util.Scanner;

public class exercicio2For {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int numero;
		 int contador;
		 int par = 0;
		 int impar = 0;
		 
		 
		 for(contador = 1; contador <= 10; contador++) {
			 System.out.println("\nDigite o " + contador + "º número: ");
	         numero = scan.nextInt();
	         if(numero % 2 == 0) {
	        	 par++;
	         }else {
	        	 impar++;
	         }   
		 }
		 System.out.printf("\nTotal de números pares: %d", par);
         System.out.printf("\nTotal de números ímpares: %d", impar);
 
		 scan.close();
	}

}
