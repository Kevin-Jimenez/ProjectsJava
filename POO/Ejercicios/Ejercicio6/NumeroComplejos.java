package Ejercicio6;

public class NumeroComplejos {
	//ejemplo 3 + 4i
	private double a;// parte real
	private double b;//parte imaginaria
	
	
	public NumeroComplejos(double a, double b) {
		this.a = a;
		this.b = b;
	}


	public double getA() {
		return a;
	}


	public double getB() {
		return b;
	}
	
	public NumeroComplejos calcularSuma(NumeroComplejos c) {
		NumeroComplejos suma = new NumeroComplejos(a+c.getA(), b+c.getB());
		return suma;
	}
	
	public NumeroComplejos calcularMultiplicacion(NumeroComplejos c) {
		NumeroComplejos multiplicacion = new NumeroComplejos((a*c.getA()-b*c.getB()),(a*c.getB()+b*c.getA()));
		return multiplicacion;
	}
	
	public boolean comprobarIgualdad(NumeroComplejos c) {
		boolean igualdad = false;
		if((a == c.getA()) && (b == c.getB())) {
			igualdad = true;
		}
		return igualdad;
	}
	
	public NumeroComplejos multiEntero(int x) {
		NumeroComplejos mult = new NumeroComplejos(a*x,b*x);
		return mult;
	}
	
	
	
	
	
	
	
	

}
