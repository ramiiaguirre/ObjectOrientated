package EJ4;

public class EmpleadoTemporario extends Empleado {

	int cantidadHorasTrabajo;
	boolean esCasado;
	int cantidadHijos = 0;
	
	final double DINERO_BASE = 20000;
	final double DINERO_POR_HORA = 300;	
	final double DINERO_POR_HIJO = 2000;
	
	public EmpleadoTemporario(int cantidadHorasTrabajo, boolean esCasado, int cantidadHijos)
	{
		this.cantidadHorasTrabajo = cantidadHorasTrabajo;
		this.esCasado = esCasado;
		if(cantidadHijos >= 0) {
			this.cantidadHijos = cantidadHijos;			
		}
	}
	
	@Override
	protected double getSueldoBasico() {
		return DINERO_BASE + (this.cantidadHorasTrabajo * DINERO_POR_HORA);
	}

	@Override
	protected double getSueldoAdicional() {
		double sueldoAdicional = 0;
		if (esCasado) {
			sueldoAdicional += 5000;
		}
		return sueldoAdicional + (this.cantidadHijos * DINERO_POR_HIJO);		
	}

	public int getCantidadHorasTrabajo() {
		return cantidadHorasTrabajo;
	}

	public void setCantidadHorasTrabajo(int cantidadHorasTrabajo) {
		this.cantidadHorasTrabajo = cantidadHorasTrabajo;
	}

	public boolean isEsCasado() {
		return esCasado;
	}

	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
}
