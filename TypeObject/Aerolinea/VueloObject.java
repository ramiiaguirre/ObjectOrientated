package ej23;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class VueloObject {
	private VueloType vuelo;
	private Avion avion;
	
	private List<Boolean> asientos;	
	private double horasVoladas;
	private LocalDate horaSalida;
	private LocalDate horaLlegada;
	
	public VueloObject(VueloType type) {
		this.asientos = new ArrayList<Boolean>();
		this.vuelo = type;
		type.agregarVueloAlHistorial(this);
	}
	
	public void asignarAvion(Avion avion) {
		this.avion = avion;
		avion.agregarVueloAlHistorial(this);
	}

	public boolean hayAsientoDisponible() {
		if(asientos.size() < avion.getCantidadAsientos()) {
			return true;
		}
		return false;
	}
	
	public long getDuracionVuelo() {
		return horaLlegada.until(horaLlegada, ChronoUnit.HOURS); 
	}
	
	public double getPromedioOcupacion() {
		return asientos.size() / avion.getCantidadAsientos();
	}
	
	public boolean estaDentroRango(LocalDate fechaDesde, LocalDate fechaHasta) {
		if (this.horaSalida.isAfter(fechaDesde) && this.horaLlegada.isBefore(fechaHasta)) {
			return true;
		}
		return false;
	}
	
	
	
	
}
