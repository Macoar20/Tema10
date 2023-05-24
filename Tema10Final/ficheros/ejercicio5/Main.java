package ejercicio5;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		File datos = new File("C:\\\\Users\\\\mcosano\\\\git\\\\repository10\\\\Tema10\\\\NumerosReales");
		
		Scanner ma = new Scanner(System.in).useLocale(Locale.US);
		String palabras;
		
		if (!datos.exists()) {
			try {
				datos.createNewFile();
			} catch (Exception e) {
				System.err.println("Error en la creacion del fichero");
			}

		}

		BufferedWriter in = null;
		
		try {
			in = new BufferedWriter(new FileWriter
					("C:\\\\Users\\\\mcosano\\\\git\\\\repository10\\\\Tema10\\\\NumerosReales", true));
			
			System.out.println("Introduzca el nombre y la edad");
			palabras = sca.nextLine();
			
			in.write(palabras);
			in.newLine();
		} catch (IOException e) {
			System.err.println("No se ha encontrado el archivo");
		} finally {
			try {
				in.flush();
				in.close();
			} catch (IOException e) {
				System.err.println("Error al cerrar el archivo");
			}
		}
	}

}
