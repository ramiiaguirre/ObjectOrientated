package ej19;

public class ArmaduraHierro extends Armadura {

	@Override
	public int calcularDanio(ArmaEspada arma) {
		return 5;
	}

	@Override
	public int calcularDanio(ArmaArco arma) {
		return 3;
	}

	@Override
	public int calcularDanio(ArmaBaston arma) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int calcularDanio(ArmaMartillo arma) {
		return 15;
	}

}
