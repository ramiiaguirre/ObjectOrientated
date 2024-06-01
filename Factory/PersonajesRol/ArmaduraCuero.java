package ej19;

public class ArmaduraCuero extends Armadura {

	public ArmaduraCuero() {	
	}
	
	@Override
	public int calcularDanio(ArmaEspada arma) {
		return 8;
	}

	@Override
	public int calcularDanio(ArmaArco arma) {
		return 5;
	}

	@Override
	public int calcularDanio(ArmaBaston arma) {
		return 3;
	}

	@Override
	public int calcularDanio(ArmaMartillo arma) {
		return 20;
	}


}
