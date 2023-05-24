package ejercicio2;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora() {
		
	}
	
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Hora(Hora h) {
		this.hora = h.hora;
		this.minuto = h.minuto;
		this.segundo = h.segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) throws NegativeHourException {
		if(hora>=0 && hora <=23 ) {
			this.hora = hora;
		}
		else {
			throw new NegativeHourException();
		}
	}
	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) throws NegativeMinuteException {
		if (minuto >=0) {
		this.minuto = minuto;}
		else {
			throw new NegativeMinuteException();
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) throws NegativeSecondException {
		if (segundo>=0) {
		this.segundo = segundo;
		}
		else {
			throw new NegativeSecondException();
		}
	}
	
	
}
