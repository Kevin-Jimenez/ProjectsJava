/*Una empresa necesita un programa para gestion de facturas coduigoarticulo, cantidad vendida en litros y el rpecio por litro
 *se debe pedir 5 facturas y mostrar facturacion total, cantidad en litros y cuantas facturas son 
 *mayores de 600 */

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio9 {
	public static void main(String[] args) {
		int codigo,litros,litrosa1=0,cont6=0;
		float preciolitros,importef,facturaciontotal=0;
		
		for(int i=1; i<=5;i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite el codigo: "));
			litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite la cantidad de litros: "));
			preciolitros = Float.parseFloat(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite precio por litro: "));
			
			importef = (float) litros * preciolitros;// importe por factura
			facturaciontotal += importef; // suma iterativa
			
			if(codigo == 1) {
				litrosa1 += litros;
			}
			if(importef > 600) {
				cont6++;
			}
		}
		System.out.println("Facturacion total: "+facturaciontotal);
		System.out.println("Cantidad en litros vendidos del articulo: "+litrosa1);
		System.out.println("Facturas mayores de $600: "+cont6);
	}

}
