package com.curso.javaIntermediario.elementosBasicos.aula7;

public class TestePrintf {

	public static void main(String[] args) {
		
		//System.out.printf("formato-string", [arg1, arg2, arg3]); mesma função que sysout abaixo:
		//System.out.format("formato-string", [arg1, arg2, arg3]);
		
		//% seguido de mais um simbolo indica qual formato do argumento

		System.out.printf("%s", "Olá, Mundo!"); // %s indica string
		System.out.println();
		System.out.printf("%S", "Olá, Mundo!"); // %S string fica em letra maiuscula
		System.out.println();

		System.out.printf("%c", 'c'); // caracter
		System.out.println();
		System.out.printf("%C", 'c'); // caracter com letra maiuscula

		System.out.printf("%n"); // pula linha, com printf /n não é uma boa prática para pular linha

		int valor = 123456789;
		System.out.printf("%d", valor); // numeros inteiros

		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); // ponto flutuante arredondado

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); // limita saida a 20 caracteres e alinha a direita

		System.out.println();

		System.out.printf("%-20s", olaMundo); // limita saida a 20 caracteres e alinha a esquerda

		System.out.println();

		System.out.printf("%+d", valor); //indica o sinal do numero, se é positivo ou negativo

		System.out.println();

		System.out.printf("%015d", valor); // inteiro precisa ter 15 digitos, se nao tiver, completa com zeros  

		System.out.println();

		System.out.printf("%,d", valor); // separa com . os milhares

		System.out.println();

		int valor2 = -123456789;
		System.out.printf("% d", valor2); // imprime sinal se for negativo
		System.out.println();
		System.out.printf("% d", valor);

		System.out.println();

		System.out.printf("%.3f", pontoFlutuante); // 3 casas decimais 

		System.out.println();

		System.out.printf("R$%10.2f", pontoFlutuante); // 10 digitos decimais, 2 flutuantes

		System.out.println();

		testeMaisCompleto();
	}

	private static void testeMaisCompleto() {

		double[] precos = { 10000, 123.54, 7843.567, 1, 4.56789 };

		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}

		// Java.util.Formater - classe com a mesma função do printf
	}

}
