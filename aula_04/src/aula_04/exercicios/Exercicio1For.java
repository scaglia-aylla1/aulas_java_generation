package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		if(num1 >= num2) {
		   System.out.println("Intervalo inválido!");
		}
		
		for(int contador = num1; contador <= num2; contador++) {
			if(contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador + " é múltiplo de 3 e 5");
			}
		}
		scan.close();
	}

}
