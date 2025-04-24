package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
			
			System.out.println("\nDigite o primeiro numero:");
			double numero1 = leia.nextDouble();
			
			System.out.println("Digite o segundo numero:");
			double numero2 = leia.nextDouble();
			
			System.out.println("1- somar");
			System.out.println("2- subtrair");
			System.out.println("3- multiplicação");
			System.out.println("4- dividir");
			System.out.println("0- sair");
			System.out.println("Qual operação voce deseja executar?");
			
			opcao = leia.nextInt();
			
			//cai fora sem precisar perguntar
			if(opcao == 0) {
				sobre();
				System.exit(0);
			}

			switch(opcao) {
				case 1 -> System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, somar(numero1, numero2));
				case 2 -> System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, subtrair(numero1, numero2));
				case 3 -> System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, multiplicar(numero1, numero2));
				case 4 -> System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, dividir(numero1, numero2));
				default -> System.out.println("\nOpção inválida");
			}
				
			
			
			}
			
			//leia.close();
	
		
	}
	static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	static double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}

	static void sobre() {
		System.out.println("Calculadora com Métodos");
		System.out.println("Feito por: Aylla‧₊˚");
	}

		
		
}
