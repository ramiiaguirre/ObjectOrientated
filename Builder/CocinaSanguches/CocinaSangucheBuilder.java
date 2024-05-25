package ej22;

public abstract class CocinaSangucheBuilder {
	
	private Sanguche sanguche;
	
	public CocinaSangucheBuilder() {
		this.sanguche = new Sanguche();
	}
	
	public void resetSanguche() {
		this.sanguche = new Sanguche();
	}
	
	public Sanguche obtenerSanguche() {
		return this.sanguche;
	}
	
	abstract void agregarPan(Ingrediente ingrediente);
	abstract void agregarAderezo(Ingrediente ingrediente);
	abstract void agregarPrincipal(Ingrediente ingrediente);
	abstract void agregarAdicional(Ingrediente ingrediente);
}
