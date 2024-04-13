package oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej6.*;

class TopografiaTest {
	
	Topografia tAgua;
	Topografia tTierra;
	Topografia tPantano;
	Topografia tMixta;
	Topografia tMixta2;
	
	@BeforeEach
	void setUp() throws Exception {
		tAgua = new TopografiaAgua();
		tTierra = new TopografiaTierra();
		tPantano = new TopografiaPantano();
		tMixta = new TopografiaMixta(tAgua, tTierra, tTierra, tAgua);
		tMixta2 = new TopografiaMixta(tAgua, tTierra, tTierra, tMixta);
	}

	@Test
	void testProporcionAgua()
	{
		assertEquals(1, tAgua.getProporcionAgua());
		assertEquals(0, tTierra.getProporcionAgua());
		assertEquals(0.5, tMixta.getProporcionAgua());
		assertEquals(0.375, tMixta2.getProporcionAgua());
		assertEquals(0.7, tPantano.getProporcionAgua());
	}
	
	@Test
	void testProporcionTierra()
	{
		assertEquals(0, tAgua.getProporcionTierra());
		assertEquals(1, tTierra.getProporcionTierra());
		assertEquals(0.5, tMixta.getProporcionTierra());
		assertEquals(0.625, tMixta2.getProporcionTierra());
		assertEquals(0.3, Math.round(tPantano.getProporcionTierra() * 100d) / 100d);
	}
	
	@Test
	void testComparacion() {
		assertFalse(tMixta.equals(tMixta2));
		assertFalse(tAgua.equals(tTierra));
		
		assertTrue(tPantano.equals(new TopografiaPantano()));
		
		Topografia tMixtaTemp = new TopografiaMixta(tAgua, tTierra, tTierra, tAgua);
		assertTrue(tMixta.equals(tMixtaTemp));		
	}
	

}
