// pedir una nota y mostrar si es insuficiente, suficiente, bien. notable
// o sobresalinete

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio13 {
	public static void main(String[] args) {
		float nota;
		
		nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota: "));
		
		if(nota <= 59) {
			JOptionPane.showMessageDialog(null, "Lo siento tu "+nota+" es insuficiente");
		}else if((nota >= 60) && (nota <=69)) {
			JOptionPane.showMessageDialog(null, "Bien tu "+nota+" es suficiente");
		}else if((nota >= 70) && (nota <= 79)) {
			JOptionPane.showMessageDialog(null, "Bien tu "+nota+" es buena");
		}else if((nota >= 80) && (nota <= 89)) {
			JOptionPane.showMessageDialog(null, "Genial tu "+nota+" es notable");
		}else if((nota >= 90) && (nota <=100)) {
			JOptionPane.showMessageDialog(null, "Felicitaciones tu "+nota+" es sobresaliente");
		}else {
			JOptionPane.showMessageDialog(null, "Error, nota fuera de rango");
		}
	}

}
