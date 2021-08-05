// pedir tres notas y mostrar la suma de las calificaciones 
package ClaseMath;

import java.util.Scanner;

public class Exercice1Ats {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3,sum;
		System.out.print("Ingresa 3 calificaciones: ");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		sum = nota1 + nota2 + nota3;
		System.out.println("\nLa suma de sus calificaciones es: "+ sum);
		
		
		
	}

	
}
