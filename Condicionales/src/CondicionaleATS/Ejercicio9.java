// pedir tres numeros y mosterarlos ordenados de mayor a menor

package CondicionaleATS;
import javax.swing.JOptionPane;

public class Ejercicio9 {
	public static void main(String[] args) {
		int number1, number2, number3;
	
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		number3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		if((number1 > number2) && (number2 > number3)) {
			JOptionPane.showMessageDialog(null, "Orden:\n "+number1+ "\n"+number2+"\n"+number3);
		}else if((number1 > number3) && (number3 > number2)) {
			JOptionPane.showMessageDialog(null, "Orden: \n "+number1+ "\n"+number3+"\n"+number2);
		}else if((number2 > number1) && (number1 > number3)) {
			JOptionPane.showMessageDialog(null, "Orden: \n "+number2+ "\n"+number1+"\n"+number3);
		}else if((number2 > number3) && (number3>number1)) {
			JOptionPane.showMessageDialog(null, "Orden:\n  "+number2+ "\n"+number3+"\n"+number1);
		}else if((number3 > number2) && (number2 > number1)) {
			JOptionPane.showMessageDialog(null, "Orden:\n  "+number3+ "\n"+number2+"\n"+number1);
		}else {
			JOptionPane.showMessageDialog(null, "Orden: \n "+number3+ "\n"+number1+"\n"+number2);
		}
		
	}

}
