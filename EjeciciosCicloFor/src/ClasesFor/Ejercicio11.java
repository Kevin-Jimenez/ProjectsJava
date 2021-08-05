// pedir un numero n, introducir n sueldos y mostrar el saldo maximo

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	public static void main(String[] args) {
		int n;
		float sueldo=0,sumas=0,max=0;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de sueldos: "));
		
		for(int i=1; i <= n; i++) {
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo "+i+":"));
			sumas += sueldo;
			if(sueldo > max) {
				max = sueldo;
			}
		}
		 
		System.out.println("Total: "+sumas);
		System.out.println("El sueldo maximo es de: "+max);
	}

}
