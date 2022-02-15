package com.curso.javaIntermediario.threads.aula1;

//Uma das formas de criar uma thread é extender a classe Thread:

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start(); //inicia o metodo run
	}

	//run: executa a tarefa da thread
	public void run() {

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) { //exceção q pode ser gerada pelo sleep
			e.printStackTrace();
		}

		System.out.println(nome + " terminou a execução");
	}

}