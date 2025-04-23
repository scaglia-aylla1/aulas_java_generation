package aula_06.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			String input = scan.nextLine();
			cores.add(input);

		}
		
		System.out.println("Exibindo as Cores: ");
		for(var cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		System.out.println("Exibes as cores ordenadas em ordem crescente: ");
		cores.forEach(System.out::println);
		
		scan.close();
	}

}
