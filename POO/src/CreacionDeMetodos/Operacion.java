package CreacionDeMetodos;

import javax.swing.JOptionPane;

public class Operacion {
	int numero1;
	int numero2;
	int suma;
	int resta;
	int mult;
	int div;
	
	
	public void leerNumeros() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
	    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
	}
	
	public void sumar() {
		suma = numero1 + numero2;
	}
	
	public void retsa() {
		resta = numero1 - numero2;
	}
	
	public void multiplicacion() {
		mult = numero1 * numero2;
	}
	
	public void division() {
		div = numero1 / numero2;
	}
	
	public void mostrarDatos() {
		System.out.print("\nLa suma es: "+suma);
		System.out.print("\nLa resta es: "+resta);
		System.out.print("\nLa multiplicacion es: "+mult);
		System.out.print("\nLa division es: "+div);
		
		
		
		
		
	}
}
