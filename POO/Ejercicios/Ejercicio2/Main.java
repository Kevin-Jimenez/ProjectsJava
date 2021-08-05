/*Ejercicio2: Construir un programa que permita dirigir el movimiento 
 * de un objeto dentro de un tablero y actualece la posicion dentro del mismo. los movimientos posibles son
 * Arriba, Abajo,Izquierda y derecha. tras cada movimiento el programa mostrara la nueva direccion elejita y las coordinadas de situacion
 * del objeto dentro del tablero*/

package Ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Tablero t1;
		int x,y,opcion,incremento=0;
		
		System.out.print("Digite la cordenada inicial de X: ");
		x = entrada.nextInt();
		System.out.print("Digite la cordenada inicial de Y: ");
		y = entrada.nextInt();
		
		t1 = new Tablero(x,y);//posicion inicial
		
		do {
			System.out.println("\n\t\t--- .:MENU:. ---");
			System.out.print("\n\t1. Mover hacia ARRIBA");
			System.out.print("\n\t2. Mover hacia ABAJO");
			System.out.print("\n\t3. Mover hacia la DERECHA");
			System.out.print("\n\t4. Mover hacia la IZQUIERDA");
			System.out.print("\n\t5. Salir");
			System.out.print("\n\tOpcion: ");
			opcion = entrada.nextInt();
			
			if(opcion != 5) {
				System.out.print("\t\nDigite la cantidad de espacios a moverse: ");
				incremento = entrada.nextInt();
			}
			
			switch(opcion) {
			case 1:
				t1.moverArriba(incremento);
				break;
			case 2:
				t1.moverAbajo(incremento);
				break;
			case 3:
				t1.moverDerecha(incremento);
				break;
			case 4:
				t1.moverIzquierda(incremento);
				break;
				default:
					System.out.println("\t\tError, Se equivoco de opcion");
					break;
			}
			System.out.println("\t\t--- Posicion Actual --- \nX: "+t1.getX()+"\nY: "+t1.getY());
			
			
		}while(opcion != 5);

	}

}
