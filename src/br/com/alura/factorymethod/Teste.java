package br.com.alura.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	//What is new in Java 9 - Factory Method to Collection
	public static void main(String[] args) {
		List<String> nomes = List.of("primeiroNome","segundoNome","rerceiroNome");		
		System.out.println(nomes);		
		System.out.println(Set.of("terceiroNome"));
		System.out.println(Map.of("nome","João"));
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");		
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);		
		System.out.println(nomesImutavel);
		*/
	}

}