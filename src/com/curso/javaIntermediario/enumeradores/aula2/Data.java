package com.curso.javaIntermediario.enumeradores.aula2;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private DiaSemanaClasse diaSemana;

	public Data() {
		super();
	}

	public Data(int dia, int mes, int ano, DiaSemanaClasse diaSemana) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaSemana = diaSemana;
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", diaSemana=" + diaSemana + "]";
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public DiaSemanaClasse getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(DiaSemanaClasse diaSemana) {
		this.diaSemana = diaSemana;
	}

}
