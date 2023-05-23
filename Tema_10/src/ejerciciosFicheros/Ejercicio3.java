package ejerciciosFicheros;

import java.io.*;
import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) throws FileNotFoundException {
		try {

			BufferedReader br = new BufferedReader(new FileReader("Alumnos"));
			String linea = "";
			String[] auxlinea = {"","","",""};
			int mediaEdad=0;
			double mediaEstatura=0; 
			while ((linea = br.readLine()) != null) { //Me lee el fichero hasta el final, con el  auxiliar parto las líneas del fichero y recojo los datos que quiero.
				System.out.println(linea);
				auxlinea=linea.split(" ");
				mediaEdad+=Integer.parseInt(auxlinea[1]);
				mediaEstatura+=Double.parseDouble(auxlinea[2]);
			}
			br.close();
			//Hago la media de la suma de todos ellos y los divido entre 3
			System.out.println("\nMedia de la edad de los alumnos; " + mediaEdad/3);
			System.out.println("Media de la estatura de los alumnos; " + mediaEstatura/3);

		} catch (IOException e) {
			System.out.println("Error en el archivo");
		}
	}
}
