/*Hacer un programa que simule una calculadora
 * S-s Suma
 * R-r Resta
 * P-p-M-m Producto
 * D-d duvisuion
 * */

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio12 {
	public static void main(String[] args) {
		int number1, number2,suma,resta,mul,div;
		char operacion;
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2: "));
		operacion = JOptionPane.showInputDialog("Digite que operacion desea realizar: ").charAt(0);
		
		
		switch(operacion) {
		case 's':
		case 'S': suma = number1 +number2;
		          JOptionPane.showMessageDialog(null, "La suma es "+suma);
		          break;
		case 'r':  
		case 'R': resta = number1 - number2;
				  JOptionPane.showMessageDialog(null, "La resta es "+resta);
			      break;
		case 'P':
		case 'p':
		case 'M':
		case 'm': mul = number1 * number2;
				  JOptionPane.showMessageDialog(null, "La multiplicacion es "+mul);
			      break;
		case 'D':
		case 'd': div = number1 / number2;
					JOptionPane.showMessageDialog(null, "La division es "+div);
			        break;
		default: 
			JOptionPane.showMessageDialog(null, "Error, Operacion fuera de rango");
	        
		}
	}

}
