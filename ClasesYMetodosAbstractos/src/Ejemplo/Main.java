package Ejemplo;

public class Main {
	public static void main(String []args) {
		Planta planta = new Planta();
		AnimalCarnivoro animalC = new AnimalCarnivoro();
		
		planta.alimentarse();
		animalC.alimentarse();
	}

}
