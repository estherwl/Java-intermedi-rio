package com.curso.javaIntermediario.Strings;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		//string n�o � separada em array, mas sim divida em tokens

		String doArquivo = "1;Ant�nio;30;";

		StringTokenizer st = new StringTokenizer(doArquivo, ";");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
