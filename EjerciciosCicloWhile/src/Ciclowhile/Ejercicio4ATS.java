package Ciclowhile;
// pedir numeros hasta que se introduzca uno negativo y calcular la media
import javax.swing.JOptionPane;

public class Ejercicio4ATS {
	public static void main(String[] args) {
		int number, ele=0, sum=0;
		float media;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		while(number > 0) {
			sum += number; //suma iterativa
			ele ++; // aumentamos elementos 
			
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		}
		if(ele == 0) {//division entre 0 no exite
			System.out.println("Error, la division entre 0 no existe");
		}else {
			media = (float)sum/ele;
			System.out.println("La media de los numero es: "+media); 
		}
	}

}
