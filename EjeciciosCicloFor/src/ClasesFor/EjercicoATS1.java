package ClasesFor;
import java.util.Scanner;

public class EjercicoATS1 {
	public static void main(String[] args) {
		// preguntar al usuario hasta que numero quiere ver y mostrarlos de 2 en 2
		Scanner entrada = new Scanner(System.in);
		int contador;
		
		System.out.print("Digite la cantidad hasta la que desea ver: ");
		contador = entrada.nextInt();
		
		for(int i=0; i<=contador; i+=2) {// de uno en uno seria i++ 
			System.out.println(i);
		}
		
		
		
	}
	

}
