package MetodoConstructor;

public class Persona {
	String nombre;
	int edad;
	
	
	public Persona(String nombre,int edad) {//Este es el constructor
		this.nombre = nombre;
		this.edad = edad;	
	}
	
	public void mostrarDatos() {
		System.out.print("\nEl nombre es: "+nombre);
		System.out.print("\nLa edad es: "+edad);
	}

}
