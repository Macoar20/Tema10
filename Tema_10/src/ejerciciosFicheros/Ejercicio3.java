package ejerciciosFicheros;

import java.io.*;
import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
		
			BufferedReader br = new BufferedReader(new FileReader("Alumnos"));
			String linea= br.readLine();
			int i=0;
			String[] edad= {"0","0","0"};
			String[] estatura={"0","0","0"};
			String[] separacion;
			int contador=0;
			String auxiliarDatos=null;
			String datos=br.readLine(); //ReadLine lee la frase y pasa a la siguiente
			System.out.println(datos);
			while (linea!=null) {
					
				switch (contador) { //Me guarda los valores en el array, ya que con cada vuelta es con una línea, sólo puedo guardar un dato de edad y de estatura por cada vuelta, por eso el contador.
					case 0:
				separacion=auxiliarDatos.split(" ");
				edad[0]=separacion[1];
				estatura[0]=separacion[2];
					break;
				case 1:	
					edad[1]=separacion[1]; //Claro, separación sólo tiene una sola línea; tendrías que hacer un Auxiliar para que te lea la siguiente.
					estatura[1]=separacion[2];
					break;
				case 2:
					edad[2]=separacion[1];
					estatura[2]=separacion[2];
				break;
				}
				System.out.println(linea);
				linea=br.readLine();
				auxiliarDatos=linea;
				contador++;
				
				}
			System.out.println(Arrays.toString(edad));
		}catch(IOException e){
			System.out.println("No se encontró el fichero en la ruta especificada");
	
}
	
}
}