package com.curso.javaIntermediario.enumeradores.aula2;

public enum DiaSemanaClasse {
	
	//usando enum como classe

	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), 
	SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	DiaSemanaClasse(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}
}

