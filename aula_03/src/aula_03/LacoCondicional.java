package aula_03;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
//		//Exercicio1
//		System.out.println("Digite o primeiro valor: ");
//		int valor1 = scan.nextInt();
//		
//		System.out.println("Digite o segundo valor: ");
//		int valor2 = scan.nextInt();
//		
//		System.out.println("Digite o terceiro valor: ");
//		int valor3 = scan.nextInt();
//		
//		int soma = valor1 + valor2;
//		
//		if(soma > valor3) {
//			
//			System.out.println("A Soma de A + B é Maior do que C.");
//		}else if(soma < valor3) {
//			
//			System.out.println("A Soma de A + B é Menor do que C.");
//		}else {
//			
//			System.out.println("A Soma de A + B é Igual a C.");
//		}
		
		//exercicio2
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("Par!");
		}else {
			System.out.println("Impar!");
		}
			
		if(num >= 0) {
			System.out.println("Positivo!");
		}else {
			System.out.println("Negativo!");
		}
	
	}
}
