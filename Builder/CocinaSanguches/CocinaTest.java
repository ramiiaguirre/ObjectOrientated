package oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej22.CocinaDirector;
import ej22.CocinaSangucheBuilder;
import ej22.SangucheBuilder;

class CocinaTest {

	CocinaSangucheBuilder builder;
	CocinaDirector director;
	
	@BeforeEach
	void setUp() throws Exception {
		builder = new SangucheBuilder();
		director = new CocinaDirector(builder);
	}

	@Test
	void testSangucheClasico() {
		director.hacerSangucheClasico();
		assertEquals(500, builder.obtenerSanguche().calcularPrecio());		
	}
	
	@Test
	void testSangucheVegetariano() {
		director.hacerSangucheVegetariano();
		assertEquals(420, builder.obtenerSanguche().calcularPrecio());		
	}
	
	@Test
	void testSangucheVegano() {
		director.hacerSangucheVegano();
		assertEquals(620, builder.obtenerSanguche().calcularPrecio());		
	}
	
	@Test
	void testSangucheSinTACC() {
		director.hacerSangucheSinTACC();
		assertEquals(618, builder.obtenerSanguche().calcularPrecio());		
	}

}
