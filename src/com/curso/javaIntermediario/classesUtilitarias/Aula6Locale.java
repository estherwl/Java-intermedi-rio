package com.curso.javaIntermediario.classesUtilitarias;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula6Locale {

	public static void main(String[] args) {

		// dd/MM/yyyy / 02/01/2000 BR
		// MM/dd/yyyy / 01-fev/2000 USA

		// 1.000,02 BR
		// 1,000.02 USA

		Locale locale = Locale.getDefault(); //locale padrão do meu pc

		System.out.println(locale);

		Locale[] locales = Locale.getAvailableLocales(); //todos locales disponiveis na API 
		for (Locale loc : locales) {

			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cod País: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());

			System.out.println("*******************");

		}

		Locale br = new Locale("pt", "Brazil");

		System.out.println(br);

		Locale.setDefault(br); //mudar locale padrão

		System.out.println(Locale.getDefault());

		//Formata moeda de acordo com locale 
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d));

		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000000d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println(nf3.format(5000000000d));


	}

}
