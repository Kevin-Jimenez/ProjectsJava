package ParametrosYArgumentos;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int numero1,numero2;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		Operacion op = new Operacion();
		op.sumar(numero1, numero2);
		op.retsa(numero1, numero2);
		op.multiplicacion(numero1, numero2);
		op.division(numero1, numero2);
		op.mostrarDatos();
	}

}
