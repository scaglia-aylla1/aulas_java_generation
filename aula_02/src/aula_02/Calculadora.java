package aula_02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double numero2 = leia.nextDouble();
		
		System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, (numero1 + numero2));
		
		System.out.printf("\n%.2f - %.2f = %.2f", numero1, numero2, (numero1 - numero2));
		
		System.out.printf("\n%.2f * %.2f = %.2f", numero1, numero2, (numero1 * numero2));
		
		System.out.printf("\n%.2f / %.2f = %.2f", numero1, numero2, (numero1 / numero2));
		
		System.out.printf("\n%.2f ^ %.2f = %.2f", numero1, numero2, Math.pow(numero1, numero2));
		
		System.out.printf("\n%.2f R %.2f = %.2f", numero1, numero2, Math.sqrt(numero1));
		

	}

}
