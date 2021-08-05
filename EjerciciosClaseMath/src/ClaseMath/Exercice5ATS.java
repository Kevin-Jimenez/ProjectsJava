/*La calificacion de un estudiante se calcula en 4 aspectos 
 * participacion = 10%, parcial1 = 25%, parcial2 = 25% 
 * y examen final = 40%
 * hacer un programa que calcule e imprima la nota final
 * */

package ClaseMath;

import java.util.Scanner;

public class Exercice5ATS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float participacion, parcial1, parcial2, examenf, total;
		System.out.print("Digite la nota de participacion: ");
		participacion = entrada.nextFloat();
		System.out.print("\nDigite nota del primer parcial: ");
		parcial1 = entrada.nextFloat();
		System.out.print("Digite nota del segundo parcial: ");
		parcial2 = entrada.nextFloat();
		System.out.print("Digite la nota del examen final: ");
		examenf = entrada.nextFloat();
		
		participacion *= 0.10f;
		parcial1 *= 0.25f;
		parcial2 *= 0.25f;
		examenf *= 0.40f;
		
		total = participacion + parcial1 + parcial2 + examenf;
		
		System.out.println("\nSu nota final es de: "+total);
		
		
	}

}
