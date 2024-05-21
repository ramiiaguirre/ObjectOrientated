package ej17.factory;

import ej17.*;

public class ProductoDosFactory extends ProductoFinancieroFactory {

	@Override
	public ProductoFinanciero crearProducto(double interes, int cantidadDias, int parking) {
		ProductoCombinado producto = new ProductoCombinado();
		producto.agregarProducto(new CompraBonoBajoRiesgo(parking));
		producto.agregarProducto(new CompraDolares());
		producto.agregarProducto(new PlazoFijo(interes, cantidadDias));
		producto.agregarProducto(new CompraPesos());
		return producto;
	}

}
