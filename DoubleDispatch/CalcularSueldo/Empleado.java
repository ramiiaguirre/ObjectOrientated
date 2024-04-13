package EJ4;

public abstract class Empleado {
	final double PORCENTAJE_DESCUENTO_BASICO = 0.13;
	final double PORCENTAJE_DESCUENTO_ADICIONAL = 0.05;	
	
	public double calcularSueldo() {
		return this.getSueldoBasico() + this.getSueldoAdicional() - this.getDescuentoSueldo();
	}
	
	abstract protected double getSueldoBasico();
	abstract protected double getSueldoAdicional();
	
	protected double getDescuentoSueldo() {
		return (PORCENTAJE_DESCUENTO_BASICO * this.getSueldoBasico())
				+ (PORCENTAJE_DESCUENTO_ADICIONAL * this.getSueldoAdicional());
	}
}