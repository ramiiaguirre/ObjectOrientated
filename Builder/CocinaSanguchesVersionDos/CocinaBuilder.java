package ej22_1;

import ej22.Sanguche;

public abstract class CocinaBuilder {
	
	private Sanguche sanguche;
	
	public void resetSanguche() {
		this.sanguche = new Sanguche();
	}
	
	public Sanguche obtenerSanguche() {
		return this.sanguche;
	}
	
	abstract void agregarPan();
	abstract void agregarAderezo();
	abstract void agregarPrincipal();
	abstract void agregarAdicional();
}
