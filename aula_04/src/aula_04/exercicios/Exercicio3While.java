package aula_04.exercicios;

import java.util.Scanner;



public class Exercicio3While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menor21 = 0;
		int maior50 = 0;
		int idade = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = scan.nextInt();
			if (idade < 0) break; //Verifica se a idade é negativa
			if(idade < 21) {
				menor21++;
			}else if(idade > 50) {
				maior50++;
			}
		}

        System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

        scan.close();

	}

}
