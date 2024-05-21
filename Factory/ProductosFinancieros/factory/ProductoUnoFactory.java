package ej17.factory;

import ej17.CompraDolares;
import ej17.PlazoFijo;
import ej17.ProductoCombinado;
import ej17.ProductoFinanciero;

public class ProductoUnoFactory extends ProductoFinancieroFactory {

	@Override
	public ProductoFinanciero crearProducto(double interes, int cantidadDias, int parking) {
		ProductoCombinado producto = new ProductoCombinado();
		producto.agregarProducto(new CompraDolares());
		producto.agregarProducto(new CompraDolares());
		producto.agregarProducto(new PlazoFijo(interes, cantidadDias));
		return producto;
	}

}
