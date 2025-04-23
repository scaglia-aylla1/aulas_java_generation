package aula_06.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		

        // Solicitando número ao usuário
        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numeroBuscado = scan.nextInt();

        // Verificando se o número existe e mostrando o índice
        if (numeros.contains(numeroBuscado)) {
            int posicao = numeros.indexOf(numeroBuscado);
            System.out.println("O número " + numeroBuscado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado!");
        }
		
		
		scan.close();
	}

}
