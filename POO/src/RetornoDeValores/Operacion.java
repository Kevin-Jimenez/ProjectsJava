package RetornoDeValores;

public class Operacion {
	
	public int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	public int restar(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}
	public int multiplicacion(int num1, int num2) {
		int mult = num1 * num2;
		return mult;
	}
	public int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}
	
	public void mostrarDatos(int sumar,int restar,int multiplicacion, int division) {
		System.out.print("\nLa suma es: "+sumar);
		System.out.print("\nLa resta es: "+restar);
		System.out.print("\nLa multiplicacion es: "+multiplicacion);
		System.out.print("\nLa division es: "+division);
	}

}
