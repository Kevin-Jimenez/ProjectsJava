package Ejercicio10;

public class Medico extends Persona{
	private String titulacion;
	private int anosExp;
	
	
	public Medico(String nombre, String apellidos, int edad, String titulacion, int anosExp) {
		super(nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.anosExp = anosExp;
	}


	public String getTitulacion() {
		return titulacion;
	}


	public int getAnosExp() {
		return anosExp;
	}
	@Override
	public void partidoFutbol() {
		System.out.println("Da asistencia");
	}
	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia");
	}
	
	public void curarLesion() {
		System.out.println("Curar lesion");
	}
	
	
	
	

}
