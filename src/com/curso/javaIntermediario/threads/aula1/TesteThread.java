package com.curso.javaIntermediario.threads.aula1;

public class TesteThread {
	
	//Programa a ser executado(main) = processo, com 3 tarefas(thread, thread2 e thread3)

	public static void main(String[] args) { 

		MinhaThread thread = new MinhaThread("Thread #1", 600);
		// thread.start(); - chamado no contrutor para executar a thread

		MinhaThread thread2 = new MinhaThread("Thread #2", 900);

		MinhaThread thread3 = new MinhaThread("Thread #3", 500);

	}

}
