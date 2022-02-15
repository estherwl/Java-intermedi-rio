package com.curso.javaIntermediario.Strings;

public class ModificandoStrings {

	public static void main(String[] args) {

		String teste = "Isso é um teste.";

		System.out.println(teste);
		System.out.println(teste.substring(10)); // imprime do indice 10 em diante
		System.out.println(teste.substring(10, 15)); // indice 10 a 14

		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); // ola + mundo
		System.out.println(olaMundo);

		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);

		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);

		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());// retira espaços inicio e final da string

	}

}
