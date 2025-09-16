package aulas_java;

import java.util.Stack;
import java.util.Scanner;


public class JavaCollectionsStack {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// 1. Organizando uma Pilha de Livros
		
		/*Stack<String> pilhaDeLivros = new Stack<>();
		
		pilhaDeLivros.push("O Senhor dos Anéis");
		pilhaDeLivros.push("O Hobbit");
		pilhaDeLivros.push("Silmarillion");
		
		String livroRetirado = pilhaDeLivros.pop();
		System.out.println("Livro retirado: "+livroRetirado);
		System.out.println("Ainda restam os livros: "+pilhaDeLivros);
		livroRetirado = pilhaDeLivros.pop();
		System.out.println("Livro retirado: "+livroRetirado);
		System.out.println("Ainda restam os livros: "+pilhaDeLivros);
		livroRetirado = pilhaDeLivros.pop();
		System.out.println("Livro retirado: "+livroRetirado);
		System.out.println("Ainda restam os livros: "+pilhaDeLivros);*/
		
		
		// 2. Invertendo uma Palavra
		
		/*Stack<String> pilhaDePalavra = new Stack<>();
		Stack<String> novaPilhaDePalavra = new Stack<>();
		String [] palavra = {"J","A","V","A"};
		
		for (String letra : palavra) {
			
			pilhaDePalavra.push(letra);
			System.out.println("Empilhando: "+letra);
			
		}
		
		System.out.println("Pilha: "+pilhaDePalavra);
		
		for (int i = 0; i <= palavra.length-1 ; i++ ) {
			
			String letraRetirada = pilhaDePalavra.pop();
			System.out.println("Desempilhando: "+letraRetirada);
			novaPilhaDePalavra.push(letraRetirada);
			
		}
		
		System.out.println("Nova pilha: "+novaPilhaDePalavra);*/
		
		
		// 3. Simples Histórico de Navegação
		
		/*Stack<String> historico = new Stack<>();
		
		historico.push("https://www.google.com/search?q=google.com");
		historico.push("oracle.com");
		historico.push("github.com");
		
		System.out.println("Página atual: "+historico.peek());
		
		System.out.println("\nvoltar página");
		historico.pop();
		System.out.println("Página atual: "+historico.peek());
		
		System.out.println("\nvoltar página");
		historico.pop();
		System.out.println("Página atual: "+historico.peek());*/
		
		
		
		// 4. Desempilhando Pratos
		
		
		
		
		
		leitor.close();
	}

}
