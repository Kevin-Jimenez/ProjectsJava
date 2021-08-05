/*Construir un programa para una competenciqa de atletismo, el programa debe gestionar una serie 
 * de atletas caracterizados por nombre, numeroatleta y tiempo de carrera, al final el programa debe mostrar
 * los datos del atleta ganador de la carrera*/

package Ejercicio4;

import java.util.Scanner;

public class Main {
	public static int atletaganador(Atleta corredores[]) {
		int indice = 0;
		float tiempo;
		
		tiempo = corredores[0].getTiempo();
		for(int i=1;i<corredores.length;i++) {
			if(corredores[i].getTiempo() < tiempo){
				tiempo = corredores[i].getTiempo();
				indice = i;
			}
		}
		
		return indice;
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int numero;
		float tiempo;
		int numAtletas,atletaganador;
		System.out.print("\nNumero de atletas que participaron: ");
		numAtletas = entrada.nextInt();
	
		Atleta corredores[] = new Atleta[numAtletas];
		for(int i=0;i<numAtletas;i++) {
			
			System.out.print("\n\t\tDigite los datos del corredor "+(i+1));
			System.out.print("\n\tDigite el numero del atleta: ");
			numero = entrada.nextInt();
			entrada.nextLine();
			System.out.print("\n\tDigite el nombre del atleta: ");
			nombre = entrada.nextLine();
			System.out.print("\n\tDigite el tiempo del atleta: ");
			tiempo = entrada.nextFloat();
			corredores[i] = new Atleta(numero,nombre,tiempo);
		}
		atletaganador = atletaganador(corredores);
		System.out.print("\n\t\t--- El ganador es ---");
		System.out.print("\n"+corredores[atletaganador].mostrarDatos());   

	}

}
