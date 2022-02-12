package com.curso.javaIntermediario.enumeradores.aula3;

import com.curso.javaIntermediario.enumeradores.aula1.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {

		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

		
		//avalia o valor da string ao instanciar como DiaSemana
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

		System.out.println(dia);
	}

}
