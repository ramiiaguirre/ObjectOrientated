package ej22_1;

public class CocinaDirector {
	private CocinaBuilder builder;
	
	public CocinaDirector(CocinaBuilder builder) {
		this.builder = builder;
	}
	
	public void cambiarCocinaBuilder(CocinaBuilder builder) {
		this.builder = builder;
	}
	
	public void hacerSanguche() {
		this.builder.resetSanguche();
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();
	}
	
}
