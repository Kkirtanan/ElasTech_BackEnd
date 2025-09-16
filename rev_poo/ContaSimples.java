package rev_poo;

public class ContaSimples {

	private double saldo;

	public ContaSimples(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double depositar(double valor) {
		if (valor > 0.0) {
			this.saldo += valor;
		} else if ( valor == 0.0 ){
			System.out.println("Não há valor para ser depositado");
		} else {
			System.out.println("Valor inválido");
		}
		return saldo;
	}
	
}
