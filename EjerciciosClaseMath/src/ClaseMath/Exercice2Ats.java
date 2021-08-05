// Hacer un programa que calcule e imprima el salario semanal a partir
// de sus horas trabajadas y de su salario por hora

package ClaseMath;

import java.util.Scanner;

public class Exercice2Ats {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horastrabajadas;
		float sxhora , ssemanal, sdia;
		
		System.out.println("\n¡Bienvenido! ");
		System.out.print("\nIngrese el salario por hora: ");
		sxhora = entrada.nextFloat();
		System.out.print("\nIngrese horas trabajadas al dia: ");
		horastrabajadas = entrada.nextInt();
		
		sdia= sxhora * horastrabajadas;
		ssemanal = sdia*5;
		
		System.out.println("\nTu salario semanal es de: "+ssemanal);
		
		
		
	}

}
