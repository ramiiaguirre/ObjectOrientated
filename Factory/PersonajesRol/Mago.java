package ej19;

public class Mago extends Personaje {

	public Mago(Arma arma, Armadura armadura) {
		super("Mago", arma, armadura);
	}
	
	@Override
	public void atacar(Personaje enemigo) {
		enemigo.recibirDanio(this.arma);
	}

}
