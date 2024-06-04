package ej23;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.*;

public class Avion {
	private int cantidadAsientos;
	private double capacidadCarga;
	private List<VueloObject> historialVuelos;
	
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	
	public void agregarVueloAlHistorial(VueloObject vuelo) {
		this.historialVuelos.add(vuelo);
	}
	
	public long getHorasVoladasTotales() {
		return this.historialVuelos.stream().mapToLong(v -> v.getDuracionVuelo()).sum();
	}
	
	public long getHorasVoladas(LocalDate fechaDesde, LocalDate fechaHasta) {
		return this.historialVuelos.stream()
				.filter(v -> v.estaDentroRango(fechaDesde, fechaHasta))
				.collect(Collectors.toList())
				.stream().mapToLong(v -> v.getDuracionVuelo()).sum();
	}
	
}
