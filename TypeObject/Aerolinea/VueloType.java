package ej23;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class VueloType {
	private String nombreVuelo;
	private String frecuencia;
	private String salida;
	private String arriba;
	private double costoBase;	
	
	private List<VueloObject> historialVuelos;
	
	public String getNombreVuelo() {
		return nombreVuelo;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public String getSalida() {
		return salida;
	}
	public String getArriba() {
		return arriba;
	}
	public double getCostoBase() {
		return costoBase;
	}
	
	public void agregarVueloAlHistorial(VueloObject vuelo) {
		this.historialVuelos.add(vuelo);
	}
	
	public double getPromedioOcupacion(LocalDate fechaDesde, LocalDate fechaHasta) {
		return this.historialVuelos.stream()
				.filter(v -> v.estaDentroRango(fechaDesde, fechaHasta))
				.collect(Collectors.toList())
				.stream().mapToDouble(v -> v.getDuracionVuelo()).average().orElse(0);
	}
}

