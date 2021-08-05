package SobreCargaDeMetodos;

public class Persona {
	String nombre;
	int edad;
	String dni;
	
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String dni) {
		this.dni = dni;
	}
	
	public void correr() {
		System.out.print("Soy "+nombre+" tengo "+edad+" años y estoy corriendo");
	}
	
	public void correr(int km) {
		System.out.print("\nHe corrido "+km+" kilometros");
	}
	
	
	

}
