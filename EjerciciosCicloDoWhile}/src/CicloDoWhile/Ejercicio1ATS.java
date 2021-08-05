package CicloDoWhile;
import javax.swing.JOptionPane;
public class Ejercicio1ATS {
	public static void main(String[] args) {// pedir numeros hasta que se teclee uno negativo y mostrar la suma de todos los que se introdicieron
		int number,sum=0;
		
		
		do {
			number = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numeros: "));
			sum += number;
		}while(number != 0); 
			
		JOptionPane.showMessageDialog(null, "La suma de los numeros que se introdujeron es: "+sum);
		//number = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numeros: "));
	}

}
