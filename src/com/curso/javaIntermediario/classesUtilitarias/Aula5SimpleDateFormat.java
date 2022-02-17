package com.curso.javaIntermediario.classesUtilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula5SimpleDateFormat {

	public static void main(String[] args) {

		//construtor pode usar varias formas, consultar documentação!
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");

		//GregorianCalendar - data especifica, Calendar.getInstance para hoje
		Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);

		System.out.println(sdf.format(data.getTime()));//getTime retorna instancia da classe Date

		Date hoje = new Date();

		System.out.println(sdf.format(hoje));

		String d = sdf.format(hoje);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";

		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);//passar string para Date, atentar que parse pode lançar exceção

			System.out.println(minhaDataEmDate);

			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
