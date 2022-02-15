package com.curso.javaIntermediario.Strings;

public class FazendoBuscas {

	public static void main(String[] args) {

		String banana = "banana";
		String ana = "ana";
		
		//Retorna indice do caracter ou -1 se o mesmo não existe
		System.out.println(banana.indexOf('x'));
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		
		//retorna indice da primeira vez que ana aparece na string
		System.out.println(banana.indexOf(ana));

		System.out.println(banana.lastIndexOf('a'));
		System.out.println(banana.lastIndexOf(ana));

		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("ceu"));

	}

}
