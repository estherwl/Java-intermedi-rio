package com.curso.javaIntermediario.threads.aula3;

public class Teste2 {
	
	//Join - melhor opção para esperar a finalização da thread
	//espera as 3 tarefas finalizarem, para após finalizar o programa

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 700);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();

		/*
		 * try { t1.join(200); } catch (InterruptedException e) { e.printStackTrace(); }
		 */

		t2.start();

		/*
		 * try { t2.join();
		 */

		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Programa finalizado");
	}

}
