package com.curso.javaIntermediario.elementosBasicos.aula4;

public class Teste {

	public static void main(String[] args) {

		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);

		System.out.println(escopo.getValor()); // 10

		System.out.println(escopo.calculaValor(20)); // 30

		System.out.println(escopo.getValor()); // 10 pq calcula valor nao altera atributo valor

		System.out.println(escopo.teste()); // 4 pq metodo tem varivel local valor sendo decrementada

		System.out.println(escopo.getValor()); //10
	}

}
