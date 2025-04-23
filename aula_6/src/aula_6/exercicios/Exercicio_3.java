package aula_6.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			int num = scan.nextInt();
			numeros.add(num);
		}
		
		Iterator<Integer> inumeros = numeros.iterator();
		while(inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}
		
		
		scan.close();
	}

}
