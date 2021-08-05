/*pedir dia mes y año de una fecha e indicar si la fecha es corecta
 * suponiendo que todos lod meses son de 30 dias*/

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	public static void main(String[] args) {
		int dia, mes, año;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if((dia >= 1) && (dia <= 30)) {// si el dia es correcto
        	if((mes >= 1) && (mes <=12 )) {// si el mes es correcto 
        		if(año != 0) {// si el año es correcto
        			JOptionPane.showMessageDialog(null, "Fecha correcta");
        		}else {
        			JOptionPane.showMessageDialog(null, "El año es incorrecto");
        		}
        	}else {
        		JOptionPane.showMessageDialog(null, "El mes es incorrecto");
        	}
        	
        }else {
        	JOptionPane.showMessageDialog(null, "El dia es incorrecto");
        }
	}

}
