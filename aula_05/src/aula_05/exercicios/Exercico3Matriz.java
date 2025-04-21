package aula_05.exercicios;

import java.util.Scanner;

public class Exercico3Matriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int [3][3];
		 int somaPrincipal = 0;
	     int somaSecundaria = 0;
		
		//leitura dos elementos da matriz
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print("Digite o valor para [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scan.nextInt();
			}
		}
		 // Exibir elementos da diagonal principal
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }
        
     // Exibir elementos da diagonal secundária
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaSecundaria += matriz[i][2 - i];
        }
        
     // Exibir somas
        System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

        scan.close();

	}

}
