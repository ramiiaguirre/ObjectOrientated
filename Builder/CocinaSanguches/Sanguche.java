package ej22;

public class Sanguche {
	private IngredienteContent pan;
	private IngredienteContent aderezo;
	private IngredienteContent principal;
	private IngredienteContent adicional;
	
	public Sanguche() {
		this.pan = new IngredienteVacio();
		this.aderezo = new IngredienteVacio();
		this.principal = new IngredienteVacio();
		this.adicional = new IngredienteVacio();
	}
	
	public IngredienteContent getPan() {
		return this.pan;
	}
	public void setPan(IngredienteContent pan) {
		this.pan = pan;
	}
	public IngredienteContent getAderezo() {
		return this.aderezo;
	}
	public void setAderezo(IngredienteContent aderezo) {
		this.aderezo = aderezo;
	}
	public IngredienteContent getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(IngredienteContent principal) {
		this.principal = principal;
	}
	public IngredienteContent getAdicional() {
		return this.adicional;
	}
	public void setAdicional(IngredienteContent adicional) {
		this.adicional = adicional;
	}
	
	public double calcularPrecio() {
		return pan.getPrecio() + principal.getPrecio() +
				aderezo.getPrecio() + adicional.getPrecio();
	}
	
	/*
	public double calcularPrecio() {
		double valor = pan.getPrecio() + principal.getPrecio();
		if (aderezo != null) {
			valor += aderezo.getPrecio();
		}
		if (adicional != null) {
			valor += adicional.getPrecio();
		}
		return valor;
	}
	*/
	

}
