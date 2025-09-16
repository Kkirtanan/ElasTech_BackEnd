package aulas_java;

import java.util.*;



public class AtividadeRevisaoJava {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Exercício 1 – Declaração e uso de variáveis 
		
		/*System.out.println("Informe seu nome: ");
		String nome = leitor.next();
		System.out.println("Informe sua idade: ");
		int idade = leitor.nextInt();
		System.out.println("Informe sua altura: ");
		double altura = leitor.nextDouble();*/
		
		
		// Exercício 2 – Operações Aritméticas 
		
		/*System.out.println("digite o primeiro número: ");
		int n1 = leitor.nextInt();
		System.out.println("digite o segundo número: ");
		int n2 = leitor.nextInt();
		
		int soma = n1+n2;
		int subtracao = n1-n2;
		int multiplicacao = n1*n2;
		int divisao = n1/n2;
		
		System.out.println("A soma dos número é: "+soma+" , a subtração é: "+subtracao+" , a multiplicação é: "+multiplicacao+" , a divisão é: "+divisao);*/
		
		
		// Exercício 3 – Condicional IF/ELSE 

		/*System.out.println("Informe a sua idade: ");
		int idade = leitor.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else if (idade < 0) {
			System.out.println("Núemro inválido!");
		} else {
			System.out.println("Você é menor de idade.");
		}*/
		
		
		// Exercício 4 – Switch 
		
		/*System.out.println("Digite um número de 1 a 7: ");
		int dia = leitor.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Valor inválido!");
		}*/
		
		
		// Exercício 5 – Loop FOR
		
		/*for (int i = 1; i<= 20; i++) {
			if (i%2 == 0) {
				System.out.println(i+" é par ");
			} else {
				System.out.println(i+" é impar ");
			}
		}*/
		
		
		// Exercício 6 – Loop WHILE
		
		/*double numero;
		double soma = 0;
		
		do {
		System.out.println("Digite um número para somar \nDigite 0 para finalizar a soma: ");
		numero = leitor.nextDouble();
		soma += numero;
		} while (numero != 0);
		
		System.out.println("A soma dos valores digitados é: "+soma);*/
		
		
		// Exercício 7 – Arrays 
		
		/*int [] numeros = new int [5];
		int soma = 0;
		
		for (int i = 0; i <= 4; i++) {
		System.out.println("Informe um número: ");
		numeros[i] = leitor.nextInt();
		soma += numeros[i];
		}
		
		System.out.println(Arrays.toString(numeros));
		System.out.println("A soma dos números inseridos é: "+soma);*/
		
		
		// Exercício 8 – ArrayList 
		
		/*ArrayList<String> nomes = new ArrayList<>();
		String nome = "";
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe um nome: ");
			nome = leitor.nextLine();
			nomes.add(nome);
		}
		System.out.println(nomes);
		
		System.out.println("Informe o nome que deseja verificar: ");
		String temNome = leitor.nextLine();
		
		if (nomes.contains(temNome)) {
			System.out.println("Sim, a lista contém o nome: "+temNome);
		} else {
			System.out.println("Não, a lista  não contém o nome: "+temNome);
		}*/
		
		
		// Exercício 9 – IF + LOOP + ARRAY 

		/*int [] numeros = {4,5,6,10,89,58,63,55,98,91};
		ArrayList<Integer> maiorQue50 = new ArrayList<>();
		
		for (int numero : numeros) {
			if (numero >= 50) {
				maiorQue50.add(numero);
			}
		}
		System.out.println(maiorQue50);*/
		

		// Atividade 10 – Sistema de Conta Bancária (Usando todos os conceitos vistos até agora)
		
	/*	int opcao = 0;
		int totalDeContas = 0;
		int consultaDeConta = 0;
		int indiceDaConta = 0;
		int numeroDeConta = 0;
		String nomeDoTitular = "";
		String resposta = "";
		double saldoAtual = 0;
		double novoDeposito = 0;
		double novoSaque = 0;
		
		ArrayList<Integer> numerosDeConta = new ArrayList<>();
		ArrayList<String> nomesDosTitulares = new ArrayList<>();
		ArrayList<Double> saldosDasContas = new ArrayList<>();
		
		while (opcao != 6) {
			
			System.out.println("\n===== MENU BANCO =====\n"
					+ "1 - Criar nova conta\n"
					+ "2 - Depositar\n"
					+ "3 - Sacar\n"
					+ "4 - Ver saldo de uma conta\n"
					+ "5 - Listar todas as contas\n"
					+ "6 - Sair\n"
					+ "Escolha uma opção: ");
			opcao = leitor.nextInt();
			
			leitor.nextLine(); // limpar o \n que ficou armazenado no buffer.
			
			switch (opcao) {
			case 1:
				totalDeContas += 1;
					
				System.out.println("Informe o nome do titular: ");
				nomeDoTitular = leitor.nextLine();
					
				
				numerosDeConta.add(totalDeContas);
				nomesDosTitulares.add(nomeDoTitular);
				saldosDasContas.add(saldoAtual);
				
				System.out.println("Foi criada a conta de "+nomeDoTitular+" , número de conta: "+totalDeContas);
				
				break;
				
			case 2:
				System.out.println("Informe o núemro da conta para a qual deseja realizar o depósito: ");
				consultaDeConta = leitor.nextInt();
				System.out.println("Informe o valor do depósito: ");
				novoDeposito = leitor.nextDouble();
				
				if (numerosDeConta.contains(consultaDeConta)) {
					
					saldoAtual += novoDeposito;
					indiceDaConta = numerosDeConta.indexOf(consultaDeConta);
					saldosDasContas.set(indiceDaConta, saldoAtual);
					resposta = String.format("O novo saldo da conta %d é R$ %.2f",consultaDeConta,saldoAtual);
					System.out.println(resposta);
					
					saldoAtual = 0; // zera a variável para novas operações.
					
				} else {
					System.out.println("Conta inválida!");
				}
				
				break;
				
			case 3:
				System.out.println("Informe o núemro da conta para a qual deseja realizar o saque: ");
				consultaDeConta = leitor.nextInt();
				System.out.println("Informe o valor do saque: ");
				novoSaque = leitor.nextDouble();
				
				if (numerosDeConta.contains(consultaDeConta)) {
					indiceDaConta = numerosDeConta.indexOf(consultaDeConta);
					saldoAtual = saldosDasContas.get(indiceDaConta);
					
					if (saldoAtual >= novoSaque) {
						saldoAtual -= novoSaque;
						saldosDasContas.set(indiceDaConta, saldoAtual);
						resposta = String.format("Saque Realizado com sucesso! O novo saldo da conta %d é R$ %.2f",consultaDeConta,saldoAtual);
						System.out.println(resposta);
						
						saldoAtual = 0; // zera a variável para novas operações.
						
					} else {
						System.out.println("Saldo insuficiente.");
					}
					
				} else {
					System.out.println("Conta inválida!");
				}
				
				break;
				
			case 4:
				
				System.out.println("Informe o núemro da conta para a qual deseja consultar o saldo: ");
				consultaDeConta = leitor.nextInt();
				
				if (numerosDeConta.contains(consultaDeConta)) {
					indiceDaConta = numerosDeConta.indexOf(consultaDeConta);
					saldoAtual = saldosDasContas.get(indiceDaConta);
					
					resposta = String.format("O saldo atual da conta %d é R$ %.2f",consultaDeConta,saldoAtual);
					System.out.println(resposta);
				} else {
					System.out.println("Conta inválida!");
				}
				
				break;
				
			case 5:
				
				System.out.println("\n===== Contas Cadastradas =====\n");
				
				if (totalDeContas != 0) {
					for (int i = 0; i <= totalDeContas-1; i++) {
						
						numeroDeConta = numerosDeConta.get(i);
						nomeDoTitular = nomesDosTitulares.get(i);
						saldoAtual = saldosDasContas.get(i);
						
						resposta = String.format("Conta nº: %d | Titular: %s | Saldo: R$  %.2f",numeroDeConta,nomeDoTitular,saldoAtual);
						System.out.println(resposta);
						
					}
				} else {
					System.out.println("Não há contas cadastradas.");
				}
				
				
				break;
				
			default:
				
				if (opcao != 6 && opcao < 1 || opcao > 6) {
					
					System.out.println("Opção inválida!");
					
				}
				
				
			}
			
		}
		
		System.out.println("Você saiu do Menu. ");
		
		
		leitor.close();*/
	}

}
