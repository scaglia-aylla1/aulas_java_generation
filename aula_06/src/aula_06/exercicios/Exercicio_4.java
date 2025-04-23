package aula_06.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_4 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
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
		
		//Entrada de dados
		System.out.print("\nDigite o número que você deseja encontrar: ");
        int numeroBuscado = scan.nextInt();
        
		//Verifico se o numero digitado pelo usuario existe
        if (numeros.contains(numeroBuscado)) {
            System.out.println("O número " + numeroBuscado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado!");
        }
        
        
        scan.close();

	}

}
