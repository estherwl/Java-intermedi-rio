package com.curso.javaIntermediario.threads.aula4;

import com.curso.javaIntermediario.threads.aula3.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thred1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thred2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thred3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(thred1);
		Thread t2 = new Thread(thred2);
		Thread t3 = new Thread(thred3);

		t1.setPriority(5); //numero maior, maior prioridade (nem sempre prioridade � cumprida)
		t2.setPriority(3);
		t3.setPriority(1);

		// t1.setPriority(Thread.NORM_PRIORITY); op��o ao inves de numero para representar prioridade

		t1.start();
		t2.start();
		t3.start();
	}

}
