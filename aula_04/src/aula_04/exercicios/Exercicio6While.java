package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio6While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int somaMultiplos = 0;
		int quantidadeMultiplos = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			
			if(numero != 0 && numero % 3 == 0) {
				somaMultiplos += numero;
				quantidadeMultiplos++;
			}
		}while(numero != 0);
		
		
		if (quantidadeMultiplos > 0) {
			float media = (float) somaMultiplos / quantidadeMultiplos;
			System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
		} else {
		    System.out.println("Nenhum múltiplo de 3 foi digitado.");
		}


		scan.close();
	}

}
