package com.curso.javaIntermediario.classesUtilitarias;

import org.apache.commons.lang3.StringUtils;

public class Aula16UsandoJars {
	
	//jars - empacotamento de biblioteca do Java
	//para compartilhar: exportar, clicando em cima do projeto
	
	//para inclur biblioteca no projeto: geralmente jar é copiado para detro de uma pasta lib
	//a qual fica na raiz do projeto
	
	//no eclipse: clicar no jar e em seguida em build path - add build path OU:
	//clica no projeto - properties - java build path - add jar

	public static void main(String[] args) {

		//StringUtils - da biblioteca Lang do apache commons
		System.out.println(StringUtils.capitalize("esther")); 

	}

}