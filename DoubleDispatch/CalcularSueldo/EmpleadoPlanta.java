package EJ4;

public class EmpleadoPlanta extends Empleado {
	boolean esCasado;
	int cantidadHijos = 0;
	int antiguedad = 0;
	
	final double DINERO_BASE = 50000;	
	final double DINERO_POR_HIJO = 2000;
	final double DINERO_POR_AÑO_ANTIGUEDAD = 2000;
	final double DINERO_ES_CASADO = 5000;
	
	public EmpleadoPlanta(boolean esCasado, int cantidadHijos, int antiguedad) {
		this.esCasado = esCasado;
		if(cantidadHijos > 0) {
			this.cantidadHijos = cantidadHijos;			
		}
		if(antiguedad > 0) {
			this.antiguedad = antiguedad;			
		}
	}

	@Override
	protected double getSueldoBasico() {
		return DINERO_BASE;
	}

	@Override
	protected double getSueldoAdicional() {
		double sueldoAdicional = 0;
		if (esCasado) {
			sueldoAdicional += DINERO_ES_CASADO;
		}
		return sueldoAdicional + (this.cantidadHijos * DINERO_POR_HIJO) 
				+ (this.antiguedad * DINERO_POR_AÑO_ANTIGUEDAD);	
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

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


}
