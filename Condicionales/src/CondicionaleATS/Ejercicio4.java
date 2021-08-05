// pedir 2 numeros y decir cual es mayor o si son iguales 

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	public static void main(String[] args) {
		int number1, number2;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		if(number1 > number2) {
			JOptionPane.showMessageDialog(null, "El numero "+number1+" es mayor que "+number2);
		}else if(number2 > number1) {
			JOptionPane.showMessageDialog(null, "El numero "+number2+" es mayor que "+number1);
		}else {
			JOptionPane.showMessageDialog(null, "Los numeros son iguales");
		}
	}

}
