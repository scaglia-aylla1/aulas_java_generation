package aula_05.exercicios;

import java.util.Scanner;

public class Exercicio4Matriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[][] notas = new double[4][4];
		double[] medias = new double[4];
		
		//ler as notas
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite as 4 notas do participante " + (i + 1) + ":");
			double soma = 0;
			for(int j = 0; j < 4; j++) {
				System.out.println("Nota " + (j + 1) + ": ");
                notas[i][j] = scan.nextDouble();
                soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}
		
		// Exibição das médias
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
        }

        scan.close();

	}

}
