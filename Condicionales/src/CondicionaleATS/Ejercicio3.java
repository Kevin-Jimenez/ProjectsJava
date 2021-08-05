// hacer un programa que lea un numero entero y mostrar si es multiplo de 10

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		if (number % 10 == 0) {
			JOptionPane.showMessageDialog(null, "El numero "+number+" es multiplo de 10");
		}else {
			JOptionPane.showMessageDialog(null, "El numero "+number+" no es multiplo de 10");
		}
	}

}
