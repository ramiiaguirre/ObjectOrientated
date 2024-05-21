package ej17;

import java.util.List;

public class Cliente {
	
	private String nombre;
	private MembresiaStrategy membresia;
	private List<ProductoFinanciero> productos;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.membresia = new MembresiaSilver(); //por defecto
	}
	
	public void setMembresia(MembresiaStrategy membresia) {
		this.membresia = membresia;
	}
	
	public void crearProductoUno() {
		productos.add(this.membresia.crearProductoUno());
	}
	
	public void crearProductoDos() {
		productos.add(this.membresia.crearProductoDos());
	}
	
	public void crearProductoTres() {
		productos.add(this.membresia.crearProductoTres());
	}
	
	public void crearProductoCuatro() {
		productos.add(this.membresia.crearProductoCuatro());
	}
}
