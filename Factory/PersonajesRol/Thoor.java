package ej19;

public class Thoor extends Personaje {

	public Thoor(Arma arma, Armadura armadura) {
		super("Thoor", arma, armadura);
	}

	@Override
	public void atacar(Personaje enemigo) {
		enemigo.recibirDanio(this.arma);
	}

}
