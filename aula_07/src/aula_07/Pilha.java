package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//cria a estrutura pilha
		Stack<String> pilha = new Stack<String>();
		
		//adiciona elementos
		pilha.add("Comunicação não violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diário de um Banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("O código da Vinci");
		
		//Adicionar um elemento via teclado
		System.out.println("Digite o titulo de um livro: ");
		pilha.push(scan.nextLine());
		
		System.out.println(pilha);
		
		//retira um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		//Adiciona elemento na pilha
		pilha.push("Roube como um artista");
		
		System.out.println(pilha);
		
		//Exibe o elemento que está no topo da pilha
		System.out.println(pilha.peek());
		
		//Verifica se existe um elemento na pilha
		System.out.println("O livro diario de um banana existe na pilha? " + pilha.contains("Diário de um Banana"));

		
		scan.close();
	}

}
