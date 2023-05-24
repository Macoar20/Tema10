package ejerciciosFicheros;

import java.io.*;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner ma = new Scanner(
			new FileReader("C:\\Users\\mcosano\\git\\repository10\\Tema_10\\Enteros.txt"));
			double num = 0;
			double suma = 0;
			int vecesRepetidas = 1;
			double media = 0;
			while (ma.hasNextDouble()) {
				num = ma.nextDouble();
				suma += num;
				vecesRepetidas++;
			}
			media = suma / vecesRepetidas;
			System.out.println("suma; " + suma + " media; " + media);
			ma.close();
		} catch (IOException e) {
			System.out.println("Error en el archivo");
		}
	}
}