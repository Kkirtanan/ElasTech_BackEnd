package aulas_java;

import java.util.Scanner;

public class AtividadeLoops {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// 1. A Tabuada Personalizada
		
		/*System.out.println("Qual tabuada você deseja gerar, digite de 1 a 10: ");
		int tabuada = leitor.nextInt();
		
		for (int i = 0; i <=10; i++) {
			System.out.println(i+" X "+tabuada+" = "+i*tabuada);
		}*/
		
		
		// 2. Soma dos Números Pares
		
		/*int soma = 0; 
		for (int i=1;i<=100;i++) {
			if (i % 2 == 0) {
				soma += i ;
			}
		}
		System.out.println(soma);*/
		
		
		// 3. Validação de Entrada
		/*int idade;
		do {
			System.out.println("Informe a sua idade: ");
			idade = leitor.nextInt();
		} while (idade < 0 || idade > 100);
		System.out.println("Idade registrada!");*/
		
		
		// 4. Contagem regressiva de 10 a 1 (while)
		
		/*int i = 11;
		while (i>1) {
			i--;
			System.out.println(i);
		}*/
		
		
		// 5. Somar números até que o usuário digite 0 (do-while)
		
		/*int numero;
		int soma = 0;
		do {
			System.out.println("Digite um número para somar, \nDigite 0 para encerrar: ");
			numero = leitor.nextInt();
			soma = soma + numero;
			System.out.println("O valor total da soma é: "+soma);
		} while (numero != 0);*/
		
		//DESAFIOS:
		
		//1. Sequência de Fibonacci
		
		/*int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i=1;i<=13;i++) {
			 n3 = n1+n2;
			 System.out.println(n3);
			 n1 = n2;
			 n2 = n3;
		}*/
		
		
		//2. Desenhando um Triângulo de Asteriscos
		
		/*String asterisco = "*";
		String linha = asterisco;

		for (int i = 1;i<=10;i++) {
			System.out.println(linha);
			linha = linha + asterisco;
		}*/
	
		// 3. Soma de Compras até Parar
		
		/*float valor = 1;
		float soma = 0;
		
		while ( valor != 0 ) {
			System.out.println("Informe o valor do próximo produto \nDigite 0 para parar:");
			valor = leitor.nextFloat();
			soma += valor;
		}
		
		String total = String.format("O valor total da compra é: R$ %.2f", soma);
		System.out.println(total);*/
		
		
		// 4. Adivinhe o Número Secreto
		
		/*int numeroSecreto = new java.util.Random().nextInt(100) + 1;
		int tentativa = -1;
		
		while (tentativa != numeroSecreto) {
			System.out.println("Digite um número entre 1 e 100 para tentar advinhas o número sorteado: ");
			tentativa = leitor.nextInt();
			if (tentativa > numeroSecreto) {
				System.out.println("O néumro sorteado é menor do que o seu palpite. ");
			} else if (tentativa < numeroSecreto && tentativa != numeroSecreto) {
				System.out.println("O néumro sorteado é maior do que o seu palpite. ");
			}
		}
		
	System.out.println("Parabéns, você advinhou o número!!! ");*/
		
		//5. Verificador de Número Primo
		
		System.out.println("Digite um número inteiro, maior do que 1 e que seja primo: ");
		int num = leitor.nextInt();
		double raizQuad = Math.sqrt(num);
		
		for ( int i = 2; i < raizQuad ; i++ ) {
			if (num > 1 && num % i == 0) {
				System.out.println("Tente novamente, "+num+" não é um número primo.");
			} else if (num < 1 && num % i == 0) {
				System.out.println("Informe um número válido.");
			} else {
				System.out.println("Parabéns, "+num+" é um número primo!");
			}
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		leitor.close();

	}

}
