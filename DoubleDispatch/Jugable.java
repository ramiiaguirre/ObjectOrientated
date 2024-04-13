package ej2;

public abstract class Jugable {
	
	public abstract Resultado jugar(Jugable jugable);	
	
	Resultado jugarContra(Piedra jugada) {
		return Resultado.DERROTA;
	}
	Resultado jugarContra(Papel jugada) {
		return Resultado.DERROTA;
	}
	Resultado jugarContra(Tijera jugada) {
		return Resultado.DERROTA;
	}
	Resultado jugarContra(Lagarto jugada) {
		return Resultado.DERROTA;
	}
	Resultado jugarContra(Spock jugada) {
		return Resultado.DERROTA;
	}
	
}
