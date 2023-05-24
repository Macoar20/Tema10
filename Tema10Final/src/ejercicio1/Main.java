package ejercicio1;

import java.util.Scanner;

public class Main {
	
	//Creo el escáner
	static Scanner all = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		int a = Utils.readInt(all);
	
		double b = Utils.readDouble(all);
	
		System.out.println("int:" + a);
	
		System.out.println("double:" + b);
	
		//Cierro el escáner
		all.close();
	}
}