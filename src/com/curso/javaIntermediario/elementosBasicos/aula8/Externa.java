package com.curso.javaIntermediario.elementosBasicos.aula8;

//Classe aninhada interna - classes que ser�o utilizadas somente dentro
//da classe "externa"
//Comum de usar com Hibernate/JPA (chave prim�ria composta)

public class Externa {

	private String texto = "texto externo";

	public class Interna {

		private String texto = "texto interno";

		public void imprimeTexto() {
			System.out.println(texto);

			// consegue ver membros da classe externa
			System.out.println(Externa.this.texto);
		}
	}

	public static void main(String[] args) {

		Externa externa = new Externa();
		Interna interna = externa.new Interna();

		interna.imprimeTexto();
	}

}
