package aula_02;

import java.util.Locale;
import java.util.Scanner;

public class Ex_aula01 {

	public static void main(String[] args) {
		//exercício 1
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
//		System.out.println("Digite o salário: ");
//		float salario = scan.nextInt();
//		
//		System.out.println("Digite o abono: ");
//		float abono = scan.nextInt();
//		
//		float novoSalario = salario + abono;
//		
//		System.out.println("Novo Salário: " + novoSalario);
//		
		
		//exercício 2
//		System.out.println("Digite a primeira nota: ");
//		float nota1 = scan.nextFloat();
//		System.out.println("Digite a segunda nota: ");
//		float nota2 = scan.nextFloat();
//		System.out.println("Digite a terceira nota: ");
//		float nota3 = scan.nextFloat();
//		System.out.println("Digite a quarta nota: ");
//		float nota4 = scan.nextFloat();
//		
//		float calcularMedia = (nota1 + nota2 + nota3 + nota4) / 4;
//		
//		System.out.printf("A média é: %.2f", calcularMedia);
		
		//Exercicio 3
//		System.out.println("Digite o salário bruto: ");
//		float salarioBruto = scan.nextInt();
//		System.out.println("Digite o adicional noturno: ");
//		float adicionalNoturno = scan.nextInt();
//		System.out.println("Digite o horas extras: ");
//		float horasExtras = scan.nextInt();
//		System.out.println("Digite o descontos: ");
//		float descontos = scan.nextInt();
//		
//		float salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos);
//		
//		System.out.println("O salário liquido é: " + salarioLiquido);
		
		  System.out.print("Digite o numero1: ");
	      float n1 = scan.nextFloat();

	      System.out.print("Digite o numero2: ");
	      float n2 = scan.nextFloat();

	      System.out.print("Digite o numero3: ");
	      float n3 = scan.nextFloat();

	      System.out.print("Digite o numero4: ");
	      float n4 = scan.nextFloat();

	      float diferenca = (n1 * n2) - (n3 * n4);

	     System.out.printf("Diferença: %.1f%n", diferenca);
		

		

	}

}
