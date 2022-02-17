package com.curso.javaIntermediario.classesUtilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//DateFormat é abstrata, portanto não pode ser instanciada
//DateFormat é mais útil quando se trabalha com locale, se nao pode se usar o SimpleDateFormat
public class Aula7DateFormat {

	public static void main(String[] args) {

		Date hoje = new Date();

		System.out.println(Locale.getDefault());

		//getInstance: instancia de DateFormat com as configurações de formatação do locale
		String hojeFormatado = DateFormat.getInstance().format(hoje); 
		System.out.println(hojeFormatado);

		Locale.setDefault(new Locale("pt", "BR"));

		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado); //hora, min e seg

		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado); // dd/MMM/yyyy

		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);

		String data = "12/02/17 14:25";
		//string pode ser trasformada em date 
		//date pode transformar em calendar com setTiime()		
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);

			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);

			System.out.println(calendario);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
