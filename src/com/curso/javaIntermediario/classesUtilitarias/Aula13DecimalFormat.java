package com.curso.javaIntermediario.classesUtilitarias;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

//decimalFormat é filha da NumberFormat 
//Indicada para formatar numeros com precisão
public class Aula13DecimalFormat {

	public static void main(String[] args) {
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);	

		String padrao = "###,###.##";//doc mostra opções
		DecimalFormat df = new DecimalFormat(padrao, symbols); //symbols para alterar locale e aceitar o padrao com virgula nos milhares
		//DecimalFormat df = new DecimalFormat(padrao); locale parão
		//df.applyPattern(padrao); outra forma de definir padrão com locale default
		
		System.out.println(df.format(1234567890.123));

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');

		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(1234567890.123));

		String padrao3 = "###,###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4); //agrupados a cada 4 num
		System.out.println(df.format(1234567890.123));

		String padrao4 = "\u00A4###,###,000.00%";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));

	}

}
