package ej17;

import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {

	List<ProductoFinanciero> productos;
	
	public ProductoCombinado() {
		productos = new ArrayList<ProductoFinanciero>();
	}
	
	@Override
	public double retornoInversion(double montoInicial) {
		return 0;
	}
	
	public void agregarProducto(ProductoFinanciero producto) {
		productos.add(producto);
	}

}
