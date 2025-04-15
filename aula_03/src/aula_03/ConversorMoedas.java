package aula_03;

import java.util.Scanner;


public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConvertido = 0.0;
		String moeda = "";
		
		System.out.println("-***********************-");
		System.out.println("   Conversor de Moedas   ");
		System.out.println("-***********************-");
		System.out.println("1 - Converter para Dólar (US$)   ");
		System.out.println("1 - Converter para Euros (EUR)   ");
		System.out.println("1 - Converter para Pesos (ARS)     ");
		System.out.println("                                 ");
		System.out.println("-***********************-");
		System.out.println("Digite a opção desejada: ");
		
		int opcao = leia.nextInt();
		
		System.out.println("Digite o valor em Reais (R$): ");
		double valor = leia.nextDouble();
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dólar";
			break;
			
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Pesos";
			break;
		default:
			System.out.printf("Opção inválida!");
			leia.close();
			return;
		}
		
		
		System.out.printf("Valor convertido em %s: %.2f", moeda, valorConvertido);
		leia.close();
		

	}

}
