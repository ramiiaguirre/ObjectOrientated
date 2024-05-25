package ej22;

public class CocinaDirector {
	private CocinaSangucheBuilder cocinaBuilder;
	
	public CocinaDirector(CocinaSangucheBuilder cocinaBuilder) {
		this.cocinaBuilder = cocinaBuilder;
	}
	
	public void hacerSangucheClasico() {
		this.cocinaBuilder.resetSanguche();
		this.cocinaBuilder.agregarPan(new Ingrediente("brioche", 100));
		this.cocinaBuilder.agregarAderezo(new Ingrediente("mayonesa", 20));
		this.cocinaBuilder.agregarPrincipal(new Ingrediente("carne de ternera", 300));
		this.cocinaBuilder.agregarAdicional(new Ingrediente("tomate", 80));
	}
	
	public void hacerSangucheVegetariano() {
		this.cocinaBuilder.resetSanguche();
		this.cocinaBuilder.agregarPan(new Ingrediente("con semillas", 120));
		this.cocinaBuilder.agregarPrincipal(new Ingrediente("provoleta grillada", 200));
		this.cocinaBuilder.agregarAdicional(new Ingrediente("berenjenas", 100));
	}
	
	public void hacerSangucheVegano() {
		this.cocinaBuilder.resetSanguche();
		this.cocinaBuilder.agregarPan(new Ingrediente("integral", 100));
		this.cocinaBuilder.agregarAderezo(new Ingrediente("salsa criolla", 20));
		this.cocinaBuilder.agregarPrincipal(new Ingrediente("milanesa de girgolas", 500));
	}
	
	public void hacerSangucheSinTACC() {
		this.cocinaBuilder.resetSanguche();
		this.cocinaBuilder.agregarPan(new Ingrediente("chipá", 150));
		this.cocinaBuilder.agregarAderezo(new Ingrediente("tártara", 18));
		this.cocinaBuilder.agregarPrincipal(new Ingrediente("carne de pollo", 250));
		this.cocinaBuilder.agregarAdicional(new Ingrediente("verduras grilladas", 200));
	}
	
	
}
