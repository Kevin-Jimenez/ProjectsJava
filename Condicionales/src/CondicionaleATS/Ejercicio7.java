/*Un obrero necesita calcular salario semanl
si trabaj 40 horas o menos se le paga 16 por hora
si trabaja mas de 40 se le paga 16 por las primeras 40 y 20 por cada extra
*/

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	public static void main(String[] args) {
		int horastrabajadas;
		float salariot;
		
		horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas trabajadas: "));
		
		if(horastrabajadas <= 40) {
			salariot = horastrabajadas * 16;
		}else {
			salariot = (40*16) + ((horastrabajadas-40)*20);
		}
		JOptionPane.showMessageDialog(null, "El salario total es: "+salariot);
	}

}
