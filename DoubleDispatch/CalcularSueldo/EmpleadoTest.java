package oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import EJ4.*;

class EmpleadoTest {
	
	Empleado empleadoTemporario;
	Empleado empleadoPasante;
	Empleado empleadoPlanta;

	@Test
	void testCalcularSueldoTemporario() {
		this.empleadoTemporario = new EmpleadoTemporario(10, true, 2);
		assertEquals(28560, empleadoTemporario.calcularSueldo());
	}
	
	@Test
	void testCalcularSueldoPasante() {
		this.empleadoPasante = new EmpleadoPasante(2);
		assertEquals(21200, empleadoPasante.calcularSueldo());
	}
	
	@Test
	void testCalcularSueldoPlanta() {
		this.empleadoPlanta = new EmpleadoPlanta(true, 2, 2);
		assertEquals(55850, empleadoPlanta.calcularSueldo());
	}
}
