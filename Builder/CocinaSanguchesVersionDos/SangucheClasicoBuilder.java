package ej22_1;

import ej22.Ingrediente;

public class SangucheClasicoBuilder extends CocinaBuilder {
	@Override
	void agregarPan() {
		this.obtenerSanguche().setPan(new Ingrediente("brioche", 100));
	}

	@Override
	void agregarAderezo() {
		this.obtenerSanguche().setAderezo(new Ingrediente("mayonesa", 20));
	}

	@Override
	void agregarPrincipal() {
		this.obtenerSanguche().setPrincipal(new Ingrediente("carne de ternera", 300));
	}

	@Override
	void agregarAdicional() {
		this.obtenerSanguche().setAdicional(new Ingrediente("tomate", 80));
	}
}
