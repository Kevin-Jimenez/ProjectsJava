/*Hacer un programa que me permita pasar kg a otra unidad de medida 
 * hacer un menu para las diferentes posibilidades
 * */

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio15 {
	public static void main(String[] args) {
		int opcion;
		float kg, g, ton, lb, on;
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su convertidor de masas\n"
				+ "1. Kilogramo a Gramo\n"
				+ "2. Kilogramo a Tonelada\n"
				+ "3. Kilogramo a Libra\n"
				+ "4. Kilogramo a Onza"));
		
		switch(opcion) {
		       case 1: kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Kilos que desea convertir: "));
	                   g= kg *1000;  	   
	                   JOptionPane.showMessageDialog(null, kg+" Kilogramo Equivale a "+g +" Gramos");
	                   break;
		       case 2: kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Kilos que desea convertir: "));
		               ton = kg / 1000;
		               JOptionPane.showMessageDialog(null, kg+" Kilogramo Equivale a "+ton +" Toneladas");
		               break;
		       case 3: kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Kilos que desea convertir: "));
		               lb = kg * 2.205f;
		               JOptionPane.showMessageDialog(null, kg+" Kilogramo Equivale a "+lb +" Libras");
		               break;
		       case 4: kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Kilos que desea convertir: "));
                       on = kg * 35.274f;
                       JOptionPane.showMessageDialog(null, kg+" Kilogramo Equivale a "+on +" Onzas");
                       break;       
		       default:JOptionPane.showMessageDialog(null, "Error, se equivoco de opcion");     
		               
		               
		}
	}

}
