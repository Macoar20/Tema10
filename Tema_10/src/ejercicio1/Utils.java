package ejercicio1;

import java.util.*;

public class Utils {

	public static int readInt(Scanner all) {
		int ent = 0;
		try {
			System.out.println("Pon un número entero");
			ent = all.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Epa, el valor introducido no es tipo int, te lo convierto en 0");
			}
		finally {
			all.nextLine();
		}
		return ent;
	}
	
	public static double readDouble(Scanner all) {
		double d = 0;
		try {
			System.out.println("Pon un número con decimales incluso si quieres");
			d = all.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Me lo tomaré como un 0.0");
		}
		finally {
			all.nextLine();
		}
		return d;
	}
	
}
