package TryCathc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Prueba {
	
	public void leerArchivo() throws FileNotFoundException, IOException{
		File archivo = new File("c:\\Prueba\\Text0o.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader bf = new BufferedReader(fr);
		String linea;
		
		while((linea = bf.readLine()) != null) {
			System.out.print(linea);
		}
	}
	
	public void leerArchivo2() {
		try {
			leerArchivo();
		}catch(FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor verifique la ruta");
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
		}
		
		System.out.println("\nPrograma Terminado");
	}
	
	public static void main(String[] args) {
		Prueba test = new Prueba();
		
		test.leerArchivo2();
	}
	


}
