// en megaplaza se hace un 20% descuetno a los clientes por compras mayores a 300
//¿cual es la cantidad a pagar?

package CondicionaleATS;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	public static void main(String[] args) {
		int price;
		
		price = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de su compra: "));
		
		if(price >= 3000) {
		   price *= 0.20f;
		   JOptionPane.showMessageDialog(null, "El valor de cumpro es de: "+price);
		}else {
		   JOptionPane.showMessageDialog(null, "El valor de cumpro es de: "+price);
		}
	}

}
