package com.curso.javaIntermediario.Strings;

public class CriandoStrings {

	public static void main(String[] args) {
		
		//Cada string criada com new está sendo alocada em um espaço de
		//memória diferente

		String vazia = new String(); // ""
		System.out.println(vazia);

		String java = new String("JAVA");
		System.out.println(java);

		String java1 = new String(java);
		System.out.println(java1);

		char[] charsJava = { 'J', 'A', 'V', 'A' };
		String java2 = new String(charsJava);
		System.out.println(java2);

		char[] abcdef = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String abc = new String(abcdef, 0, 3);
		System.out.println(abc);

		byte[] ascii = { 65, 66, 67, 68, 69 };
		String abcde = new String(ascii);
		System.out.println(abcde);

		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		//Ao fazer atribuição simples, as referências apontam para o mesmo 
		//espaço de memória, pois verificou que string já existe no pool (local de armazenamento diferente das cridas com new)
		//Obs: Java é case sensitive, então "java" != "Java"
		String java3 = "JAVA";
		String java4 = "JAVA";

		System.out.println(java3);
		System.out.println(java4);
	}

}
