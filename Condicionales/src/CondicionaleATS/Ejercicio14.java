/*Hacer un programa que simule un cajero donde se pueda saldo inicial 1000
 * retirar
 * ingresar y salir*/
package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio14 {
	public static void main(String[] args) {
		final int saldoini = 1000000;
		int opcion ;
		float ingreso,saldoa, retiro;
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su Cajero Automatico\n"
				+ "       1. Ingresar dinero a la cuenta\n"
				+ "       2. Retirar dinero\n"
				+ "       3. Salir"));
		switch(opcion) {
		     case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desa ingresar: "));
		             saldoa = saldoini + ingreso;
		             JOptionPane.showMessageDialog(null, "Tu saldo es de: "+saldoa);
		             break;
		     case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Gigite la cantidad a retirar: "));
		     
		           if(retiro > saldoini) {
		        	   JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro");
		           }else {
		        	   saldoa = saldoini - retiro;
		        	   JOptionPane.showMessageDialog(null, "Saldo actual: "+saldoa);
		           }
		           break;
		     case 3: break;
		     default: JOptionPane.showMessageDialog(null, "Error, se equivoco de menu");
		}
	}

}
