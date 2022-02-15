package com.curso.javaIntermediario.threads.aula6;

public class TiqueTaque {

	boolean tique;
	
	//bloco precisa ser synchronized para usar metodos wait, notify, etc
	synchronized void tique(boolean estaExecutando) {

		if (!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();

		try {
			while (tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void taque(boolean estaExecutando) {

		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");

		tique = false;

		notify();

		try {
			while (!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
