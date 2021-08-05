package ClaseMath;

public class Ejercicio3 {
	public static void main(String args[]) {
		
		double notauno = (int) (Math.random()*10);
		double notados = (int) (Math.random()*10);
		double notatres = (int) (Math.random()*10);
		double notacuatro = (int) (Math.random()*10);
		double notacinco = (int) (Math.random()*10);
		
		double promedio = (notauno + notados + notatres + notacuatro + notacinco) / 5;
		
		System.out.println("Promedio: "+ promedio);
		
		
	}

}
