/*Crear un  programa para simular un equipo de funtbol(futbolista,entrenador y doctor), para lo cual tenemos lo siguiente
 * 1. una super clase Persona, que tendra los datos nombre, apellido y edad
 * 2. una sub clase futbolista tendra dorsal y posicion
 * 3. una sub clase Entrenador tedra como dato la estrartegia que ustiliza
 * 4. una sub clase Doctor, la titulacuion y años de experiencia
 * 
 * hacer un menu donde se tengan las siguientes opciones: Viaje de equipo, entrenamiento,partido, planificar entrnamiento, entrevis y curar lesion
 * 
 * */
package Ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner entrada = new Scanner(System.in);
	static Persona futbolista1 = new Futbolista("Cristiano","Ronaldo",25,7,"Delantero");
	static Persona futbolista2 = new Futbolista("Messi","Jr",25,10,"Delantero");
	static Persona entrenador = new Entrenador("Kevin","Jimenez",55,"Moderado");
	static Persona medico = new Medico("Jeisson","Valverde",32,"Licenciado de Fisicioterapia",5);
	
	public static void main(String[] args) {
		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(medico);
		
		menu();
	}
	
	public static void menu() {
		int opcion;
		do {
			System.out.print("\n\t.:MENU:.");
			System.out.print("\n1. Viaje de equipo");
			System.out.print("\n2. Entrenamiento");
			System.out.print("\n3. Partido de futbol");
			System.out.print("\n4. Planificar entrenamiento");
			System.out.print("\n5. Entrevista");
			System.out.print("\n6. Curar Lesion");
			System.out.print("\n7. Salir");
			System.out.print("\n   Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			       case 1:
			    	   System.out.println();
			    	   viajarEquipo();
			    	   break;
			       case 2:
			    	   System.out.println();
			    	   entrenarEquipo();
			    	   break;
			       case 3:
			    	   System.out.println();
			    	   partido();
			    	   break;
			       case 4:
			    	   System.out.println();
			    	   planificarEntrenamineto();
			    	   break;
			       case 5:
			    	   System.out.println();
			    	   entrevista();
			    	   break;
			       case 6:
			    	   System.out.println();
			    	   curarLesion();
			    	   break;
			       case 7:
			    	   break;
			    	   default: System.out.println("ERROR, Se equivoco de menu");
			    	   break;
			}
			System.out.println();
		}while(opcion != 7);
		
	}
	
	public static void viajarEquipo() {
		for(Persona equipo: persona) {
			System.out.print("\n"+equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
			equipo.viajar();
		}
	}

	public static void entrenarEquipo() {
		for(Persona equipo: persona) {
			System.out.print("\n"+equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
			equipo.entrenamiento();		
		}
	}
	
	public static void partido() {
		for(Persona equipo: persona) {
			System.out.print("\n"+equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
			equipo.partidoFutbol();	
		}
	}
	
	public static void planificarEntrenamineto() {
		System.out.println(entrenador.getNombre()+" "+entrenador.getApellidos());
		((Entrenador)entrenador).planificarEntrenamiento();
	}
	
	public static void entrevista() {
		System.out.println(futbolista1.getNombre()+" "+futbolista1.getApellidos());
		((Futbolista)futbolista1).entrevista();
		System.out.println(futbolista2.getNombre()+" "+futbolista2.getApellidos());
		((Futbolista)futbolista2).entrevista();
	}
	
	public static void curarLesion() {
		System.out.println(medico.getNombre()+" "+medico.getApellidos());
		((Medico)medico).curarLesion();
	}
}
