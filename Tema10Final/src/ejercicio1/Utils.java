package ejercicio1;

import java.util.*;

public class Utils {

	public static int readInt(Scanner all) {
		int entero = 0;
		try {
			System.out.println("Introduce un número entero");
			entero = all.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es un int y por lo tanto será igual a 0");
			}
		finally {
			all.nextLine();
		}
		return entero;
	}
	
	public static double readDouble(Scanner all) {
		double decimal = 0;
		try {
			System.out.println("Introduce un número con decimales");
			decimal = all.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Será 0.0");
		}
		finally {
			all.nextLine();
		}
		return decimal;
	}
	
}
