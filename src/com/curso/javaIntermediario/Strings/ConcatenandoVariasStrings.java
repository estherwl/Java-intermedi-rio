package com.curso.javaIntermediario.Strings;

public class ConcatenandoVariasStrings {

	public static void main(String[] args) {
		
		//Não é uma boa prática, pois cria e descarta nova string a cada concatenação
		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		for (String letra : letras) {
			alfabeto += letra;
		}

		System.out.println(alfabeto);
		
		//uma melhor prática, criar uma coleção de strings, adiciona por apend 
		//e no final fica uma string única, através do toString()
		//StringBuffer possui vários métodos
		//Se for trabalhar com threads, usar StringBuffer
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}
		alfabeto = sb.toString();

		System.out.println(alfabeto);

		alfabeto = new String(sb);
		System.out.println(alfabeto);

		System.out.println(sb.reverse());

		//funciona da mesma forma que o StringBuffer, porém o 
		//StringBuffer é thread safe
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();

		System.out.println(alfabeto);

	}

}
