/*Ejercico1: Construir un programa que permita optener el area y perimetro de un cuadrilatero*/

package Ejercicio1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Cuadrilatero c1;
		float lado1,lado2;
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite la lado 1"));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite la lado 2"));
		
		if(lado1 == lado2) {
			c1 = new Cuadrilatero(lado1);//Cuadrado
		}else {
			c1 = new Cuadrilatero(lado1, lado2);//Cuadrilatero
		}
		
		System.out.println("El perimetro es: "+c1.getPerimetro());
		System.out.println("El area es: "+c1.getArea());
	}

}
