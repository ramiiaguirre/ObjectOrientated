package ej19;

public class ArmaMartillo extends Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.calcularDanio(this);
	}

}
