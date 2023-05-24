package ejercicio4_1;

import java.io.*;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner all = new Scanner(
			new FileReader("C:\\Users\\mdominguez\\git\\repository9\\Tema_10\\Enteros.txt"));
			double num = 0;
			double suma = 0;
			int vecesRepetidas = 1;
			double media = 0;
			while (all.hasNextDouble()) {
				num = all.nextDouble();
				suma += num;
				vecesRepetidas++;
			}
			media = suma / vecesRepetidas;
			System.out.println("suma; " + suma + " media; " + media);
			all.close();
		} catch (IOException e) {
			System.out.println("Error en el archivo");
		}
	}
}