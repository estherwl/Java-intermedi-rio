package com.curso.javaIntermediario.classesUtilitarias;

import java.util.Random;

public class Aula15NumerosAleatorios {

	public static void main(String[] args) {

		//0 a 10, 100 1000, etc:
		System.out.println(Math.floor(Math.random() * 100));

		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt());
		
		//Para numeros mais especificos:
		//1 a 5 (5 + 1, se quiser incluir o 5 tbm)
		System.out.println(aleatorio.nextInt(5 + 1));

	}

}
