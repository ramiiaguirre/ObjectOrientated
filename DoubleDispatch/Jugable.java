package ej2;

public interface Jugable {
	
	public Resultado jugar(Jugable jugable);	
	
	Resultado jugarContra(Piedra jugada);
	Resultado jugarContra(Papel jugada);
	Resultado jugarContra(Tijera jugada);
	Resultado jugarContra(Lagarto jugada);
	Resultado jugarContra(Spock jugada);
	
}
