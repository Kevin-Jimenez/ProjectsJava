package Ciclowhile;
import javax.swing.JOptionPane;

public class Ejercicio3ATS {
	public static void main(String[] args) {// Leer numeros e indicar si es positivo o negativo se repite hasta que se introduzca un 0
		int number;
		number = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
		
		while(number != 0) {// numero diferente de o
			if(number > 0) {
				JOptionPane.showMessageDialog(null, "El numero "+number+" es positivo");
			}else {
				JOptionPane.showMessageDialog(null, "El numero "+number+" es negativo");
			}
			number = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero"));
			
		}
		
	}

}
