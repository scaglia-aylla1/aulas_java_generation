package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio5While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int somaPositivos = 0;
		
		
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			if(numero > 0) {
			  somaPositivos += numero;
			}
			
		}while(numero != 0);

        System.out.println("\nA soma dos números positivos é: " + somaPositivos);
     
		
		
		
		scan.close();
	}

}
