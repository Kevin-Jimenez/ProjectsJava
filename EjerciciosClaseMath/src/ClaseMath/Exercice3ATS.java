/*
 * Guillermo tiene n dolares, luis tiene la mitad de lo que posee guillermo
 * juan tine la mitad de lo que poseen luis y guillermo juntos, hacer
 * un programa que calcuole e imprima la cantidad de dinero que tienen los 3
 * */

package ClaseMath;

import java.util.Scanner;

public class Exercice3ATS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float guillermo, luis, juan ,total;
		
		System.out.print("Digite la cantidad de dinero que tiene Guillermo: ");
		guillermo = entrada.nextFloat();
		
		luis = guillermo / 2;
		juan = (guillermo + luis) / 2;
		total = guillermo + luis + juan;
		
		System.out.println("\nLa cantidad de dinero es: "+total);
	}

}
