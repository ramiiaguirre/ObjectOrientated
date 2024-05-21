package ej17.factory;

import ej17.CompraBonoAltoRiesgo;
import ej17.ProductoCombinado;
import ej17.ProductoFinanciero;

public class ProductoCuatroFactory extends ProductoFinancieroFactory {

	@Override
	public ProductoFinanciero crearProducto(double interes, int cantDias, int parking) {
		ProductoCombinado producto = new ProductoCombinado();
		producto.agregarProducto(new CompraBonoAltoRiesgo(parking));
		producto.agregarProducto(new CompraBonoAltoRiesgo(parking));
		producto.agregarProducto(new CompraBonoAltoRiesgo(parking));
		return producto;
	}

}
