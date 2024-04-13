package ej2;

public class Spock extends Jugable {

	 @Override
	public Resultado jugar(Jugable jugada) {
		return jugada.jugarContra(this);
	} 

	@Override
	public Resultado jugarContra(Piedra jugada) {
		return Resultado.VICTORIA;
	}

	@Override
	public Resultado jugarContra(Tijera jugada) {
		return Resultado.VICTORIA;
	}

	@Override
	public Resultado jugarContra(Spock jugada) {
		return Resultado.EMPATE;
	}	

}
