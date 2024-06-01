package ej19;

public class Guerrero extends Personaje {

	public Guerrero(Arma arma, Armadura armadura) {
		super("Guerrero", arma, armadura);
	}

	@Override
	public void atacar(Personaje enemigo) {
		enemigo.recibirDanio(this.arma);
	}

}
