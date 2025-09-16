package rev_poo;

public class Circulo extends FormaGeometrica {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	double calcularArea() {
		double area = 2*Math.PI*this.raio;
		return area;
	}

}
