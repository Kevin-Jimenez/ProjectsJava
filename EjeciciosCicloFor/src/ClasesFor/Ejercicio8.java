// pedir un numero y mostrar la tabla del mismo

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio8 {
	public static void main(String[] args) {
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 0 a 10: "));
        System.out.println("Tabla del: "+number);
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * " + i + " = "+number*i);
			
		}
	}

}
