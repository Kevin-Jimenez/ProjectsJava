//Encapsulamiento:  Poner los atributos de elas clases privados(OCULTOS)
//MetodosAccesores: Getters y Setters
package EncapsulamientoYMetodosAccesores;

public class Clase1 {
	private int edad;//Encapsulado
	private String nombre;
	
	public int getEdad() {//Getter mostrar edad
		return edad;
	}
	
	public void setEdad(int edad) {//Metodo Setter establecer edad
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
