package ejercicio2;

public class MainNuevo {

	public static void main(String[] args) {

		Hora hora = new Hora(5, 20, 30);
		try {
			hora.setSegundo(-9);
		} catch (NegativeSecondException s) {
			// TODO Auto-generated catch block
			System.out.println("Segundo negativo");
		}
		try {
			hora.setMinuto(-12);
		} catch (NegativeMinuteException m) {
			System.out.println("Minuto negativo");
		}
		System.out.println(hora);
		try {
			hora.setHora(-1);
		} catch (NegativeHourException h) {
			System.out.println("Hora negativa");
		}
	}
}