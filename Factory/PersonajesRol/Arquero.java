package ej19;

public class Arquero extends Personaje {
	
	public Arquero(Arma arma, Armadura armadura) {
		super("Arquero", arma, armadura);
	}
	
	@Override
	public void atacar(Personaje enemigo) {
		enemigo.recibirDanio(this.arma);
	}

}
