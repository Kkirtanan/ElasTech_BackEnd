package aulas_java;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		

		System.out.println("Informe a sua altura em M: ");
		String alturaTexto = leitor.nextLine();
		double altura =  Double.parseDouble(alturaTexto);
		
		System.out.println("Informe o seu peso em KG: ");
		String pesoTexto = leitor.nextLine();
		double peso =  Double.parseDouble(pesoTexto);
		
		double alturaQuadrado = Math.pow(altura, 2);
		double imc = peso/alturaQuadrado;
		String categoria;
		
		if (imc < 17.0) {
			categoria = "Muito abaixo do peso";
		} else if (imc >= 17.0 && imc < 18.49) {
			categoria = "Abaixo do peso";
		} else if (imc >= 18.5 && imc < 24.99) {
			categoria = "Peso normal";
		} else if (imc >= 25.0 && imc < 29.99) {
			categoria = "Sobrepeso";
		} else if (imc >= 30.0 && imc < 34.99) {
			categoria = "Obesidade grau I";
		} else if (imc >= 35.0 && imc < 39.99) {
			categoria = "Obesidade grau II (severa)";
		} else {
			categoria = "Obesidade grau III (mórbida)";
		}
		
		String resposta = String.format("O seu IMC é %.2f e isso significa: %s.",imc,categoria);
		
		System.out.println(resposta);
		
		leitor.close();

	}

}
