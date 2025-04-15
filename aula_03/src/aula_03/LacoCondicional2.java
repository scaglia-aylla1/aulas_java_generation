package aula_03;

import java.util.Scanner;

public class LacoCondicional2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		//Calculadora
//		System.out.print("Digite o 1º número: ");
//        float numero1 = scanner.nextFloat();
//		
//        System.out.print("Digite o 2º número: ");
//        float numero2 = scanner.nextFloat();
//		
//        System.out.print("Operação: ");
//        int opcao = scanner.nextInt();
//        
//        switch (opcao) {
//        case 1:
//            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
//            break;
//        case 2:
//            System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
//            break;
//        case 3:
//            System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
//            break;
//        case 4:
//            System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
//            break;
//        default:
//            System.out.println("Operação Inválida!");
//    }
		
		//Conta Bancaria
        float saldo = 1000.00f; // Saldo inicial

        System.out.print("Operação: ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("\nOperação - Saldo");
                System.out.printf("Saldo: R$ %.2f\n", saldo);
                break;

            case 2:
                System.out.print("Valor: R$ ");
                float valorSaque = scanner.nextFloat();

                System.out.println("\nOperação - Saque");
                if (valorSaque > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo -= valorSaque;
                    System.out.printf("Novo Saldo: R$ %.2f\n", saldo);
                }
                break;

            case 3:
                System.out.print("Valor: R$ ");
                float valorDeposito = scanner.nextFloat();

                saldo += valorDeposito;

                System.out.println("\nOperação - Depósito");
                System.out.printf("Novo Saldo: R$ %.2f\n", saldo);
                break;

            default:
                System.out.println("\nOperação Inválida!");
        }
		
		
		
		
		
		
		
		
		scanner.close();

	}

}
