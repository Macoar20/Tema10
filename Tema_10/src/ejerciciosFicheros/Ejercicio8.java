package ejerciciosFicheros;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner all = new Scanner(System.in);
		int opc = 0;
		String fecha;
		double tempmin;
		int tempmax;
		BufferedWriter bw=null;
		BufferedReader br = null;
		try {
			bw = new BufferedWriter(new FileWriter("src\\ejercicio4_1\\Temperaturas.txt", true));
		// Trues
		// es
		// para
		// que
		// añadas
		// más
		// y
		// no
		// te
		// machaque
		// en
		// el
		// documento.

			do {
				menu();
				all.nextInt();
				all.nextLine();

				switch (opc) {
				case 1:
					System.out.println("ponga fecha aaaa-mm-dd");
					fecha = all.nextLine();
					System.out.println("ponga min temp");
					tempmin = all.nextInt();
					all.nextLine();
					System.out.println("ponga max temp");
					tempmax = all.nextInt();
					all.nextLine();
					bw.write(fecha + " " + tempmin + " " + tempmax);
					break;
				case 2:
					String linea;
					br = new BufferedReader(new FileReader("src\\ejercicio4_1\\Temperaturas.txt"));
					linea=br.readLine();
					while (linea!=null) {
						linea=br.readLine();
					}
					
					linea=br.readLine();
					break;

				}
			} while (opc != 3);

			
		} catch (IOException e) {
			System.out.println("Error en el archivo");
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al abrir el ficheró");
			}
		}

	}

	static void menu() {
		System.out.println("1; Registrar nueva temperatura");
		System.out.println("2; Mostrar historial");
		System.out.println("3. Salir");
	}
}
