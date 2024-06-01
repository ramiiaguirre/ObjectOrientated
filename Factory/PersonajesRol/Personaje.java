package ej19;

public abstract class Personaje {
	private String tipo;
	protected Arma arma;
	protected Armadura armadura;
	
	private int puntosVida;
	
	public Personaje(String tipo, Arma arma, Armadura armadura) {
		this.tipo = tipo;
		this.arma = arma;
		this.armadura = armadura;
		this.puntosVida = 100;
	}
	
	public abstract void atacar(Personaje enemigo);
	
	public void recibirDanio(Arma arma) {
		puntosVida = puntosVida - arma.atacar(this.armadura);
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getVida() {
		return puntosVida;
	}
	
}
