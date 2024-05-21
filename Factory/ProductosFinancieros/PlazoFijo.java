package ej17;

public class PlazoFijo extends ProductoFinanciero {

	private int cantidadDias;
	private double interes;
	
	public PlazoFijo(double interes, int cantidadDias) {
		this.cantidadDias = cantidadDias;
		this.interes = interes;
	}
	@Override
	public double retornoInversion(double montoInicial) {
		// TODO Auto-generated method stub
		return 0;
	}

}
