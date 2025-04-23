package aula_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		//Adicionando elementos na coleção
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(9.0);
		
		System.out.println("Digite um número real: ");
		double input = scan.nextDouble();
		
		numeros.add(input);
		
		//Listando os valores da Coleção 
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Indice do numero 9.0: " + numeros.indexOf(9.0));
		
		System.out.println("Indice numero 9.0 existe na coleção? " + numeros.contains(9.0));
		
		System.out.println("Qual valor está armazenado no índice 2? " + numeros.get(2));
		
		//alterar o valor de um elemento
		numeros.set(2, 10.0);
		
		//Exibe os dados atualizados, através do método forEach
		System.out.println("Exibes os dados depois da atualização: ");
		numeros.forEach(System.out::println);
		
		//Remover um elemento da lista, passando o índice
		numeros.remove(2);
		
		//Encontrando o indice e removendo
		numeros.remove(numeros.indexOf(2.0));
		
		System.out.println("Exibes os dados depois da exclusão: ");
		numeros.forEach(System.out::println);
		
		// Ordenar a Coleção
		numeros.sort(null);
		System.out.println("Exibes os dados ordenados em ordem crescente: ");
		numeros.forEach(System.out::println);
		
		//ordenar em ordem decrescente
		numeros.sort(Comparator.reverseOrder());
		System.out.println("Exibes os dados ordenados em ordem decrescente: ");
		numeros.forEach(System.out::println);
		
		
		System.out.println("Qual é o tamanho da coleção? " + numeros.size());
		
		// Limpar a Coleção
//		numeros.clear();
		
		System.out.println("A coleção está vazia? " + numeros.isEmpty());
		
		scan.close();
	}

}
