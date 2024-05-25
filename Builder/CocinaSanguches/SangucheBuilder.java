package ej22;

public class SangucheBuilder extends CocinaSangucheBuilder {

	@Override
	void agregarPan(Ingrediente ingrediente) {
		this.obtenerSanguche().setPan(ingrediente);
	}

	@Override
	void agregarAderezo(Ingrediente ingrediente) {
		this.obtenerSanguche().setAderezo(ingrediente);
	}

	@Override
	void agregarPrincipal(Ingrediente ingrediente) {
		this.obtenerSanguche().setPrincipal(ingrediente);
	}

	@Override
	void agregarAdicional(Ingrediente ingrediente) {
		this.obtenerSanguche().setAdicional(ingrediente);
	}



}
