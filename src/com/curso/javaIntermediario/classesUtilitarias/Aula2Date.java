package com.curso.javaIntermediario.classesUtilitarias;

import java.util.Date;

public class Aula2Date {

	public static void main(String[] args) {

		Date hoje = new Date();

		System.out.println(hoje);

		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());

		System.out.println(hoje.getDate()); //depreciados, há um método mais novo e melhor para se trabalhar

	}

}
