package ClaseMath;

public class Exercice8ATS {
	public static void main(String[] args) {
		double a=1, b=0, c=-1, x1, x2;
		
		x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
	    x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.print("Soluciones de la ecuacion de segundo grado: ");
		System.out.println(a + "x2 + " + b + "x + " + c);
		System.out.println("La primera solucion es x1 = " + x1);
		System.out.println("La segunda solucion es x2 = " + x2);
		
	}

}
