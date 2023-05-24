package ejercicio4;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner ma = new Scanner(System.in);

		String palabras;

		BufferedWriter in = null;
		
		try {
			in = new BufferedWriter(new FileWriter(
					"C:\\\\Users\\\\mcosano\\\\git\\\\repository10\\\\Tema10\\\\NumerosReales"));
			
			
			boolean end = false;
			
			while (!end) {
				palabras = sca.nextLine();
				
				if (palabras.equals("fin")) {
					end = true;
				} else {
					in.write(palabras, 0, palabras.length());
					in.newLine();
				}
			
			}

		} catch (IOException e) {
			System.err.println("El archivo no se ha encontrado");
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
