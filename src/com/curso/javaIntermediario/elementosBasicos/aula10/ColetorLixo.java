package com.curso.javaIntermediario.elementosBasicos.aula10;

import com.curso.javaIntermediario.elementosBasicos.aula5.Contato;

public class ColetorLixo {

	public static void obterMemoriaUsada() {

		final int MB = 1024 * 1024;

		Runtime runtime = Runtime.getRuntime(); // padr�o singleton

		System.out.println("Mem�ria utilizada pelo programa: " + (runtime.totalMemory() - runtime.freeMemory()) / MB + " MB");

	}

	public static void main(String[] args) {

		Contato[] contatos = new Contato[100000];
		Contato contato;

		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" + i, "1234-56789" + i, "contato" + i + "@email.com");
			contatos[i] = contato;
		}

		System.out.println("Contatos criados");

		obterMemoriaUsada();

		contatos = null;

		Runtime.getRuntime().runFinalization();

		Runtime.getRuntime().gc();

		System.out.println("Contatos removidos da mem�ria");

		obterMemoriaUsada();
	}

}
