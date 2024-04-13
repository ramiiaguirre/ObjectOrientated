package ej2;

public class Main {

	public static void main(String[] args) {
		
		Jugable jugadorUno = new Spock();
		Jugable jugadorDos = new Tijera();
		
		Resultado resultado = jugadorUno.jugar(jugadorDos);
		
		switch (resultado) {
	        case VICTORIA: System.out.println("VICTORIA JUGADOR DOS");
	            break;
	        case DERROTA: System.out.println("VICTORIA JUGADOR UNO");
	            break;
	        case EMPATE: System.out.println("EMPATE");
	            break;
	        default: System.out.println("ERROR. RESULTADO INESPERADO");
		}	

	}

}
