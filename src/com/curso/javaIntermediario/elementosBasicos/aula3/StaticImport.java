package com.curso.javaIntermediario.elementosBasicos.aula3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; tbm pode importar dessa forma, mas nao é mto usado

public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;
		
		//metodos estaticos = nao precisa instanciar para usar os metodos
		//ex, metodos classe Math
		System.out.println(Math.pow(a, b));//potencia

		System.out.println(Math.sqrt(c));//raiz quadrada

		System.out.println(pow(a, b));

		System.out.println(sqrt(c));

	}

}
