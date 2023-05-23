package ejerciciosFicheros;

import java.io.*;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			File fichero = new File ("D:\\Programas\\Nueva carpeta (6)\\Nueva carpeta (2)\\Tema10\\datos.txt");
			if (!fichero.exists()){
				fichero.createNewFile();
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"));
			Scanner all = new Scanner(System.in);
			String line;
			System.out.println("Pon tu nombre");
			line=all.next();
			bw.write(line);
			bw.newLine();
			System.out.println("Pon tu edad");
			line=all.next();
			bw.write(line);
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println("Error en el archivo");
			e.printStackTrace();
		}
	}
}