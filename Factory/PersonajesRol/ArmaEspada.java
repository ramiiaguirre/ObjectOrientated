package ej19;

public class ArmaEspada extends Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.calcularDanio(this);
	}

}
