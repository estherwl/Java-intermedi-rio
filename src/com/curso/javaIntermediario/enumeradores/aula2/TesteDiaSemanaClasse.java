package com.curso.javaIntermediario.enumeradores.aula2;

public class TesteDiaSemanaClasse {

	public static void main(String[] args) {
		
		DiaSemanaClasse dia = DiaSemanaClasse.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(1, 4, 2016, DiaSemanaClasse.SEXTA);
		
		System.out.println(data);

	}

}
