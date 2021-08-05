package Ejercicio4;

public class Atleta {
	private int numeroAtleta;
	private String nombre;
	private float tiempo;
	
	
	public Atleta(int numeroAtleta, String nombre, float tiempo) {
		super();
		this.numeroAtleta = numeroAtleta;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}


	public float getTiempo() {
		return tiempo;
	}
	
	public String mostrarDatos() {
		return "\nEl ganador es el atleta numero: "+numeroAtleta+"\nNombre: "+nombre+"\nCon un tiempo de: "+tiempo+"";
		
	}
	

}
