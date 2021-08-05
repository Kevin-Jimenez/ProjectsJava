/* dada las edades y estaturas de 5 alumnos calcular la cantidade alumnos mayores
 * de 18 y la cantidad de alumnos quemidan mas de 1.75*/

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	public static void main(String[] args) {
		int edad,sumaedad=0,sumaaltura=0,conteo18=0,contador175=0;
		float altura,mediaedad,mediaaltura;
		
		for (int i =1;i <=5; i++) {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Digite su estatura: "));
			
			sumaedad += edad;// suma iterativa
			sumaaltura += altura; // suma iterativa
			
			if(edad > 18) {
				conteo18++;
			}
			if(altura > 1.75) {
				contador175++;
			}
		}
		mediaedad = (float) sumaedad / 5;
		mediaaltura = (float) sumaaltura /5;
		
		System.out.println("La edad promedio es: "+mediaedad);
		System.out.println("La estatura promedio es: "+mediaaltura);
		System.out.println("La cantidad de almnos mayores a 18 es: "+conteo18);
		System.out.println("La cantidad de alumnos que miden mas de 1.75: "+contador175);
	}

}
