package ej22_1;

import ej22.Ingrediente;

public class SangucheSinTACCBuilder extends CocinaBuilder {
	@Override
	void agregarPan() {
		this.obtenerSanguche().setPan(new Ingrediente("chipá", 150));
	}

	@Override
	void agregarAderezo() {
		this.obtenerSanguche().setAderezo(new Ingrediente("salsa tártara", 18));
	}

	@Override
	void agregarPrincipal() {
		this.obtenerSanguche().setPrincipal(new Ingrediente("carne de pollo", 250));
	}

	@Override
	void agregarAdicional() {
		this.obtenerSanguche().setAdicional(new Ingrediente("verduras grilladas", 200));
	}
}
