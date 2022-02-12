package com.curso.javaIntermediario.enumeradores.aula2;

public class Formulario {
	
	//qdo for para uso especifico, tbm pode declarar enum dentro da classe 
	//e utiliza-lo ali

	enum Genero {
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
	}

	private String nome;
	private Genero genero;
	
}
