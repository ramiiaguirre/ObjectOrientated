package ej19;

public class ArmaduraAcero extends Armadura {

	@Override
	public int calcularDanio(ArmaEspada arma) {
		return 3;
	}

	@Override
	public int calcularDanio(ArmaArco arma) {
		return 2;
	}

	@Override
	public int calcularDanio(ArmaBaston arma) {
		return 1;
	}

	@Override
	public int calcularDanio(ArmaMartillo arma) {
		return 10;
	}

}
