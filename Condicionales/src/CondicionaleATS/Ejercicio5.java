//hacer un programa que pida por teclado y comprube si es mayscula

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	public static void main(String[] args) {
		char leter;
		
		leter = JOptionPane.showInputDialog("Digite una letra").charAt(0);
		
		if(Character.isUpperCase(leter)) {
			JOptionPane.showMessageDialog(null, "Es mayuscula");
		}else {
			JOptionPane.showMessageDialog(null, "Es minuscula");
		} 
	}

}
