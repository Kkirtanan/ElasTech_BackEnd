package aulas_java;

import java.util.*;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int opcao = 0;
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
				System.out.println("Informe o número da conta para a qual deseja realizar o depósito: ");
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
				System.out.println("Informe o número da conta para a qual deseja realizar o saque: ");
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
				
				System.out.println("Informe o número da conta para a qual deseja consultar o saldo: ");
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
		
		
		leitor.close();

	}

}
