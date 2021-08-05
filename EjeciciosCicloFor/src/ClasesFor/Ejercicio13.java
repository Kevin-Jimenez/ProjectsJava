// pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio13 {
	public static void main(String[] args) {
		int nota=0;
		
		for(int i = 1; i <= 5; i++) {
			nota = Integer.parseInt(JOptionPane.showInputDialog("Digita la nota "+i+":"));  
		}
		if(nota <=4) {
			JOptionPane.showMessageDialog(null, "Hay notas en suspenso");
		}else {
			JOptionPane.showMessageDialog(null, "No hay ningun suspenso");
		}
		
	}

}
