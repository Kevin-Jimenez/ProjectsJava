package Ordenamientos;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {
	public static void main(String[] args) {
		int arreglo[] = {4,2,3,1,5};
		int dato;
		boolean band = false;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
		
		// busqueda secuencial
		int i=0;
		while(i<5 && band==false) {
			if(arreglo[i] == dato) {
				band = true;
			}
			i++;
		}
		
		if(band==false) {
			JOptionPane.showMessageDialog(null, "El numero no se encontro en el arreglo");
		}else {
			JOptionPane.showMessageDialog(null, "El numero a sido encontrado en la posicion: "+(i-1));
		}
	}
}
