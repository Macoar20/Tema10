package ejerciciosFicheros;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			File fichero = new File(
					"D:\\Programas\\Nueva carpeta (6)\\Nueva carpeta (2)\\Tema10\\NumerosOrdenados.txt");
			BufferedWriter bn = new BufferedWriter(new FileWriter("Ejercicio6SinOrdenar"));
			if (!fichero.exists()) {
				fichero.createNewFile();
			}
			
			Scanner all = new Scanner(System.in);
			int anum[] = {};
			int num;
			int contador=0;
			System.out.println("Pon un número");
			num = all.nextInt();
			bn.write(num);
			bn.newLine();
			while (num <= 0 || num >= 0) { // Comprueba si es cualquier número y no una letra
				System.out.println("Pon el siguiente número, para que pare escribe una letra");
				try {
					num = all.nextInt();
					bn.write(num);
					bn.newLine();
					anum[contador]=num;
					contador++;
				} catch (InputMismatchException e) {
					break;

				}
			}
			contador=0;
			Arrays.sort(anum);
			BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"));
			while(contador<anum.length) {
				bw.write(anum[contador]);
				bw.newLine();
			}
			bn.flush();
			bn.close();
			bw.flush();
			bw.close();
			all.close();
		} catch (IOException e) {
			System.out.println("Error en el archivo");
			e.printStackTrace();
		}

	}
}