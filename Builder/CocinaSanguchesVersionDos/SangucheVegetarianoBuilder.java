package ej22_1;

import ej22.Ingrediente;

public class SangucheVegetarianoBuilder extends CocinaBuilder {
	@Override
	void agregarPan() {
		this.obtenerSanguche().setPan(new Ingrediente("semillas", 120));
	}

	@Override
	void agregarAderezo() {
		this.obtenerSanguche().setAderezo(null);
	}

	@Override
	void agregarPrincipal() {
		this.obtenerSanguche().setPrincipal(new Ingrediente("provoleta grillada", 200));
	}

	@Override
	void agregarAdicional() {
		this.obtenerSanguche().setAdicional(new Ingrediente("berenjena", 100));
	}
}
