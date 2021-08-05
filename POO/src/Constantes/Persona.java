package Constantes;

public class Persona {
	private int edad; //variable
	private final String nombre;// constante
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.print("\nEL nombre es: "+nombre);
		System.out.print("\nLa edad es: "+edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
