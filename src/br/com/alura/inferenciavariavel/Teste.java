package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {		
	
	//What is new in Java 10 - Variable Inference
	public static void main(String[] args) {
		
		//HashMap<String,String> cpfPorNomes = new HashMap<String,String>();
		var cpfPorNomes = new HashMap<String, String>();
		
		cpfPorNomes.put("Leandro","078");		
		System.out.println(cpfPorNomes);
	}

}
