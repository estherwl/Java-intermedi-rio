package com.curso.javaIntermediario.elementosBasicos.aula1;

public class TesteWrapper {

	public static void main(String[] args) {

		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'a';
		
		//Classes wrappers:
		Short num7 = new Short((short) 1); //construtor não utilizado a partir java 9
		Byte num8 = ((byte) 10); //autoboxing
		Integer num9 = 100;
		Long num10 = 10000l;
		Float num11 = 3.5f;
		Double num12 = 3.5555;
		Boolean flag2 = true;
		Character b = 'b';

		Integer num13 = Integer.valueOf("100"); // NumberFormatException se string nao for num

		Double num14 = Double.parseDouble("3.5");//transforma string em double
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());

		Long num15 = num13.longValue();

		int num16 = Integer.parseInt("100000"); 

		Integer num18 = Integer.valueOf(1343);//transforma num primitivo em instancia da classe Integer
		System.out.println(num18);

		System.out.println(num9 == num13); // == não funciona com wrappers - false
	}
}
