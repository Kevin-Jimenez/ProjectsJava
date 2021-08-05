package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int dato;
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero de 1 a 5"));
		
		switch(dato){
		case 1: JOptionPane.showMessageDialog(null, "Es el 1");
		        break;
		case 2: JOptionPane.showMessageDialog(null, "Es el 2");
		         break;
		case 3: JOptionPane.showMessageDialog(null, "Es el 3 ");
                 break; 
		case 4: JOptionPane.showMessageDialog(null, "Es el 4");
                break; 
		case 5: JOptionPane.showMessageDialog(null, "Es el 5");
                break; 
                
        default:JOptionPane.showMessageDialog(null, "El numero no esta en el rango indicado");
		
		}
	}

}
