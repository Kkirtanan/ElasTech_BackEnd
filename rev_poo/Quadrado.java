package rev_poo;

public class Quadrado extends FormaGeometrica {

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}

}


