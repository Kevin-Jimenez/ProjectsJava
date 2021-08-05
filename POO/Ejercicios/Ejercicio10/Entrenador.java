package Ejercicio10;

public class Entrenador extends Persona{
	private String estrategia;

	public Entrenador(String nombre, String apellidos, int edad, String estrategia) {
		super(nombre, apellidos, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}
	@Override
	public void partidoFutbol() {
		System.out.print("\nDirige el partido");
	}
	@Override
	public void entrenamiento() {
		System.out.println("Dirige el entrenamiento");
	}
	
	public void planificarEntrenamiento() {
		System.out.println("Planifica el entrenamiento");
	}

}
