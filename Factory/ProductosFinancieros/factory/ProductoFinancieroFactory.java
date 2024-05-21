package ej17.factory;

import ej17.ProductoFinanciero;

public abstract class ProductoFinancieroFactory {
	public abstract ProductoFinanciero crearProducto(double interes, int cantDias, int parking);

}
