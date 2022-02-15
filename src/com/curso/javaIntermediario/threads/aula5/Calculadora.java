package com.curso.javaIntermediario.threads.aula5;

public class Calculadora {

	private int soma;

	//synchronized para que cada trhead acesse um recurso por vez, pq se n�o as duas threads estar�o compartilhando a variavel soma 
	//da classe Calculadora, o que gera um resultado errado
	
	public synchronized int somaArray(int[] array) {

		soma = 0;

		for (int i = 0; i < array.length; i++) {

			soma += array[i];

			System.out.println("Executando a soma " + Thread.currentThread().getName() + " somando o valor " + array[i]
					+ " com total de " + soma);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		return soma;
	}

}
