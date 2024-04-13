package ej2;

public class Piedra extends Jugable{

	@Override
	public Resultado jugar(Jugable jugada) {
		return jugada.jugarContra(this);
	} 
	

	@Override
	public Resultado jugarContra(Piedra jugada) {
		return Resultado.EMPATE;
	}

	@Override
	public Resultado jugarContra(Tijera jugada) {
		return Resultado.VICTORIA;
	}

	@Override
	public Resultado jugarContra(Lagarto jugada) {
		return Resultado.VICTORIA;
	}	

}
