package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}
		
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
  
		//Excluir elemento
		frutas.remove("Morango");
		
		//Criar um Iterator
		Iterator<String> ifrutas = frutas.iterator();
		
		//listar os dados após a exclusão de um elemento
		while(ifrutas.hasNext()) {
			System.out.println(ifrutas.next());
		}
		
		//Criei um ArrayList e adiciono os elementos do Set nele
		ArrayList<String> frutasList = new ArrayList<String>();
		frutasList.addAll(frutas);
		
		//ordenar os dados em ordem crescente
		frutasList.sort(null);
		
		System.out.println("Exibir os dados do Array List ordenados");
		frutasList.forEach(System.out::println);
	}

}
