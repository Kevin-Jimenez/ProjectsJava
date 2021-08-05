// pedir 10 sueldos mostrar la suma y cuantos son mayores al valor que
//yo decida

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	public static void main(String[] args) {
		float sueldos=0,suma = 0;
		float smas=0;
		
		for(int i = 1; i <=10; i++) {
			sueldos = Float.parseFloat(JOptionPane.showInputDialog("Digite sueldo: "));
			
			
			if(sueldos >= 1000000) {
				smas++;
			}
			
		}
		suma += sueldos;
		System.out.println("Suma de los sueldos: "+suma);
		System.out.println("El numero de sueldos superiores a 1.000.000 es: "+smas);
	}

}
