package com.curso.javaIntermediario.Strings;

public class ConcatenandoVariasStrings {

	public static void main(String[] args) {
		
		//N�o � uma boa pr�tica, pois cria e descarta nova string a cada concatena��o
		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		for (String letra : letras) {
			alfabeto += letra;
		}

		System.out.println(alfabeto);
		
		//uma melhor pr�tica, criar uma cole��o de strings, adiciona por apend 
		//e no final fica uma string �nica, atrav�s do toString()
		//StringBuffer possui v�rios m�todos
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

		//funciona da mesma forma que o StringBuffer, por�m o 
		//StringBuffer � thread safe
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();

		System.out.println(alfabeto);

	}

}
