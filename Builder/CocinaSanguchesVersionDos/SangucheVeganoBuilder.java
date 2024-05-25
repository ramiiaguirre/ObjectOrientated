package ej22_1;

import ej22.Ingrediente;

public class SangucheVeganoBuilder extends CocinaBuilder {

	@Override
	void agregarPan() {
		this.obtenerSanguche().setPan(new Ingrediente("integral", 100));
	}

	@Override
	void agregarAderezo() {
		this.obtenerSanguche().setAderezo(new Ingrediente("salsa criolla", 20));
	}

	@Override
	void agregarPrincipal() {
		this.obtenerSanguche().setPrincipal(new Ingrediente("milanesa de girgolas", 500));
	}

	@Override
	void agregarAdicional() {
		this.obtenerSanguche().setAdicional(null);
	}

}
