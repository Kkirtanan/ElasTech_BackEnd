package aulas_java;

import java.util.Scanner;
import java.util.Arrays;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class ArraysEmJava {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//1. Criação e Acesso nos Extremos
		
		/*String [] lista = new String[5];
		lista [0] = "item1";
		lista [4] = "item5";
		
		System.out.println(lista [0]);
		System.out.println(lista [4]);*/
		
		
		//2. Modificação de um Valor Central
		
		/*int [] numeros = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(numeros));
		
		numeros [2] = 99;
		
		System.out.println(Arrays.toString(numeros));*/
		
		
		//3. Troca de Valores
		
		/*char [] caracteres = {'A','B'};
		System.out.println(Arrays.toString(caracteres));
		
		char caracterA = caracteres[0];
		caracteres[1] = caracterA;
		caracteres[0] = 'B';
		
		System.out.println(Arrays.toString(caracteres));*/
		
		
		//4. Acessando com Base no Tamanho
		
		/*Double [] lista = {1.5,5.6,4.8,6.8};
		System.out.println(lista.length);
		System.out.println(lista[lista.length-1]);*/
		
		
		//5. Simulação de Cópia Manual
		
		/*int [] arrayOriginal = {5,10,15};
		int [] arrayCopia = new int [3];
		
		arrayCopia [0] = arrayOriginal[0];
		arrayCopia [1] = arrayOriginal[1];
		arrayCopia [2] = arrayOriginal[2];
		
		System.out.println(Arrays.toString(arrayCopia));*/
		
		
		
		
		
		
		
		
		
		
		
		leitor.close();
	}

}
