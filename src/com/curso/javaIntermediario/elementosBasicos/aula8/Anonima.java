package com.curso.javaIntermediario.elementosBasicos.aula8;

//Classe anonima: qdo instancia a classe e muda o comportamento ao instanciar
//muito utilizado com Collections, para comparar objetos por exemplo

public class Anonima {

	public void imprimeTexto() {
		System.out.println("qualquer texto");
	}

	public static void main(String[] args) {

		Anonima anonima = new Anonima() {
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};

		anonima.imprimeTexto();

		// usando interface
		Texto texto = new Texto() {
			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};

		texto.imprimeTexto();
	}

}
