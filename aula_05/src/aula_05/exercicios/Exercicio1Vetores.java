package aula_05.exercicios;

import java.util.Scanner;


public class Exercicio1Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean encontrado = false;
		
		System.out.println("Digite um número: ");
		int num1 = leia.nextInt();
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == num1) {
				System.out.println("O número " + num1 + " está localizado na posição: " + (i + 1));
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			 System.out.println("O número " + num1 + " não foi encontrado!");
		}
		
			

		leia.close();
	}

}
