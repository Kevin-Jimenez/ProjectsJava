package ClaseMath;

public class Ejercicio4 {
	public static void main(String args[]) {
		
		double numberone = (Math.random()*50);
		double numbertwo = (Math.random()*50);
		
		int numberoneround = (int) Math.ceil(numberone);
		int numbertworound =(int) Math.round(numbertwo);
		
		System.out.println("Number 1: "+ numberoneround);
		System.out.println("Number 2: "+ numbertworound);
		
		System.out.println("El mayor es: "+ Math.max(numberoneround, numbertworound));
		
		
	}

}
