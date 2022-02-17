package com.curso.javaIntermediario.classesUtilitarias;

//Classe Math: funções exponenciais, funções trigonométricas, 
//funções de arredondamento, entre outras...

public class Aula1Math {

	public static void main(String[] args) {

		System.out.println(Math.pow(2, 3)); //2^3

		System.out.println(Math.round(4.7)); //arredonda pra 5

		System.out.println(Math.round(4.4)); //arredonda pra 4

		System.out.println(Math.ceil(4.4)); //arredonda pra 5

		System.out.println(Math.ceil(4.7)); //arredonda pra 5

		System.out.println(Math.floor(4.4)); //arredonda pra 4

		System.out.println(Math.floor(4.7)); //arredonda pra 4

		System.out.println(Math.round(Math.random() * 100)); //aleatório

		System.out.println(Math.sin(Math.toRadians(30))); //seno

		System.out.println(Math.cos(Math.toRadians(1))); //cosseno

		System.out.println(Math.tan(Math.toRadians(45))); //tangente

	}

}
