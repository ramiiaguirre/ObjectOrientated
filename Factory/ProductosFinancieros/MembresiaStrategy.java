package ej17;

import ej17.factory.*;

public abstract class MembresiaStrategy {

	protected ProductoFinancieroFactory factory;
	
	protected double INTERES;
	protected int DIAS;
	protected int PARKING;
		
	public ProductoFinanciero crearProductoUno() {
		factory = new ProductoUnoFactory();
		return factory.crearProducto(INTERES, DIAS, PARKING);
	}

	public ProductoFinanciero crearProductoDos() {
		factory = new ProductoDosFactory();
		return factory.crearProducto(INTERES, DIAS, PARKING);
	}

	public ProductoFinanciero crearProductoTres() {
		factory = new ProductoTresFactory();
		return factory.crearProducto(INTERES, DIAS, PARKING);
	}

	public ProductoFinanciero crearProductoCuatro() {
		factory = new ProductoCuatroFactory();
		return factory.crearProducto(INTERES, DIAS, PARKING);
	}
}
