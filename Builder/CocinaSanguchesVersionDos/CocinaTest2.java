package oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej22_1.*;

class CocinaTest2 {

	CocinaDirector director;
	CocinaBuilder builder;
	
	@BeforeEach
	void setUp() throws Exception {
		director = new CocinaDirector(builder);
	}

	@Test
	void testSangucheClasico() {
		builder = new SangucheClasicoBuilder();
		director = new CocinaDirector(builder);
		director.hacerSanguche();
		assertEquals(500, builder.obtenerSanguche().calcularPrecio());		
	}
	
	@Test
	void testSangucheVegetariano() {
		builder = new SangucheVegetarianoBuilder();
		director.cambiarCocinaBuilder(builder);
	 	director.hacerSanguche();
		assertEquals(420, builder.obtenerSanguche().calcularPrecio());		
	}
	
	@Test
	void testSangucheVegano() {
		builder = new SangucheVeganoBuilder();
		director.cambiarCocinaBuilder(builder);
	 	director.hacerSanguche();
		assertEquals(620, builder.obtenerSanguche().calcularPrecio());		
	}
	
	@Test
	void testSangucheSinTACC() {
		builder = new SangucheSinTACCBuilder();
		director.cambiarCocinaBuilder(builder);
	 	director.hacerSanguche();
		assertEquals(618, builder.obtenerSanguche().calcularPrecio());		
	}

}
