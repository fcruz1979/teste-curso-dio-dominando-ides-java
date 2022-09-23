package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroProgramaQuebec {
	
	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! "+ (a+b));*/
		
	}

}

/*Supondo que precisamos criar uma nova classe nesse mesmo arquivo, 
 * como exemplo abaixo "class Livros". Note que essa nova class está
 * forma do bloco do "primeiroProgramaQuebec". estando essa nova class
 * dentro do mesmo arquivo, não é preciso fazer novamente a importação.  
 * basta apenas criar uma nova variavel:Livros livros = new Livros ();     */


class Livros {
	private String nome;
	private String npag;
	
}