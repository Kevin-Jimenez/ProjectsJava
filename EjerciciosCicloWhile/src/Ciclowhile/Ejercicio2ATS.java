package Ciclowhile;

import javax.swing.JOptionPane;
public class Ejercicio2ATS {
	public static void main(String[] args) {// leer numeros hasta que digite un 0
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero diferente de 0: "));
		
		while(number != 0) {// mientras sea distinto de 0
			 if(number % 2 == 0) { // si el numero es par
				 System.out.println("El numero "+number+" es par");
			 }else {
				 System.out.println("El numero "+number+" no es par");
			 }
			 number = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero diferente de 0: "));
		}
	}

}
