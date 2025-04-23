package aula_07.exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	     Queue<String> fila = new LinkedList<>();

	        int opcao;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1: Adicionar um novo Cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar (retirar) uma pessoa da fila");
	            System.out.println("0: Finalizar o programa");
	            System.out.print("\nDigite uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // limpar o buffer

	            switch (opcao) {
	                case 1:
	                    System.out.print("\nDigite o nome: ");
	                    String nome = scanner.nextLine();
	                    fila.add(nome);
	                    System.out.println("\nFila: ");
	                    for (String cliente : fila) {
	                        System.out.println(cliente);
	                    }
	                  
	                    System.out.println("\nCliente Adicionado!");
	                    break;

	                case 2:
	                    if (fila.isEmpty()) {
	                        System.out.println("\nA Fila está vazia!");
	                    } else {
	                        System.out.println("\nLista de Clientes na Fila: ");
	                        for (String cliente : fila) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;

	                case 3:
	                    if (fila.isEmpty()) {
	                        System.out.println("\nA Fila está vazia!");
	                    } else {
	                        fila.poll(); // remove o primeiro da fila
	                        System.out.println("\nFila: ");
	                        for (String cliente : fila) {
	                            System.out.println(cliente);
	                        }
	                        System.out.println("\nO Cliente foi Chamado!");
	                    }
	                    break;

	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;

	                default:
	                    System.out.println("\nOpção inválida!");
	            }

	        } while (opcao != 0);
	        
	        

	        scanner.close();
		

	}

}
