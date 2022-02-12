package com.curso.javaIntermediario.enumeradores.aula3;

import com.curso.javaIntermediario.enumeradores.aula1.DiaSemana;

public class TesteEnum {

public static void main(String[] args) {
	
		//para obter valores do enum:
		
		DiaSemana[] dias = DiaSemana.values();

		for (int i=0; i<dias.length; i++){
			System.out.println(dias[i]);
		}
		
		for (DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);
		}
		
		
	}
}
