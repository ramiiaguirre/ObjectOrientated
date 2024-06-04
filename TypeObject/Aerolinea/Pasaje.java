 package ej23;

import java.time.LocalDate;
import java.util.List;

public class Pasaje {
	private Pasajero pasajero;
	private List<VueloObject> tramos;
	
	private LocalDate fecha;
	
	public Pasaje(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
}
