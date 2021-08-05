/*Calcular en numero de semanas, dias y horas equivalentes al numero de
 * horas que ingrese el usuario
 * */

package ClaseMath;

import java.util.Scanner;

public class Exercice7ATS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horast, semanas, dias, horas;
		
		System.out.print("Digite el numero de horas: ");
		horast = entrada.nextInt();
		
		semanas = horast / 168;
		dias = horast % 168 / 24;
		horas = horast % 24;
		
		System.out.println("El equivalente es:");
		System.out.println("Semanas: "+semanas);
		System.out.println("Dias: "+ dias);
		System.out.println("Horas: "+horas);
		
	}

}
