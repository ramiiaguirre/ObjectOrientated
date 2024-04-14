package ej10;

public class ConexionSegura extends Conexion {
	private Encriptador encriptador;
	
	public ConexionSegura(Encriptador encriptador) {
		this.encriptador = encriptador;
	}
	
	@Override
	public void enviar(String mensaje) {
		String mensajeEncriptado = encriptador.encriptar(mensaje);
		super.enviar(mensajeEncriptado);
	}
}
