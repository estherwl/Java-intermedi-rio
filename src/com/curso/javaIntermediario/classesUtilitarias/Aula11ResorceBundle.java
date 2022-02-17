package com.curso.javaIntermediario.classesUtilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

//usado qdo texto varia dependendo do locale
public class Aula11ResorceBundle {

	public static void main(String[] args) {

		System.out.println("Locale atual " + Locale.getDefault());
		Locale.setDefault(new Locale("en_BR", "en_BR"));
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

		System.out.println("Hello EN: " + rb.getString("hello"));
		System.out.println("World EN: " + rb.getString("world"));

		// Locale.setDefault(new Locale("pt_BR", "pt_BR"));
		rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR"));

		System.out.println("Olá pt_BR: " + rb.getString("hello"));
		System.out.println("Mundo pt_BR: " + rb.getString("world"));

	}

}
