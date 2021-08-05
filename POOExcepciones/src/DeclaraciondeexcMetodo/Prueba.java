package DeclaraciondeexcMetodo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba {
	public void leerArchivo() throws FileNotFoundException {
		File archivo = new File("c:\\Prueba\\Texto.txt");
		FileReader fr = new FileReader(archivo);
	}
	
	public void leerArchivo2() throws IOException {
		leerArchivo();
	}
	public static void main(String[] args) {
		
	}

}
