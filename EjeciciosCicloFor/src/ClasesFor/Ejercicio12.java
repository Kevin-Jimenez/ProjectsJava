// pedir 10 numeros y mostrar si se ha introducido algun negativo

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio12 {
	public static void main(String[] args) {
		int number,countn=0;
		
		for(int i=1; i<=10;i++) {
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero "+i+":"));
			
			if(number < 0) {
				countn++;
				JOptionPane.showMessageDialog(null, "Se introdujeron "+countn+" numeros negativos");
			}else {
				JOptionPane.showMessageDialog(null, "No se introdujeron negativos");
			}
		}
		
	}

}
