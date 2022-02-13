package com.curso.javaIntermediario.elementosBasicos.aula5;

public class EscopoReferencia {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		int valor = 10;

		System.out.println("***** Valores originais");

		System.out.println(contato);
		System.out.println(valor);

		System.out.println("***** Exemplo 1");

		testePassagemValorReferencia(valor, contato);

		System.out.println(contato);
		System.out.println(valor);

		System.out.println("***** Exemplo 2");

		testePassagemValorReferencia2(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
	}
	
	//exitem duas stacks/pilhas: da main e do m�todo. Ao chamar o m�todo, uma c�pia
	//dos valores � feita e variaveis valor e contato sao criadas com escopo do m�todo
	//ao mudar os valores dentro do m�todo, os valores s�o mudados dentro da stack do m�todo
	//o exemplo 2 altera os valores, pq os valores apontam pra a referencia do contato no escopo da main

	private static void testePassagemValorReferencia(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato" + novoValor);
	}

}
