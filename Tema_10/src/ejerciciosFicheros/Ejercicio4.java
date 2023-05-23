package ejerciciosFicheros;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) throws FileNotFoundException {
		try {

			BufferedReader br = new BufferedReader(new FileReader("Ejercicio4"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ejercicio4"));
			Scanner all = new Scanner(System.in);
			String linea = "";
			System.out.println("Escribe la primera línea del fichero");
			linea = all.next();
			if (!linea.equals("fin")) {
				bw.write(linea);
				bw.newLine();
			}
			while (!linea.equals("fin")) {
				System.out.println("Escribe la siguiente línea del fichero, parará hasta que se introduzca \"fin\"");
				linea = all.next();
				if (!linea.equals("fin")) {
					bw.write(linea);
					bw.newLine();
				}
			}
			bw.flush();
			bw.close();
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);

			}
			br.close();
			all.close();
		} catch (IOException e) {
			System.out.println("Error en el archivo");
		}
	}
}