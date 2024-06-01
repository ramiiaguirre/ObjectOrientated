package oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej19.*;

class PersonajeTest {
	
	FabricaPersonaje fabrica;
	Personaje mago, guerrero, arquero, thoor;

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void GuerreroAtacaMagotest() {
		guerrero = new FabricaGuerrero().crearPersonaje();
		mago = new FabricaMago().crearPersonaje();
		guerrero.atacar(mago);
		assertEquals(92, mago.getVida());
	}
	
	@Test
	void MagoAtacaGuerrerotest() {
		guerrero = new FabricaGuerrero().crearPersonaje();
		mago = new FabricaMago().crearPersonaje();
		mago.atacar(guerrero);
		assertEquals(99, guerrero.getVida());
	}
	
	@Test
	void ArqueroAtacaMagotest() {
		arquero = new FabricaArquero().crearPersonaje();
		mago = new FabricaMago().crearPersonaje();
		arquero.atacar(mago);
		assertEquals(95, mago.getVida());
	}
	
	@Test
	void ThoorAtacaMagotest() {
		thoor = new FabricaThoor().crearPersonaje();
		mago = new FabricaMago().crearPersonaje();
		thoor.atacar(mago);
		assertEquals(80, mago.getVida());
	}
	
	@Test
	void GuerroAtacaThoortest() {
		thoor = new FabricaThoor().crearPersonaje();
		guerrero = new FabricaGuerrero().crearPersonaje();
		guerrero.atacar(thoor);
		assertEquals(95, thoor.getVida());
	}

}
