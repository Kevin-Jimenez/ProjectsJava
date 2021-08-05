package Ejercicio5;

public class Triangulo {
	private double lado;
	private double base;
	
	
	public Triangulo(double lado, double base) {
		this.lado = lado;
		this.base = base;
	}
	
	public double obtenerPerimetro() {
		double perimetro = 2*lado+base;
		return perimetro;
	}
	
	public double obtenerArea() {
		double area = (base*Math.sqrt((lado*lado) - ((base*base)/4 ))) /2;
		return area;
	}

}
