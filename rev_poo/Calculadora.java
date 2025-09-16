package rev_poo;

public class Calculadora {

	public int somar(int a, int b) {
		return a+b;
	}
	
	public int subtrair(int a, int b) {
		return a-b;
	}
	
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
	public double dividir(int a, int b) {
		
		try {
		return a/b;
		} catch (ArithmeticException e){
			System.out.println("O segundo número não pode ser zero!");
			return Double.NaN;
		}
		
	}
	
}
