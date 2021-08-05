package Ciclowhile;

import javax.swing.JOptionPane;

public class Ejercicio1ATS {
	public static void main(String[] args) {
		int numero,cuadrado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
		while(numero >= 0) {// mientras numero sea 0 o mayor
			cuadrado = (int)Math.pow(numero,2);
			
			JOptionPane.showMessageDialog(null, "El numero "+numero+" elevado al cuadro es: "+cuadrado);
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
		}
	}

}
