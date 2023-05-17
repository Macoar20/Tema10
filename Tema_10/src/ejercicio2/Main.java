package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Hora h1 = new Hora();
		Hora h2 = new Hora(-5, -20, -30);
		Hora h3 = new Hora(h2);
	}

	public void setMinuto(int minuto) {
		minuto=-1;
	}
	
	public void setSegundo(int segundo) {
		segundo=-1;
	}
	
	public void setHora(int hora) {
		hora=-1;
	}
}
