package ej19;

public class ArmaBaston extends Arma {
	@Override
	public int atacar(Armadura armadura) {
		return armadura.calcularDanio(this);
	}
}
