package aula_05.exercicios;

import java.util.Scanner;

public class Exercicio2Vetores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorInteiros = new int[10];
		int soma = 0;
		
		for(int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            vetorInteiros[indice] = scan.nextInt();
		}
		
		System.out.println("\nElementos ímpares:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(vetorInteiros[i] + " ");
            }
        }
        
        // Elementos pares
        System.out.println("\n\nElementos pares:");
        for (int i = 0; i < 10; i++) {
            if (vetorInteiros[i] % 2 == 0) {
                System.out.print(vetorInteiros[i] + " ");
            }
        }
        
        // Soma e média
        for (int i = 0; i < 10; i++) {
            soma += vetorInteiros[i];
        }
        

        double media = (double) soma / 10;

        System.out.println("\n\nSoma: " + soma);
        System.out.printf("Média: %.2f\n", media);
		
		scan.close();
	}

}
