 package CicloDoWhile;
import javax.swing.JOptionPane;
public class Ejercicio2ATS {
	public static void main(String[] args) {
		
		int number, ale, count = 0;
		
		ale = (int)Math.random()*100;// generar un numero aleatorio del 1 al 100
		
		
		do {
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
			
			if(ale > number) {
				System.out.println("Digite un numero mayor: ");
			}else {
				System.out.println("Digite un numero menor: ");
			}
			count ++;
		}while(number != ale);
		
		JOptionPane.showMessageDialog(null, "\nGenial!!!, adivinaste el numero en "+count+" intentos");
	}

}
