package ParametrosYArgumentos;

import javax.swing.JOptionPane;

public class Operacion {
	int suma;
	int resta;
	int mult;
	int div;
	
	
	public void sumar(int numero1, int numero2) {
		suma = numero1 + numero2;
	}
	
	public void retsa(int numero1, int numero2) {
		resta = numero1 - numero2;
	}
	
	public void multiplicacion(int numero1, int numero2) {
		mult = numero1 * numero2;
	}
	
	public void division(int numero1, int numero2) {
		div = numero1 / numero2;
	}
	
	public void mostrarDatos() {
		System.out.print("\nLa suma es: "+suma);
		System.out.print("\nLa resta es: "+resta);
		System.out.print("\nLa multiplicacion es: "+mult);
		System.out.print("\nLa division es: "+div);
	}
}
