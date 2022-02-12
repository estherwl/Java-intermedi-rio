package com.curso.javaIntermediario.enumeradores.exercicioCalculadora;

public class Calculadora {

	public static void main(String[] args) {
		
		double x = 2.0;
		double y = 3.0;
		
		for(Operacao op : Operacao.values()) {
			System.out.println(x + " " + op.toString() + " " + y + 
					" = " + op.executarOperacao(x, y));
		}

	}

}
