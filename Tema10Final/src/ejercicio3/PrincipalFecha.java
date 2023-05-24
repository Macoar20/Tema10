package ejercicio3;

public class PrincipalFecha {

	public static void main(String[] args) throws IncorrectMonthException, IncorrectDayException {
		Fecha fechaVacia = new Fecha();
		Fecha fechaCompleta = new Fecha(31,12,2023);
		Fecha fechaErronea = new Fecha(30,2,2023);
		Fecha fechaErronea2 = new Fecha(30,15,2023);
		
		System.out.println("Fecha vacía: " + fechaVacia);
		System.out.println("Fecha completa: " + fechaCompleta);
		System.out.println("Fecha errónea: " + fechaErronea);
		System.out.println("Fecha errónea2: " + fechaErronea2);
		
		System.out.println(fechaVacia.fechaCorrecta());
		System.out.println(fechaCompleta.fechaCorrecta());
		System.out.println(fechaErronea.fechaCorrecta());
		
		fechaVacia.diaSiguiente();
		fechaCompleta.diaSiguiente();
		fechaErronea.diaSiguiente();
		System.out.println("Fecha vacía: " + fechaVacia);
		System.out.println("Fecha completa: " + fechaCompleta);
		System.out.println("Fecha errónea: " + fechaErronea);
		
		System.out.println(fechaVacia.fechaCorrecta());
		System.out.println(fechaCompleta.fechaCorrecta());
		System.out.println(fechaErronea.fechaCorrecta());
	}

}
