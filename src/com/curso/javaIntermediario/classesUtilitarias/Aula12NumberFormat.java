package com.curso.javaIntermediario.classesUtilitarias;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

//Para formatar numeros, mas nao se é necessário tanta precisão
public class Aula12NumberFormat {

	public static void main(String[] args) throws ParseException {

		// 1.000,00 - Brasil
		// 1,000.00 - EUA

		Locale en = new Locale("en", "United States");
		NumberFormat nf = NumberFormat.getInstance(en);

		String num = nf.format(100.99);
		System.out.println(num);

		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		num = nf.format(100.99);
		System.out.println(num);

		// MOEDA - caso precise de precisão, usar DecimalFormat
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());

		String valor = moeda.format(100.99);
		System.out.println(valor);

		Currency currency = moeda.getCurrency();
		System.out.println(currency);

		// PORCENTAGEM
		NumberFormat porcent = NumberFormat.getPercentInstance(); //getPercentInstance() - locale padrão
		String porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);

		porcent.setMaximumIntegerDigits(7); //max casas inteiras
		porcent.setMinimumIntegerDigits(5); //min casas inteiras

		porcent.setMaximumFractionDigits(2); //max casa decimais
		porcent.setMinimumFractionDigits(1); //min casas decimais

		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);

		// ARREDONDAMENTO

		nf = NumberFormat.getInstance(Locale.getDefault());

		nf.setRoundingMode(RoundingMode.UP); //arredona pra cima
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50));

		Number num3 = nf.parse("100.00"); //ponto é entendido por milhar na locale br
		System.out.println(num3.intValue());
		
		nf = NumberFormat.getInstance(Locale.ENGLISH);		
		Number num4 = nf.parse("100.00"); //ponto é entendido por decimal na locale us
		System.out.println(num4.intValue());
	}

}
