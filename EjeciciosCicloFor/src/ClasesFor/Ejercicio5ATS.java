/*pedir 10 numeros mostrar lamedia de numeros positivos, la media de negativos y 
 * cantidad de 0*/

package ClasesFor;

import javax.swing.JOptionPane;

public class Ejercicio5ATS {
	public static void main(String[] args) {
		int number, sumpos=0, sumneg=0,contpos=0, contneg=0, conteo0=0;
		float mediapos,medianeg;
		
		for(int i = 1; i<=10;i++) {
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
			
			if(number == 0) {// si el numero es 0
				conteo0++;
			}else if(number > 0) {//si el numero es positivo
				sumpos += number;
				contpos++;
			}else {// es negativo
				sumneg += number;
				contneg++;
			}
		}
		
		// meedia de positivos
		if(contpos == 0) {
			System.out.println("No se puede sacar la media de positivos");
		}else {
			mediapos = (float) sumpos / contpos;
			System.out.println("La media de los positivos es: "+ mediapos);
		}
		
		// media de negativops
		if(contneg == 0) {
			System.out.println("No se puede sacar la media de negativos");
		}else {
			medianeg = (float) sumneg / contneg;
			System.out.println("La media de los negativos es: "+ medianeg);
		}
		
		System.out.println("La cantidad de 0 es: "+conteo0);
	}

}
