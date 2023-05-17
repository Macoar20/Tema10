package ejercicio1;

import java.util.Scanner;

public class Main {
	static Scanner all = new Scanner(System.in); // Abro scanner
	public static void main(String[] args) {
	int a = Utils.readInt(all);
	double b = Utils.readDouble(all);
	System.out.println("int:" + a);
	System.out.println("double:" + b);
	all.close();
	}
}