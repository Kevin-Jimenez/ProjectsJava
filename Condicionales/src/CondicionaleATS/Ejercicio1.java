package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String[] args) {
		int number, dato = 5;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		if(number == dato) {
			JOptionPane.showMessageDialog(null, "El numero es 5");
		}else {
			JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
		}
	}

}
