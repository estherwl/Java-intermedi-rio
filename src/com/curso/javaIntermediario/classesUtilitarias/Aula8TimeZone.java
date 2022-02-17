package com.curso.javaIntermediario.classesUtilitarias;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//Trabalhar com fuso horário
public class Aula8TimeZone {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();//data atual
		TimeZone tz = calendar.getTimeZone();//fuso horário da data atual

		System.out.println(tz); 

//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso: fusos) {
//			System.out.println(fuso); //imprime todos fusos
//		}

		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");

		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());

		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));

		Calendar agoraSP = Calendar.getInstance(tzSP);
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));

		//offset é negativo precisa multiplicar por -1 para obter horário correto
		agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60 * -1);
		System.out.println(sdf.format(agoraSP.getTime()));

	}

}
