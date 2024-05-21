package ej17;

import java.time.LocalTime;

public abstract class ProductoFinanciero {
	private LocalTime fechaOperacion;
	
	public abstract double retornoInversion(double montoInicial);
}
