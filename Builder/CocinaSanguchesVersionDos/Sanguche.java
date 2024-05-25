package ej22;

public class Sanguche {
	private Ingrediente pan;
	private Ingrediente aderezo;
	private Ingrediente principal;
	private Ingrediente adicional;
	
	public Ingrediente getPan() {
		return pan;
	}
	public void setPan(Ingrediente pan) {
		this.pan = pan;
	}
	public Ingrediente getAderezo() {
		return aderezo;
	}
	public void setAderezo(Ingrediente aderezo) {
		this.aderezo = aderezo;
	}
	public Ingrediente getPrincipal() {
		return principal;
	}
	public void setPrincipal(Ingrediente principal) {
		this.principal = principal;
	}
	public Ingrediente getAdicional() {
		return adicional;
	}
	public void setAdicional(Ingrediente adicional) {
		this.adicional = adicional;
	}
	
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
	
	

}
