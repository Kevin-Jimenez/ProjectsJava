/*pedir dia mes y a�o de una fecha e indicar si la fecha es corecta
 * suponiendo que todos lod meses son de 30 dias*/

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	public static void main(String[] args) {
		int dia, mes, a�o;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        a�o = Integer.parseInt(JOptionPane.showInputDialog("Digite el a�o: "));
        
        if((dia >= 1) && (dia <= 30)) {// si el dia es correcto
        	if((mes >= 1) && (mes <=12 )) {// si el mes es correcto 
        		if(a�o != 0) {// si el a�o es correcto
        			JOptionPane.showMessageDialog(null, "Fecha correcta");
        		}else {
        			JOptionPane.showMessageDialog(null, "El a�o es incorrecto");
        		}
        	}else {
        		JOptionPane.showMessageDialog(null, "El mes es incorrecto");
        	}
        	
        }else {
        	JOptionPane.showMessageDialog(null, "El dia es incorrecto");
        }
	}

}
