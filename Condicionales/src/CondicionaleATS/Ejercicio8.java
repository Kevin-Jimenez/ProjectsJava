// pedir dos numeros y decir si on par o impar

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio8 {
	public static void main(String[] args) {
		int number1, number2;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		if(number1 % 2 == 0 && number2 % 2 == 0) {
			System.out.println("Son pares");
		}else {
			System.out.println("Son impares");
		}
	}

}
