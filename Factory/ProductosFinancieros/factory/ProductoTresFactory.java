package ej17.factory;

import ej17.CompraBonoAltoRiesgo;
import ej17.CompraBonoBajoRiesgo;
import ej17.PlazoFijo;
import ej17.ProductoCombinado;
import ej17.ProductoFinanciero;

public class ProductoTresFactory extends ProductoFinancieroFactory {

	@Override
	public ProductoFinanciero crearProducto(double interes, int cantDias, int parking) {
		ProductoCombinado producto = new ProductoCombinado();
		producto.agregarProducto(new CompraBonoBajoRiesgo(parking));
		producto.agregarProducto(new CompraBonoAltoRiesgo(parking));
		producto.agregarProducto(new PlazoFijo(interes, cantDias));
		return producto;
	}

}
