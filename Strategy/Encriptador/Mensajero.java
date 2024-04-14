package ej10;

public class Mensajero {
	private Conexion conexion;

	public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
	
	public void enviar(String mensaje) {
		conexion.enviar(mensaje);
	}
}
