package EJ4;

public class EmpleadoPasante extends Empleado{

	int cantidadExamenesRendidos;
	
	final double DINERO_BASE = 50000;
	final double DINERO_POR_EXAMEN = 2000;
	
	public EmpleadoPasante(int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}
	@Override
	protected double getSueldoBasico() {
		return 20000;
	}

	@Override
	protected double getSueldoAdicional() {
		return this.cantidadExamenesRendidos * DINERO_POR_EXAMEN;	
	}
	
	public int getCantidadExamenesRendidos() {
		return cantidadExamenesRendidos;
	}
	public void setCantidadExamenesRendidos(int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}

}
