package RetornoDeValores;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int numero1,numero2;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		Operacion op = new Operacion();
		int suma = op.sumar(numero1, numero2);
		int resta = op.restar(numero1, numero2);
		int mult = op.multiplicacion(numero1, numero2);
		int div = op.division(numero1, numero2);
		op.mostrarDatos(suma, resta, mult, div);// se puede como esta arribo o como en ese system
		
		System.out.print("\n\n\nLa suma es: "+op.sumar(numero1, numero2));
	}

}
