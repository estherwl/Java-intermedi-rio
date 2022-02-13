package com.curso.javaIntermediario.elementosBasicos.aula2;

public class TesteAutoboxing {

	public static void main(String[] args) {

		// autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l; // new Long(10000l);
		Float num11 = 3.5f; // new Float(3.5f);
		Double num12 = 2.55555;
		Boolean flag2 = true;
		Character b_ = 'b';

		// auto un-boxing (valor de uma classe em primitivo)
		int num13 = num9; // num9.intValue();

		// autoboxing em expressões
		num9++;

		System.out.println(num9);

		// auto unboxing num9 -> autoboxing da expressao num13/num9 -> num14
		Integer num14 = num13 / num9;

		// mau uso - se trabalhar manipular mto as informações
		//melhor usar diretamento os tipos primitivos ao inves de wrappers
		//e se for necessario só final fazer autoboxing para wrapper
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;

		Double media = (a + b + c) / 3;
		System.out.println(media);

	}

}
