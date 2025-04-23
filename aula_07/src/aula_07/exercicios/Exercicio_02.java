package aula_07.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		int opcao;
		
		do {
			System.out.println("\nMenu:");
            System.out.println("1: Adicionar Livro na pilha");
            System.out.println("2: Listar todos os Livros");
            System.out.println("3: Retirar Livro da pilha");
            System.out.println("0: Sair");
            System.out.print("\nEntre com a opção desejada: ");
            opcao = scan.nextInt();
            scan.nextLine(); // limpar o buffer
            
            switch(opcao) {
            case 1:
                System.out.print("\nDigite o nome do livro: ");
                String nome = scan.nextLine();
                pilha.add(nome);
                System.out.println("\nPilha: ");
                for (String livro : pilha) {
                    System.out.println(livro);
                }
              
                System.out.println("\nLivro Adicionado!");
                break;

            case 2:
                if (pilha.isEmpty()) {
                    System.out.println("\nA Pilha está vazia!");
                } else {
                    System.out.println("\nLista de Livros na Pilha: ");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                }
                break;

            case 3:
                if (pilha.isEmpty()) {
                    System.out.println("\nA Pilha está vazia!");
                } else {
                    pilha.pop(); // remove o ultimo elemento da pilha
                    System.out.println("\nPilha: ");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                    System.out.println("\nUm Livro foi retirado da pilha!");
                }
                break;

            case 0:
                System.out.println("\nPrograma Finalizado!");
                break;

            default:
                System.out.println("\nOpção inválida!");
        }

            
		}while(opcao != 0);
		
		scan.close();

	}

}
