package Herencia;

public class Estudiante extends Persona{
	private int codigo;
	private float nota;
	
	public Estudiante(String nombre, String apellido, int edad, int codigo, float nota) {
		super(nombre, apellido, edad);
		this.codigo = codigo;
		this.nota = nota;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Edad: "+getEdad());
		System.out.println("Codigo estudiante:"+codigo);
		System.out.println("Nota final: "+nota);
	}
	
}
