package com.curso.javaIntermediario.elementosBasicos.aula6;

public class TesteVarargs {

	// varargs - permite passar infinitos parametros em um
	// metodo sem serem declarados

	public static void main(String[] args) {

		System.out.println(soma(1, 2));
		System.out.println(soma(1, 2, 3));

		int[] vetor = { 1, 2, 3, 4, 5 };
		System.out.println(soma(vetor));

		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	//como normalmente é:
	static int soma(int a, int b) {
		return a + b;
	}
	
	//como normalmente é:
	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	//uma possibilidade de passar n elementos como parametro
	static int soma(int[] vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}
	
	//utilizando varargs(aceita somente parametros que sejam de classes, nesse caso Integer)
	//... indicam possibilidade de infinitos numeros
	//utiliza quando nao se sabe qtos parametros serão utilizados
	//se tiver outros parametros, varags deve ficar sempre no final
	static int soma(int a, int b, Integer... vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;

	}

}
